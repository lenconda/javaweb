import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    ServletContext context;

    public void init() {
        context = getServletContext();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        Student student = (Student)req.getAttribute("student");

        res.setContentType("text/html;charset=utf8");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<p>学号：<strong>" + student.getStuno() + "</strong></p>");
        out.println("<p>姓名：<strong>" + student.getName() + "</strong></p>");
        out.println("</body></html>");
    }
}
