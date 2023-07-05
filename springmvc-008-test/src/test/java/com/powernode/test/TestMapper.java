package com.powernode.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.powernode.controller.UserController;
import com.powernode.service.impl.UserServiceImpl;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestMapper {
    @Test
    public void testMapper() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.selectUserPage("", "", 0);
    }

    @Test
    public void testController() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        int rowCount = userController.getRowCount("", "");
        System.out.println(rowCount);
    }
}
