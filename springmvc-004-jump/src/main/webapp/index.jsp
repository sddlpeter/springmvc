<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/22/2023
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
<br>
<h4>hello world!</h4>
<br>

<a href="${pageContext.request.contextPath}/demo.do">0. Jump to main page</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/one.do">1. Jump to action one</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/two.do">2. Jump to action two</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/three.do">3. Jump to action three</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/four.do">4. Jump to action four</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/five.do">5. Jump to action five</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/data.do">6. Jump to data</a>
</body>
</html>
