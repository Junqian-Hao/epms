<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/27
  Time: 下午12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工培训记录</title>
</head>
<body>
<table>
    <p>培训记录信息</p>
    <c:forEach items="${trainrecordlist}" var="trl">
        <tr>
            <td>${trl.trainid}</td>
            <td>${trl.id}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
