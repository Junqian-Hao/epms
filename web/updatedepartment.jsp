<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/26
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改部门信息</title>
</head>
<body>
<jsp:useBean id="department" class="cn.edu.nuc.epms.entity.Department" scope="page">
    <jsp:setProperty name="department" property="*"/>
    <form method="post" action="DepartmentController/update.action">
        部门编号:<input type="number" name="eno" value="${department.eno}"><br>
        部门名称:<input type="text" name="dname" value="${department.dname}"><br>
        负责人工号:<input type="number" name="eid" value="${department.eid}"><br>
        <input type="submit">
    </form>
</jsp:useBean>
</body>
</html>
