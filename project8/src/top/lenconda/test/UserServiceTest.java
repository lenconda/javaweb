package top.lenconda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lenconda.services.UserService;

public class UserServiceTest {
    @org.junit.Test
    public void addUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService service = (UserService)context.getBean("userService");
        System.out.println(service);
        service.addUser();
    }
}
