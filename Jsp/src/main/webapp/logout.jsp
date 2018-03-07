<%!String str;%>
<%
    str=(String)session.getAttribute("key");
    if(str==null)
        response.sendRedirect("login2.jsp");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>logout</title>
</head>
<body>
<p>Logout from here</p>
<form>
    <a href="invalid.jsp">Click here to logout</a>
</form>
</body>
</html>