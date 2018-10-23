package com.lxc.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lxc.entity.BeOrder;
import com.lxc.entity.BeOrderAndBeOrderUser;
import com.lxc.entity.BeOrderuser;
import com.lxc.entity.SyEmp;
import com.lxc.service.BeOrderService;
import com.lxc.service.BeOrderuserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/beOrder")
public class BeOrderController {

    @Autowired
    private BeOrderService os;

    @Autowired
    private BeOrderuserService bos;

    @RequestMapping("/insert")
    public String insert(BeOrderAndBeOrderUser beOrderAndBeOrderUser, HttpSession session, ModelMap map){
        System.out.println("用户申请-新户");
        //业扩工单
        BeOrder order = beOrderAndBeOrderUser.getOrder();
        //工单类型 1 新户
        order.setOrdertype(1);
        //步骤
        order.setStepid(2);
        //工单创建人
        SyEmp emp = (SyEmp) session.getAttribute("emp");
        order.setCreateemp(emp.getId());
        //工单创建日期
        order.setCreatedate(new Date());

        List<BeOrderuser> list = new ArrayList<>();
        String[] bouname = beOrderAndBeOrderUser.getBouName();
        String[] bouPone = beOrderAndBeOrderUser.getBouhPone();
        String[] bouSmsPhone = beOrderAndBeOrderUser.getBouSmsPhone() ;
        String[] bouAddress = beOrderAndBeOrderUser.getBouAddress();
        //判断没有新户详情信息，保证只少有一条
        if(bouname.length==0 && bouPone.length==0 && bouSmsPhone.length==0 && bouAddress.length==0){
            list.add(new BeOrderuser(order.getUsername(),order.getPhone(),order.getPhone(),order.getAddress(),order.getMetertypeid()));
        }else{
            for (int i = 0; i < beOrderAndBeOrderUser.getBouName().length; i++) {
                list.add(new BeOrderuser(bouname[i],bouPone[i],bouSmsPhone[i],bouAddress[i],order.getMetertypeid()));
            }
        }
        int result =  os.insert(order,list);
        if(result>0) {
            map.addAttribute("msg","操作成功");
        }else{
            map.addAttribute("msg","操作失败");
        }
        map.addAttribute("path","/page/be__request");
        return "/thymeleaf/result";
    }

    //根据步骤查询全部工单
    @RequestMapping("/selectAllByStepId")
    public String selectAllByStepId(Integer stepId,String path,Integer page,ModelMap map,Integer count){
        if(page==null){
            page = 1;
        }else if(page<1){
            page = 1;
        }else if(page>count){
            page = count;
        }
        Page p = PageHelper.startPage(page,3);
        Example example = new Example(BeOrder.class);
        Example.Criteria criteria =  example.createCriteria();
        criteria.andEqualTo("stepid",stepId);
        example.orderBy("createdate").desc();

        List<BeOrder> list = os.selectAllByStepId(example);
        for (BeOrder o:list
                ) {
            System.out.println(o);
        }
        long Total = p.getTotal()%3==0?p.getTotal()/3:p.getTotal()/3+1;
        System.out.println("count:"+count);
        map.addAttribute("Total",Total);
        map.addAttribute("page",page);
        map.addAttribute("list",list);
        return "thymeleaf"+path;


    }

    //初步核审处理(发送)
    @RequestMapping("/updateStep")
    public String updateStep(BeOrder order,HttpSession session){
        System.out.println(order);
        Object object = session.getAttribute("emp");
        if(object!=null){
            SyEmp emp = (SyEmp) object;
            //审核人
            order.setAuditempid(emp.getId());
        }
        //步骤改为3(交施工费)
        order.setStepid(3);
        os.updateStep(order);
        return "redirect:/beOrder/selectAllByStepId?stepId=2&path=/page/be__audit";
    }

    //初步核审处理(撤回)
    @RequestMapping("/del")
    public String del(String orderno){
        System.out.println(orderno);
        os.del(orderno);
        return "redirect:/beOrder/selectAllByStepId?stepId=2&path=/page/be__audit";
    }

    @RequestMapping("/selectAllById")
    public String selectAllById(BeOrder order,ModelMap map){
        System.out.println("orderNo: "+order);
        map.put("order",order);
        List<BeOrderuser> list = bos.selectAllByOrderNo(order.getOrderno());
        map.put("list",list);
        return "thymeleaf/page/be__payForm.html";
    }
}
