package service;

import dao.impl.BookDaoImpl;
import vo.Book;

import java.util.List;

public class BookService {
    private BookDaoImpl book = new BookDaoImpl();

    public List<Book> findAll(int id) {
        return book.getBookByCategory(id);
    }
}
