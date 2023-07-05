package com.powernode.test;

import com.powernode.controller.DemoAction;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {
    @Test
    public void testController() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc.xml");
        DemoAction demoAction = applicationContext.getBean("demoAction", DemoAction.class);
        System.out.println(demoAction);
    }
}
