<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/26
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门信息</title>
</head>
<body>
<table>
    <tr>
        <td align="center">部门编号</td>
        <td align="center">部门名称</td>
        <td align="center">领导人编号</td>
        <td align="center">领导人姓名</td>
        <td align="center" colspan="2">操作</td>
    </tr>
    <c:forEach items="${departmentlist}" var="attendance" varStatus="vs">
        <tr>
            <td align="center">${attendance.eno}</td>
            <td align="center">${attendance.dname}</td>
            <td align="center">${attendance.eid}</td>
            <td align="center">${attendance.employee.name}</td>
            <td align="center"><a
                    href="../updatedepartment.jsp?eno=${attendance.eno}&dname=${attendance.dname}&eid=${attendance.eid}">修改</a>
            </td>
            <td align="center"><a href="delete.action?eno=${attendance.eno}">删除</a></td>
        </tr>
        <br>
    </c:forEach>
</table>
<a href="../insertdepartment.jsp">添加部门</a>
</body>
</html>
