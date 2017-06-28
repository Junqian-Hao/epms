<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/27
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>奖惩记录</title>
    <style type="text/css">
        body{
            align-content: center;
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
<body>
<div align="center"> <form method="post" action="/epms/RprecordController/selectById.action">
    员工编号:<input type="number" name="id">
    <input type="submit">
</form></div>
<table align="center">
    <tr>
        <td align="center">记录编号</td>
        <td align="center">员工号</td>
        <td align="center">类型</td>
        <td align="center">奖惩金额</td>
        <td align="center">奖惩日期</td>
        <td align="center">奖惩原因</td>
        <td align="center">删除</td>

    </tr>
    <c:forEach items="${rprecordlist}" var="rprecord" varStatus="vs">
        <tr>
            <td align="center">${vs.index+1}</td>
            <td align="center">${rprecord.id}</td>
            <c:if test="${rprecord.rptype==0}">
            <td align="center">奖励</td>
            </c:if>
            <c:if test="${rprecord.rptype==1}">
                <td align="center">惩罚</td>
            </c:if>
            <td align="center">${rprecord.rpmoney}</td>
            <td align="center"><fmt:formatDate value="${rprecord.rpdate}" pattern="yyyy-MM-dd"/></td>
            <td align="center">${rprecord.rpreason}</td>
            <td align="center"><a href="/epms/RprecordController/delete.action?rpid=${rprecord.rpid}">删除</a></td>
        </tr>
        <br>
    </c:forEach>
</table>
<div align="center"><a href="../insertrprecord.jsp">进行奖惩</a></div>
</body>
</html>
