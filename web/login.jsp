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
        form{
            position: relative;
        }
        form span{
            position: absolute;
        }
    </style>
</head>
<body>
<form method="post" action="SupperAdminController/login.action">
    账号:<input type="text" name="adminid"><br><br><br>
    密码:<input type="password" name="password"><span>${message}</span><br>
    <input type="submit" name="submit">
</form>

</body>
</html>
