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
    <form method="post" action="DepartmentController/update.action">
        部门编号:<input type="number" name="eno" value="<%=request.getParameter("eno")%>"><br>
        部门名称:<input type="text" name="dname" value="<%=request.getParameter("dname")%>"><br>
        负责人工号:<input type="number" name="eid" value="<%=request.getParameter("eid")%>"><br>
        <input type="submit">
    </form>
</body>
</html>
