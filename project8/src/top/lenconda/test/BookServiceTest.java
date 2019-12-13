package top.lenconda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lenconda.services.BookService;
import top.lenconda.vo.Book;

public class BookServiceTest {
    @org.junit.Test
    public void addBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService service = (BookService)context.getBean("bookService");
        BookService service1 = (BookService)context.getBean("bookService");
        System.out.println(service);
        System.out.println(service1);
        service.addBook();
    }

    @org.junit.Test
    public void testBookVo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Book book = (Book)context.getBean("book");
        System.out.println(book.getBookName());
    }
}
