package com.powernode.test;

import com.powernode.controller.UserController;
import com.powernode.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapper {
    @Test
    public void testMapper() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserServiceImpl userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.selectUserPage("", "", 0);
    }

    @Test
    public void testController() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        int rowCount = userController.getRowCount("", "");
        System.out.println(rowCount);
    }
}
