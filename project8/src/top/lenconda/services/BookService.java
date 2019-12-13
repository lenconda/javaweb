package top.lenconda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lenconda.dao.BookDao;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public BookService() {
    }

    public BookService(String s) {

    }

    public void addBook() {
        bookDao.addBook();
    }
}
