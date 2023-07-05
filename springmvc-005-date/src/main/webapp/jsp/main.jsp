<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/24/2023
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl核心标签库--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--导入jstl格式化标签库--%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<html>
<head>
    <title>main</title>
</head>
<body>

<br>
<h3>main jsp page</h3>

<br>
<br>

<table width="800px" border="1">
    <tr>
        <th>姓名</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.name}</td>
            <td>${stu.birthDate} ------ <fmt:formatDate value="${stu.birthDate}" pattern="yyyy-MM-dd"/> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
