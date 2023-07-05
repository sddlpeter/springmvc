<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home page</title>
</head>
<body>
<h2>Hello World!</h2>
<br>
<a href="${pageContext.request.contextPath}/main.do">点击这里跳转main page</a>
<br>
<a href="${pageContext.request.contextPath}/user.do">点击这里跳转user page</a>

<br>
<br>
<form action="${pageContext.request.contextPath}/req.do" method="post">
    <input type="text">
    <input type="submit" value="提交">
</form>
</body>
</html>
