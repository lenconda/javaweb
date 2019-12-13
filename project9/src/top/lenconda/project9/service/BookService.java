package top.lenconda.project9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lenconda.project9.dao.BookDao;
import top.lenconda.project9.entity.Book;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public List<Book> findBookByCategoryId(String id) {
        return bookDao.findBookByCategoryId(id);
    }
}
