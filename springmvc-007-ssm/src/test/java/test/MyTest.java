package test;

import com.powernode.pojo.User;
import com.powernode.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

public class MyTest {
    @Test
    public void testSelectUserPage() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        UserService userService = applicationContext.getBean("userService", UserService.class);
    }
}
