<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/26
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加部门</title>
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
<form method="post" action="DepartmentController/insert.action">
    部门编号:<input type="number" name="eno"><br>
    部门名称:<input type="text" name="dname"><br>
    负责人工号:<input type="number" name="eid"><br>
    <input type="submit">
</form>
</body>
</html>
