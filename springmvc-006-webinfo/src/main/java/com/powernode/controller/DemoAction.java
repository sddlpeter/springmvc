package com.powernode.controller;

import jakarta.servlet.http.HttpServletRequest;
import jdk.jfr.Frequency;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAction {
    @RequestMapping("/demo.do")
    public String action() {
        return "main";
    }

    @RequestMapping("/home.do")
    public String home() {
        return "home";
    }

    @RequestMapping("/login.do")
    public String login(String username, String password, HttpServletRequest request) {
        if ("admin".equals(username) && "123".equals(password)) {
            request.getSession().setAttribute("user", username);
            return "home";
        }
        request.setAttribute("msg", "username or password is incorrect...");
        return "login";
    }


    @RequestMapping("/showLogin.do")
    public String showLogin(String username, String password) {
        return "login";
    }
}
