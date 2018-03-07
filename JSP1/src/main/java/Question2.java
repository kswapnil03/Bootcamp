import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Question2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        Integer id = Integer.parseInt(req.getParameter("blogid"));
        String data = req.getParameter("blogdata");
        System.out.println("My id is " + id + " and data is " + data);


        Connection connection = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) connection.prepareStatement("insert into blog values(?,?)");
            stmt.setInt(1, id);
            stmt.setString(2, data);
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

