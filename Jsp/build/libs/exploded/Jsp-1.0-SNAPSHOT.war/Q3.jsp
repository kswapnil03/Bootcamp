<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.mysql.jdbc.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: swapnil
  Date: 7/3/18
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Q3</title>
</head>
<body>

<%

    try {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "swapan-2021");
        System.out.println("connection started");
        PrintWriter printWriter = response.getWriter();
        PreparedStatement stmt = null;
        stmt = (PreparedStatement) connection.prepareStatement("insert into signup values(?,?)");
        stmt.setString(1, username);
        stmt.setString(2, password);
        int i = stmt.executeUpdate();
        System.out.println(i + " records inserted");
        connection.close();
        response.sendRedirect("login2.jsp");

    } catch (SQLException e) {
        e.printStackTrace();
    } catch (Exception ex) {
        System.out.println("Error in getting connection  : " + ex.getMessage());
    }
%>
</body>
</html>
