<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/21/2023
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>hello world！</h2>
<br>
<br>

<a href="${pageContext.request.contextPath}/main.do">跳转到main页面</a>
<br>
<br>
<h4>1. 提交不同类型的数据</h4>
<form action="${pageContext.request.contextPath}/one.do">
    name: <input type="text" name="name"><br>
    age: <input type="text" name="age"><br>
    <input type="submit" value="submit">
</form>

<br><br>
<h4>2. 提交User类型数据</h4>
<form action="${pageContext.request.contextPath}/two.do">
    name: <input type="text" name="name"><br>
    age: <input type="text" name="age"><br>
    <input type="submit" value="submit">
</form>

<br><br>
<a href="${pageContext.request.contextPath}/three/zhangsan/22.do">3. 动态提交</a>

<br><br>
<h4>4. 映射名称不一致</h4>
<form action="${pageContext.request.contextPath}/four.do" method="post">
    name: <input type="text" name="name"><br>
    age: <input type="text" name="age"><br>
    <input type="submit" value="submit">
</form>


<br><br>
<h4>5. 手动提交</h4>
<form action="${pageContext.request.contextPath}/five.do" method="post">
    name: <input type="text" name="name"><br>
    age: <input type="text" name="age"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
