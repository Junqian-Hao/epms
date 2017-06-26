<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/24
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>管理员账户管理</title>
</head>
<body>
<table>
    <tr>
        <td align="center">账号</td>
        <td align="center">密码</td>
        <td align="center">类型</td>
        <td align="center" colspan="2">操作</td>
    </tr>
    <c:forEach items="${adminlist}" var="department" varStatus="vs">
        <tr>
            <td align="center">${department.adminid}</td>
            <td align="center">${department.password}</td>
            <c:if test="${department.type==0}">
                <td align="center">系统管理员</td>
            </c:if>
            <c:if test="${department.type==1}">
                <td align="center">财务管理</td>
            </c:if>
            <c:if test="${department.type==2}">
                <td align="center">人事管理</td>
            </c:if>
            <td align="center"><a
                    href="../updateadmin.jsp?adminid=${department.adminid}&password=${department.password}&type=${department.type}">修改</a>
            </td>
            <td align="center"><a href="deleatAdministrator.action?adminid=${department.adminid} ">删除</a></td>
        </tr>
        <br>
    </c:forEach>
</table>
<a href="../insertadmin.jsp">添加管理员</a>
</body>
</html>
