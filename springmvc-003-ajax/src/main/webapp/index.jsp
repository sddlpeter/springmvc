<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/21/2023
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
    <script type="text/javascript" src="js/jquery-3.7.0.js"></script>
</head>
<body>

<h4>hello world!</h4>

<br>
<a href="${pageContext.request.contextPath}/demo.do">点击跳转到main页面</a>
<br><br>
<a href="javascript:show()">访问数据库返回学生集合</a>
<div id="mydiv">等待服务器返回数据</div>

<script type="text/javascript">
    function show() {
        $.ajax({
           url:"${pageContext.request.contextPath}/ajax.do",
           dataType:"json",
           type:"get",
           success:function (list) {
               var s = "";
               $.each(list, function(i, stu){
                   s+=stu.name+"----"+stu.age+"<br>";
               });
               $("#mydiv").html(s);
           }
        });
    }
</script>
</body>
</html>
