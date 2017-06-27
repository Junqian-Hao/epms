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
    
        <c:forEach items="${trainlist}" var="tl">
        <c:forEach items="${trainrecordlist}" var="trl">
        <c:forEach items="${employeelist}" var="el">
            <c:if test="${trl.id=el.id and trl.trainid=tl.trainid}">
        <tr>
            <td>${trl.id}</td>
            <td>${trl.trainid}</td>
            <td>${tl.tstarttime}</td>
            <td>${tl.tendtime}</td>
                    
        </tr>
            </c:if>
    </c:forEach>
    </c:forEach>
    </c:forEach>
</table>
</body>
</html>
