package top.lenconda.project10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lenconda.project10.dao.BookCategoryDao;
import top.lenconda.project10.entity.BookCategory;

import java.util.List;

@Service
public class BookCategoryService {
    @Autowired
    private BookCategoryDao bookCategoryDao;

    public List<BookCategory> findAll() {
        return bookCategoryDao.findAll();
    }

    public void saveBookCategory(BookCategory bookCategory) {
        bookCategoryDao.save(bookCategory);
    }

    public void deleteBookCategory(int id) {
        bookCategoryDao.deleteById(id);
    }

    public void updateBookCategory(BookCategory bookCategory) {
        bookCategoryDao.save(bookCategory);
    }
}
