package com.powernode.controller;

import com.powernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAction {

    @Autowired
    UserService userService;

    @RequestMapping("/user.do")
    public String demo() {
        System.out.println("demo() method is invoked...");
        userService.selectUserPage("", "", 0);
        return "main";
    }
}
