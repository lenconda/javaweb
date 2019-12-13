package top.lenconda.project10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.lenconda.project10.entity.Book;
import top.lenconda.project10.entity.BookCategory;
import top.lenconda.project10.service.BookCategoryService;
import top.lenconda.project10.service.BookService;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping("")
    public List<Book> queryBook(int id) {
        return service.queryBook(id);
    }
}
