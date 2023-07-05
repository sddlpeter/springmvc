package com.powernode.controller;

import com.powernode.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class DemoAction {
    @RequestMapping("/demo.do")
    public String demo() {
        return "main";
    }

    @RequestMapping("/one.do")
    public String one() {
        System.out.println("one() method is invoked...");
        return "main";
    }

    @RequestMapping("/two.do")
    public String two() {
        System.out.println("two() method is invoked...");
        return "forward:/other.do";
    }

    @RequestMapping("/three.do")
    public String three() {
        System.out.println("three() method is invoked...");
        return "redirect:/pages/other.jsp";
    }

    @RequestMapping("/four.do")
    public String four() {
        System.out.println("four() method is invoked...");
        return "redirect:/other.do";
    }

    @RequestMapping("/five.do")
    public String five() {
        System.out.println("five() method is invoked...");
        return "forward:/other.do";
    }

    @RequestMapping("/data.do")
    public String data(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, Map map, ModelMap modelMap) {
        User user = new User("zhang san", 22);
        request.setAttribute("requestUser", user);
        session.setAttribute("sessionUser", user);
        model.addAttribute("modelUser", user);
        map.put("mapUser", user);
        modelMap.addAttribute("modelMapUser", user);
        return "main";
    }
}