<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/23
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
    <style type="text/css">
        span {
            color: red;
        }

        body {
            text-align: center
        }
    </style>
</head>
<body>
<form method="post" action="SupperAdminController/login.action">
    账号:<input type="text" name="adminid"><br>
    密码:<input type="password" name="password"><span>${message}</span><br>
    <input type="submit">
</form>

</body>
</html>
