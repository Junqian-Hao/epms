<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/22
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>
    <style type="text/css">
        body {
            text-align: center
        }

        .height {

            align-content: center;
            height: 200px;
        }    </style>
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
<div class="height">
    <a href="SupperAdminController/adminlist.action">管理员管理列表</a><br>
    <a href="DepartmentController/select.action">查看部门</a><br>
    <a href="EmployeeController/employeelist.action">员工信息表</a><br>
    <a href="RemoveController/removelist.action">员工调动记录</a><br>
    <a href="TrainController/trainlist.action">培训管理</a><br>
    <a href="AttendanceController/selectAll.action">查询签到记录</a><br>
    <a href="BusinesstripController/selectAll.action">出差管理</a><br>
    <a href="RprecordController/selectAll.action">进行奖惩</a>
</div>

</body>
</html>
