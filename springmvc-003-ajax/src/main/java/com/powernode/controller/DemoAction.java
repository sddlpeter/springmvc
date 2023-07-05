package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAction {
    @RequestMapping("/demo.do")
    public String demo() {
        return "main";
    }
}
