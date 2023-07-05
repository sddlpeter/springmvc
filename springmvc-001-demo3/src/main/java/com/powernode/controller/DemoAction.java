package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAction {
    @RequestMapping("/main.do")
    public String demo() {
        System.out.println("DemoAction 被访问到了...");
        return "main";
    }
}
