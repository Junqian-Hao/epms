<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/24
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改管理员信息</title>
</head>
<body>
<jsp:useBean id="admin" class="cn.edu.nuc.epms.entity.Administrator" scope="page">
    <jsp:setProperty name="admin" property="*"/>
    <form method="post" action="SupperAdminController/update.action">
        管理员账号:${department.adminid}<input type="hidden" name="adminid" value="${department.adminid}"><br>
        密码:<input type="text" name="password" value="${department.password}"><br>
        类型:<input type="number" name="type" value="${department.type}">0:系统管理员1:财务管理员2:人事管理员<br>
        <input type="submit">
    </form>
</jsp:useBean>
</body>
</html>
