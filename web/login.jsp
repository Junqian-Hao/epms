<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>

    <style type="text/css">
        .myButton {
            -moz-box-shadow:inset 0px -6px 0px 0px #ffffff;
            -webkit-box-shadow:inset 0px -6px 0px 0px #ffffff;
            box-shadow:inset 0px -6px 0px 0px #ffffff;
            background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #f9f9f9), color-stop(1, #e9e9e9));
            background:-moz-linear-gradient(top, #f9f9f9 5%, #e9e9e9 100%);
            background:-webkit-linear-gradient(top, #f9f9f9 5%, #e9e9e9 100%);
            background:-o-linear-gradient(top, #f9f9f9 5%, #e9e9e9 100%);
            background:-ms-linear-gradient(top, #f9f9f9 5%, #e9e9e9 100%);
            background:linear-gradient(to bottom, #f9f9f9 5%, #e9e9e9 100%);
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#f9f9f9', endColorstr='#e9e9e9',GradientType=0);
            background-color:#f9f9f9;
            -moz-border-radius:16px;
            -webkit-border-radius:16px;
            border-radius:16px;
            border:1px solid #dcdcdc;
            display:inline-block;
            cursor:pointer;
            color:#666666;
            font-family:Arial;
            font-size:13px;
            padding:6px 24px;
            text-decoration:none;
            text-shadow:0px 1px 0px #ffffff;
        }
        .myButton:hover {
            background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #e9e9e9), color-stop(1, #f9f9f9));
            background:-moz-linear-gradient(top, #e9e9e9 5%, #f9f9f9 100%);
            background:-webkit-linear-gradient(top, #e9e9e9 5%, #f9f9f9 100%);
            background:-o-linear-gradient(top, #e9e9e9 5%, #f9f9f9 100%);
            background:-ms-linear-gradient(top, #e9e9e9 5%, #f9f9f9 100%);
            background:linear-gradient(to bottom, #e9e9e9 5%, #f9f9f9 100%);
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#e9e9e9', endColorstr='#f9f9f9',GradientType=0);
            background-color:#e9e9e9;
        }
        .myButton:active {
            position:relative;
            top:1px;
        }


        form{
            align-content: center;
        }

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
        p{
            font-size: large;
            color: darkslateblue;
            text-shadow: cornsilk;
        }
        .colored-border-retangle {
            margin: 50px auto;
            width: 200px;
            height: 200px;
            border-top: 40px solid coral;
            border-right: 40px solid lightblue;
            border-bottom: 40px solid lightgreen;
            border-left: 40px solid mediumpurple;
        }
    </style>
</head>
<body>
<div class="colored-border-retangle">

<p align="center">管理员登陆</p>

<form method="post" action="SupperAdminController/login.action">
    账号:<input type="text" name="adminid"><br><br>
    密码:<input type="password" name="password"><span>${message}</span><br><br>
    <div class="myButton" ><input type="submit" name="登陆"></div>
</form></div>
</body>
</html>
