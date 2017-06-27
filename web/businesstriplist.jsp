<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: 16359
  Date: 2017/6/27
  Time: 0:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出差记录</title>
</head>
<body>
<form method="post" action="/epms/BusinesstripController/selectById.action">
    员工编号:<input type="number" name="id">
    <input type="submit">
</form>
<table>
    <tr>
        <td align="center">记录编号</td>
        <td align="center">员工号</td>
        <td align="center">出差日期</td>
        <td align="center">报道时间</td>
        <td align="center">出差说明</td>
        <td align="center">报到</td>

    </tr>
    <c:forEach items="${businesstriplist}" var="businesstrip" varStatus="vs">
        <tr>
            <td align="center">${vs.index+1}</td>
            <td align="center">${businesstrip.id}</td>
            <td align="center"><fmt:formatDate value="${businesstrip.btdate}" pattern="yyyy-MM-dd"/></td>
            <td align="center"><fmt:formatDate value="${businesstrip.registerdate}" pattern="yyyy-MM-dd"/></td>
            <td align="center">${businesstrip.btmessage}</td>
            <td align="center"><a href="/epms/BusinesstripController/registe.action?btid=${businesstrip.btid}">报道</a></td>
        </tr>
        <br>
    </c:forEach>
</table>
<a href="../insertbusinesstrip.jsp">外派出差</a>
</body>
</html>