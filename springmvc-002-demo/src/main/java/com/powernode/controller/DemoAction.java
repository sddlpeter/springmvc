package com.powernode.controller;

import com.powernode.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoAction {
    @RequestMapping("/main.do")
    public String demo() {
        System.out.println("demo function is invoked, jump to main page...");
        return "main";
    }

    @RequestMapping("/one.do")
    public String one(String name, int age) {
        System.out.println("name=" + name + ", age=" + (age + 100));
        return "main";
    }

    @RequestMapping("/two.do")
    public String two(User user) {
        System.out.println(user);
        return "main";
    }

    @RequestMapping("/three/{name}/{age}.do")
    public String three(@PathVariable("name") String name, @PathVariable("age") int age) {
        System.out.println("name=" + name + ", age=" + (age + 100));
        return "main";
    }

    @RequestMapping("/four.do")
    public String four(@RequestParam("name") String yourName, @RequestParam("age") int yourAge) {
        System.out.println("YourName=" + yourName + ", YourAge=" + (yourAge + 100));
        return "main";
    }

    @RequestMapping("/five.do")
    public String five(HttpServletRequest request) {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name=" + name + ", age=" + (age + 100));
        return "main";
    }

}
