package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAction1 {
    @RequestMapping("/user.do")
    public String demo() {
        System.out.println("user 服务器被访问了...");
        return "user";
    }
}
