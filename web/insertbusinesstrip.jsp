<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/27
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加出差记录</title>
</head>
<body>
<form method="post" action="BusinesstripController/insert.action">
    员工号:<input type="number" name="id"><br>
    出差时间:<input type="date" name="btdate"><br>
    出差说明:<input type="text" name="btmessage"><br>
    <input type="submit">
</form>
</body>
</html>
