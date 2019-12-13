package top.lenconda.project10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.lenconda.project10.entity.BookCategory;
import top.lenconda.project10.service.BookCategoryService;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class BookCategoryController {
    @Autowired
    private BookCategoryService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BookCategory> findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public void saveBookCategory(BookCategory bookCategory) {
        service.saveBookCategory(bookCategory);
    }

    @DeleteMapping("")
    public void deleteBookCategory(int id) {
        service.deleteBookCategory(id);
    }

    @PutMapping("")
    public String updateBookCategory(BookCategory bookCategory) {
        service.saveBookCategory(bookCategory);
        return "更新成功";
    }
}
