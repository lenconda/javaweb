package top.lenconda.project10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lenconda.project10.dao.BookDao;
import top.lenconda.project10.entity.Book;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public List<Book> queryBook(int id){
        return bookDao.findAllById(Collections.singleton(id));
    }
}
