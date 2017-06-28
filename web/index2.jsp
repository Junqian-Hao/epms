<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/27
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事管理</title>
    <style type="text/css">
        body {
            text-align: center
        }
        .height {
            margin-top: 200px;
            align-content: center;
            height: 200px;
            position: absolute;
            right: 400px;
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
<p style="color: deeppink">------人事管理员------</p>
<a href="DepartmentController/select.action">查看部门</a>
<a href="EmployeeController/employeelist.action">员工信息表</a>
<a href="RemoveController/removelist.action">员工调动记录</a>
<a href="TrainController/trainlist.action">培训管理</a>
</body>
</html>
