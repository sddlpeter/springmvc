package com.powernode.controller;

import com.powernode.pojo.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class DemoAction {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping("/demo.do")
    public String action() {
        return "main";
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }

    @RequestMapping("/date.do")
    public String processDate(String name, Date date) {
        System.out.println("name=" + name + ", date=" + simpleDateFormat.format(date));
        System.out.println("processDate...");
        return "main";
    }

    @RequestMapping("/list.do")
    public String list(HttpServletRequest request) throws ParseException {
        Student stu1 = new Student("张三",simpleDateFormat.parse("2000-01-01"));
        Student stu2 = new Student("李四",simpleDateFormat.parse("2001-08-11"));
        Student stu3 = new Student("王五",simpleDateFormat.parse("2002-09-21"));
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        request.setAttribute("list",list);
        return "main";
    }
}
