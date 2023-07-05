<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/24/2023
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Login</h2>
<form action="${pageContext.request.contextPath}/login.do">
  UserName: <input type="text" name="username"><br>
  Password: <input type="text" name="password"><br>
  <input type="submit" name="submit">
</form>

${msg}

</body>
</html>
