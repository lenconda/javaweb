package top.lenconda.project9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.lenconda.project9.service.BookService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("")
    public String showBookByCategoryId(@RequestParam("id") String id, Model model) {
        model.addAttribute("books", bookService.findBookByCategoryId(id));
        return "main";
    }

    @RequestMapping(value = {"id"}, method = RequestMethod.GET)
    public String getBookByCategoryId(@PathVariable("id") String id, Model model) {
        model.addAttribute("books", bookService.findBookByCategoryId(id));
        return "main";
    }

    @RequestMapping("view")
    public String findBookByCategoryId(HttpServletRequest request) {
        String id = request.getParameter("id");
        request.setAttribute("books", bookService.findBookByCategoryId(id));
        return "main";
    }
}
