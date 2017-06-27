<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
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
        <td align="center"><fmt:formatDate value="${train.tstarttime}" pattern="yyyy-MM-dd"/></td>
        <td align="center"><fmt:formatDate value="${train.tendtime}" pattern="yyyy-MM-dd"/></td>
        <td align="center">${train.tcontent}</td>
        <td align="center"><a href="../updatetrain.jsp?trainid=${train.trainid}&tstarttime=<fmt:formatDate value="${train.tstarttime}" pattern="yyyy-MM-dd"/>&tendtime=<fmt:formatDate value="${train.tendtime}" pattern="yyyy-MM-dd"/>&tcontent=${train.tcontent}">修改</a> </td>
        <td align="center"><a href="deletetrain.action?trainid=${train.trainid}">删除</a> </td>
    </tr>
    </c:forEach>
</table>
       <a href="../inserttrain.jsp">新建培训项目</a>
        <a href="../trainrecordlist.jsp">查看培训记录</a>
        <br><br><br><br>
    <form action="TrainrecordController/inserttrainrecord.action" method="post">
        员工ID:<input type="number" name="id" > <br>
        所选培训项目编号:<input type="text" name="trainid">
        <input type="submit" value="提交培训信息">
    </form>

</body>
</html>
