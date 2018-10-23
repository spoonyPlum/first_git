package com.lxc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lxc.entity.BeOrder;
import com.lxc.entity.BeOrderuser;
import com.lxc.mapper.BeOrderMapper;
import com.lxc.mapper.BeOrderuserMapper;
import com.lxc.service.BeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;
import tk.mybatis.mapper.entity.Example;

import java.io.*;
import java.sql.Date;
import java.util.List;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BeOrderServiceImpl implements BeOrderService {

    @Autowired
    private BeOrderMapper om;

    @Autowired
    private BeOrderuserMapper oum;

    @Override
    public int insert(BeOrder order, List<BeOrderuser> list) {
        String orderNo = generatorPrimaryKey(order.getOrdertype());
        System.out.println("生成的主键 ："+ orderNo);
        order.setOrderno(orderNo);
        for (BeOrderuser be:list){
            be.setOrderno(orderNo);
        }
        int result = 1;
        for (BeOrderuser be:list){
            System.out.println(be);
        }
        try {
            oum.insertList(list);
            om.insert(order);
        } catch (Exception e) {
            e.printStackTrace();
            result=0;
        }

        return result;
    }

    @Override
    public int updateStep(BeOrder order) {
        return om.updateByPrimaryKeySelective(order);
    }

    public List<BeOrder> selectAllByStepId(Example example) {
        List<BeOrder> list = om.selectByExample(example);
        return list;
    }

    // orderno生成
    public  String generatorPrimaryKey(int OrderType){
        StringBuffer sb = new StringBuffer();
        switch (OrderType){
            case 1:
                sb.append("XH-");
                break;
        }
        sb.append(new Date(System.currentTimeMillis()).toString()+"-");
        sb.append("0001");
        String key = readKey();
        if(!"".equals(key) || key != null){
            String reg = new Date(System.currentTimeMillis()).toString();
            String reg1 = key.substring(3);
            reg1 = reg1.substring(0,reg1.lastIndexOf("-"));
            if(reg.equals(reg1)){
                String strnum = key.substring(key.lastIndexOf("-")+1);
                Integer num = Integer.parseInt(strnum);
                num++;
                int length = 4-(num.toString().length());
                String bufix = "";
                for (int i = 0; i < length; i++) {
                    bufix +="0";
                }
                sb = new StringBuffer(key.substring(0,key.lastIndexOf("-")+1)+bufix+num);
            }
        }
        //生成的主键写入txt文档保存
        writeKey(sb.toString());
        return sb.toString();
    }

    public String readKey(){
        InputStream is = null;
        try {
          File file = ResourceUtils.getFile("classpath:datafile/CustomPrimaryKey.txt");
          is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] b = new byte[4];
        String key="";
        try {
            int len = is.read(b);
            while(len!=-1){
                key+=new String(b,0,len);
                len = is.read(b);
            }
            is.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return key;
    }

    @Override
    public int del(String orderno) {
        Example example = new Example(BeOrderuser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("orderno",orderno);
        oum.deleteByExample(example);
        return om.deleteByPrimaryKey(orderno);
    }


    public void writeKey(String key){
        try {
            File file = ResourceUtils.getFile("classpath:datafile/CustomPrimaryKey.txt");
            Writer w = new FileWriter(file);
            w.write(key);
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
