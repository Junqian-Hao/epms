<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/27
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加奖惩记录</title>
</head>
<body>
<form method="post" action="RprecordController/insert.action">
    员工号:<input type="number" name="id"><br>
    奖惩金额:<input type="number" name="rpmoney"><br>
    原因说明:<input type="text" name="rpreason"><br>
    奖励<input type="radio" name="rptype" value="0">
    惩罚<input type="radio" name="rptype" value="1">
    <input type="submit">
</form>
</body>
</html>
