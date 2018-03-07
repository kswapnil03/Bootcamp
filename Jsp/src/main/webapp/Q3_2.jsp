<%@ page import="com.mysql.jdbc.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.mysql.jdbc.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    try {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "swapan-2021");
        PrintWriter printWriter = response.getWriter();
        PreparedStatement stmt = null;
        stmt = (PreparedStatement) connection.prepareStatement("select * from signup where username=? and password=?");
        stmt.setString(1, username);
        stmt.setString(2, password);
        System.out.println(" user logged in");
        ResultSet resultSet = stmt.executeQuery();

        while (resultSet.next()) {
            HttpSession httpSession = request.getSession(true);
            httpSession.setAttribute("key", username);
            response.sendRedirect("logout.jsp");
            connection.close();
            return;
        }
        response.sendRedirect("login.jsp");
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
</body>
</html>
