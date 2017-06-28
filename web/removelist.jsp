<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/26
  Time: 下午2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>调动记录</title>
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
    <table>
        <tr>
            <td align="center">调动编号</td>
            <td align="center">员工编号</td>
            <td align="center">调动类型</td>
            <td align="center">调动日期</td>
        </tr>
<c:forEach var="remove" items="${removelist}">
        <tr align="center">
                <td align="center">${remove.removeid}</td>
                <td align="center">${remove.id}</td>
                <td align="center">${remove.rmethod}</td>
                <td align="center"><fmt:formatDate value="${remove.rdate}" pattern="yyyy-MM-dd"/></td>
        </tr>
</c:forEach>
    </table>
</body>
</html>
