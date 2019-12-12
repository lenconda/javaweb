package controller;

import service.CategoryService;
import vo.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/category")
public class CategoryController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        CategoryService categoryService = new CategoryService();
        List<Category> list = categoryService.findAll();
        request.setAttribute("categories", list);
        request.getRequestDispatcher("/main.jsp").forward(request, response);
    }
}
