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
    <style type="text/css">
        body{
            text-align: center;
        }
    </style>
</head>
<body>
<table align="center">
    <tr>
        <td align="center">账号</td>
        <td align="center">密码</td>
        <td align="center">类型</td>
        <td align="center" colspan="2">操作</td>
    </tr>
    <c:forEach items="${adminlist}" var="rprecord" varStatus="vs">
        <tr>
            <td align="center">${rprecord.adminid}</td>
            <td align="center">${rprecord.password}</td>
            <c:if test="${rprecord.type==0}">
                <td align="center">系统管理员</td>
            </c:if>
            <c:if test="${rprecord.type==1}">
                <td align="center">纪律管理</td>
            </c:if>
            <c:if test="${rprecord.type==2}">
                <td align="center">人事管理</td>
            </c:if>
            <td align="center"><a
                    href="../updateadmin.jsp?adminid=${rprecord.adminid}&password=${rprecord.password}&type=${rprecord.type}">修改</a>
            </td>
            <td align="center"><a href="deleteAdministrator.action?adminid=${rprecord.adminid} ">删除</a></td>
        </tr>
        <br>
    </c:forEach>
</table>
<a href="../insertadmin.jsp">添加管理员</a>
</body>
</html>
