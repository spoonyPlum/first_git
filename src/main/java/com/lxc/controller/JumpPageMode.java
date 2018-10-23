package com.lxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpPageMode {
    @RequestMapping("/redirect")
    public String redirect(String path){
        System.err.println("path : "+   path);
        return "thymeleaf/"+path;
    }
}
