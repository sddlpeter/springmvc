package com.powernode.controller;

import com.powernode.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxAction {
    @ResponseBody
    @RequestMapping("/ajax.do")
    public List<Student> ajax() {
        Student s1 = new Student("zhang san", 22);
        Student s2 = new Student("li si", 25);
        Student s3 = new Student("wang wu", 24);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        return list;
    }
}
