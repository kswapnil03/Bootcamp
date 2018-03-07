<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Question2--%>
<html>
<body>
<form> Enter the Number:<input type="number" name="Number">
    <input type="submit" name="submit" value="submit">
</form>
<%
    if (request.getParameter("Number") != null) {
        int numberMax = Integer.parseInt(request.getParameter("Number"));

        for (int i = 1; i <= numberMax; i++)
            out.print(i + " ");

    }
%>

</body>
</html>
