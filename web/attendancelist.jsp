<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/26
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>

<html>
<head>
    <title>考勤记录</title>
</head>
<body>
<form method="post" action="/epms/AttendanceController/selectById.action">
    员工编号:<input type="number" name="id">
    <input type="submit">
</form>
<table>
    <tr>
        <td align="center">记录编号</td>
        <td align="center">员工号</td>
        <td align="center">日期</td>
        <td align="center">签到时间</td>
        <td align="center">签退时间</td>
        <td align="center">是否为加班记录</td>
    </tr>
    <c:forEach items="${attendancelist}" var="attendance" varStatus="vs">
        <tr>
            <td align="center">${attendance.attid}</td>
            <td align="center">${attendance.id}</td>
            <td align="center"><fmt:formatDate value="${attendance.attdate}" pattern="yyyy-MM-dd"/></td>
            <td align="center"><fmt:formatDate value="${attendance.workhours}" pattern="hh:mm:ss"/></td>
            <td align="center"><fmt:formatDate value="${attendance.closingtime}" pattern="hh:mm:ss"/></td>
            <c:if test="${attendance.isovertime==0}">
            <td align="center">否</td>
            </c:if>
            <c:if test="${attendance.isovertime==1}">
                <td align="center">是</td>
            </c:if>
        </tr>
        <br>
    </c:forEach>
</table>
</body>
</html>
