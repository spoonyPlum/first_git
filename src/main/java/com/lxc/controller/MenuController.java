package com.lxc.controller;

import com.lxc.entity.SyEmp;
import com.lxc.entity.SyMenu;
import com.lxc.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private SyMenuService ss;

    //查询菜单
    @RequestMapping("selectAll")
    public String selectAll(HttpSession session){

        //查询菜单
        Object object =  session.getAttribute("emp");
        if(object!=null) {
            SyEmp emp = (SyEmp) object;
            List<SyMenu> list = ss.selectAllByEmpId(emp.getId());

            List<List<SyMenu>> MenuList = new ArrayList<>();

            for (SyMenu m : list
                    ) {
                if (m.getParent() == null) {
                    List<SyMenu> childList = new ArrayList<>();
                    childList.add(0, m);
                    for (SyMenu e : list
                            ) {
                        if (m.getId() == e.getParent()) {
                            childList.add(e.getOrderindex(), e);
                        }
                    }
                    MenuList.add(m.getOrderindex() - 1, childList);
                }
            }
            List<SyMenu> testlist = MenuList.get(0);
            session.setAttribute("MenuList", MenuList);
        }
        return "/thymeleaf/workspace";
    }
}
