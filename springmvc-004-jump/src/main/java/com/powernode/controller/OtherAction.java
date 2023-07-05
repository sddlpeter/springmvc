package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherAction {

    @RequestMapping("/other.do")
    public String other() {
        System.out.println("other() method is invoked...");
        return "other";
    }
}
