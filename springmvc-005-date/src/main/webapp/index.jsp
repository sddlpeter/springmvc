<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/24/2023
  Time: 9:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>hello world!</h3>
<br>
<br>
<a href="${pageContext.request.contextPath}/demo.do">click here and jump</a>
<br>
<br>
<form action="${pageContext.request.contextPath}/date.do" method="post">
    name:<input type="text" name="name">
    birth_date:<input type="date" name="date">
    <input type="submit" value="submit">
</form>

<br>
<br>
<a href="${pageContext.request.contextPath}/list.do">click to list page</a>

</body>
</html>
