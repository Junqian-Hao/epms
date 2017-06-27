<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/25
  Time: 上午11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工管理界面</title>
</head>
<body>
<p>员工管理。</p>
<table border="10" color="#00bfff">
    <tr>
        <td align="center">员工编号</td>
        <td align="center">员工号</td>
        <td align="center">姓名</td>
        <td align="center">性别</td>
        <td align="center">出生日期</td>
        <td align="center">民族</td>
        <td align="center">教育程度</td>
        <td align="center">职位</td>
        <td align="center">户口所在地</td>
        <td align="center">政治面貌</td>
        <td align="center">健康状况</td>
        <td align="center">合同开始日期</td>
        <td align="center">合同截止日期</td>
        <td align="center">合同内容</td>

    </tr>
    <c:forEach items="${employees}" var="employee" varStatus="vs">
    <tr>
        <td>${employee.id}</td>
        <td>${employee.eno}</td>
        <td>${employee.name}</td>
        <td>${employee.sex}</td>
        <td><fmt:formatDate value="${employee.birth}" pattern="yyyy-MM-dd"/></td>
        <td>${employee.nation}</td>
        <td>${employee.education}</td>
        <td>${employee.duty}</td>
        <td>${employee.domicileplace}</td>
        <td>${employee.politics}</td>
        <td>${employee.physiological}</td>
        <td><fmt:formatDate value="${employee.contractsigningdate}" pattern="yyyy-MM-dd"/></td>
        <td><fmt:formatDate value="${employee.contractexpirationdate}" pattern="yyyy-MM-dd"/></td>
        <td>${employee.contractcontents}</td>
        <td align="center"><a href="../updateemployee.jsp?id=${employee.id}&eno=${employee.eno}&name=${employee.name}&sex=${employee.sex}&birth=<fmt:formatDate value="${employee.birth}" pattern="yyyy-MM-dd"/>}&nation=${employee.nation}&education=${employee.education}&duty=${employee.duty}&domicileplace=${employee.domicileplace}&politics=${employee.politics}&physiological=${employee.physiological}&contractsigningdate=<fmt:formatDate value="${employee.contractsigningdate}" pattern="yyyy-MM-dd"/>&contractexpirationdate=<fmt:formatDate value="${employee.contractexpirationdate}" pattern="yyyy-MM-dd"/>&contractcontents=${employee.contractcontents}">修改</a></td>
        <td align="center"><a href="deleteEmployee.action?id=${employee.id}">删除</a></td
    </tr>
    </c:forEach>
</table>
    <a href="../insertemployee.jsp">录入</a>

</body>
</html>
