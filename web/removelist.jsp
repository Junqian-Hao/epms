<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/26
  Time: 下午2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>调动记录</title>
</head>
<body>
    <table>
        <tr align="center">
            <c:forEach var="remove" items="${removelist}">
                <td align="center">${remove.removeid}</td>
                <td align="center">${remove.id}</td>
                <td align="center">${remove.rmethod}</td>
                <td align="center">${remove.rdate}</td>
            </c:forEach>
        </tr>
    </table>
</body>
</html>
