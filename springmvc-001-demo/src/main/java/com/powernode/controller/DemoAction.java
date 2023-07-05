package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAction {
    @RequestMapping(value = "*")
    public String demo() {
        System.out.println("服务器被访问到了...");
        return "main";
    }
}
