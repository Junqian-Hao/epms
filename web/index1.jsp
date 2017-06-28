<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/27
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>纪律管理</title>
    <style type="text/css">
        body {
            text-align: center
        }
        .height {

            align-content: center;
            height: 200px;
        }
    </style>
    <style type="text/css">
        body{
            background:url("/epms/img/hua.jpg");
            background-repeat:no-repeat ;
            background-size:100% 100%;
            background-attachment:fixed;
            text-align: center;
        }
    </style>
</head>
<body class="height">
<a href="AttendanceController/selectAll.action">查询签到记录</a>
<a href="BusinesstripController/selectAll.action">出差管理</a>
<a href="RprecordController/selectAll.action">进行奖惩</a>
</body>
</html>
