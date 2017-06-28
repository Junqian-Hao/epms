<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
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
<div align="center">
<table>
    <p>培训记录信息</p>
    <tr>
        <td>员工编号</td>
        <td>培训项目编号</td>
        <td>开始时间</td>
        <td>结束时间</td>
        <td>培训内容</td>
    </tr>
        <c:forEach items="${trainrecordlist}" var="trl">
        <tr>
            <td>${trl.id}</td>
            <td>${trl.trainid}</td>
            <td><fmt:formatDate value="${trl.tstarttime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${trl.tendtime}" pattern="yyyy-MM-dd"/></td>
            <td>${trl.tcontent}</td>
                    
        </tr>
    </c:forEach>

</table>
</div>
</body>
</html>
