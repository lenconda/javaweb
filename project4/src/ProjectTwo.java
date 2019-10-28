import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProjectTwo extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello world, this message is from servlet!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<p><strong>Email: </strong>" + req.getParameter("email") + "</p>");
        out.println("<p><strong>Name: </strong>" + req.getParameter("name") + "</p>");
        out.println("<p><strong>Address: </strong>" + req.getParameter("address") + "</p>");
        out.println("<p><strong>Resume: </strong>" + req.getParameter("resume") + "</p>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
