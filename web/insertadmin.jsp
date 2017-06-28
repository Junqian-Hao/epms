<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/24
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加管理员</title>
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
<body>
<form method="post" action="SupperAdminController/insertAdministrator.action">
    管理员账号:<input type="number" name="adminid"><br>
    密码:<input type="text" name="password"><br>
    类型:<input type="number" name="type">0:系统管理员1:财务管理员2:人事管理员<br>
    <input type="submit">
</form>
</body>
</html>
