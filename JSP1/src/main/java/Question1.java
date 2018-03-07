import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Question1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pr=resp.getWriter();
        String un=req.getParameter("username");
        String pwd=req.getParameter("password");

        System.out.println("you have successfully logged in with username=="+un+" and password=="+pwd);

        if(un.equals("swapnil") && pwd.equals("swapnil")){

            resp.sendRedirect("/blog.jsp");
            System.out.println("redirected to blog.jsp");
        }
        else{
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req,resp);
            pr.write("<p style='color:red'>Please Enter Correct Credential</p>");
        }

    }
}

