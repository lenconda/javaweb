package top.lenconda.project9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import top.lenconda.project9.entity.Category;
import top.lenconda.project9.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/view")
    public String viewCategory(Model model) {
        List<Category> list = categoryService.findAll();
        model.addAttribute("category", list);
        return "main";
    }

    @RequestMapping(value = "/modelview")
    public ModelAndView showCategoty(ModelAndView model) {
        List<Category> list = categoryService.findAll();
        model.setViewName("main");
        model.addObject("category", list);
        return model;
    }
}
