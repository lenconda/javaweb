package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.lenconda.project9.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:/Users/lenconda/workspace/javaweb/project9/web/WEB-INF/applicationContext.xml"})
public class CategoryServiceTest {
    @Autowired
    private CategoryService service;

    @Test
    public void findAll() {
        System.out.println(service.findAll().toString());
    }
}
