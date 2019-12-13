package top.lenconda.project10.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import top.lenconda.project10.entity.BookCategory;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class BookCategoryServiceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BookCategoryService service;

    @Test
    public void findAll() {
        logger.debug(service.findAll().toString());
    }

    @Test
    public void save() {
        BookCategory bookCategory = new BookCategory();
        Timestamp t = new Timestamp(System.currentTimeMillis());
        bookCategory.setCategoryName("科技");
        bookCategory.setCreateTime(t);
        bookCategory.setUpdateTime(t);
        service.saveBookCategory(bookCategory);
    }
}
