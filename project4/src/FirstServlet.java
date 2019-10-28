import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
//    private static final long serialVersionUID

    ServletContext context;
    public void init() {
        context = getServletContext();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        String stuno = req.getParameter("stuno");
        String name = req.getParameter("name");
        Student student = new Student(stuno, name);
        req.setAttribute("student", student);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/second");
        dispatcher.forward(req, res);
    }
}
