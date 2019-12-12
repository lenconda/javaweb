package controller;

import service.BookService;
import vo.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/book")
public class BookController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bookService = new BookService();
        int id = Integer.parseInt(request.getParameter("id"));
        List<Book> bookList = bookService.findAll(id);
        request.setAttribute("books",bookList);
        request.getRequestDispatcher("/main.jsp").forward(request,response);
    }
}
