package com.lxc.controller;

import com.lxc.entity.SyEmp;
import com.lxc.service.SyEmpService;
import com.lxc.utils.IMoocJSONResult;
import com.lxc.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {

    //跳转到登录页面模板
    @RequestMapping("/index")
    public String index(){
        return "thymeleaf/login.html";
    }

    @Autowired
    private SyEmpService ss;

    //员工登入
    @RequestMapping("/login")
//    @PostMapping("/login")
    public String login(SyEmp emp, HttpSession session){
        SyEmp syEmp = ss.login(emp);
        if(syEmp!=null){
            //用户名密码正确
            session.setAttribute("emp",syEmp);
            return "redirect:/menu/selectAll";
        }else{
            return index();
        }
    }

}
