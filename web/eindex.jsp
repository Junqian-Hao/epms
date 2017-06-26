<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/26
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        span{
            color: red;
        }
    </style>
    <title>员工操作界面</title>
</head>
<body>
<form name="form1" method="post" >
    员工编号:<input type="number" name="id"><br>
    正常:<input type="radio" name="isovertime" value="0" checked>
    加班:<input type="radio" name="isovertime" value="1">
    <input type="button" onclick="form1.action='/epms/AttendanceController/statWork.action';form1.submit();" value="签到">
    <input type="button" onclick="form1.action='/epms/AttendanceController/endWork.action';form1.submit();" value="签退"><br>
    <span>${message}</span>
</form>
</body>
</html>
