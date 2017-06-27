<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/27
  Time: 上午12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>培训信息</title>


</head>
<body>
<table align="center">
    <tr>
        <td align="center">培训项目ID</td>
        <td align="center">培训开始时间</td>
        <td align="center">培训结束时间</td>
        <td align="center">培训内容</td>
    </tr>
    <c:forEach var="train" items="${trainlist}">
    <tr>
        <td align="center">${train.trainid}</td>
        <td align="center">${train.tstarttime}</td>
        <td align="center">${train.tendtime}</td>
        <td align="center">${tcontent}</td>
        <td align="center"><a href="../updatetrain.jsp?trainid=${train.trainid}&tstarttime=${train.tstarttime}&tendtime=${train.tendtime}&tcontent=${train.tcontent}">修改</a> </td>
        <td align="center"><a href="deletetrain.action?trainid=${train.trainid}">删除</a> </td>
    </tr>
    </c:forEach>


    <form action="TrainController/inserttrain.action" method="post">

    </form>
</table>
</body>
</html>
