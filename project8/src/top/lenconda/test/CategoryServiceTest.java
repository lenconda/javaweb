package top.lenconda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lenconda.services.CategoryService;

public class CategoryServiceTest {
    @org.junit.Test
    public void addCategory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CategoryService service = (CategoryService)context.getBean("categoryService");
        System.out.println(service);
        service.addCategory();
    }
}
