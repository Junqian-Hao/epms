<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/25
  Time: 上午11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工管理界面</title>
</head>
<body>
<p>员工管理。</p>
<table border="10" bgcolor="#00bfff">
    <tr>
        <td align="center">eno</td>
        <td align="center">id</td>
        <td align="center">name</td>
        <td align="center">sex</td>
        <td align="center">birth</td>
        <td align="center">nation</td>
        <td align="center">education</td>
        <td align="center">duty</td>
        <td align="center">domicileplace</td>
        <td align="center">politics</td>
        <td align="center">physiologincal</td>
        <td align="center">contractsigningdate</td>
        <td align="center">contractexpirationdate</td>
        <td align="center">contractcontents</td>

    </tr>
    <c:forEach items="${employees}" var="employee" varStatus="vs">
    <tr>
        <td>${employee.id}</td>
        <td>${employee.eno}</td>
        <td>${employee.name}</td>
        <td>${employee.sex}</td>
        <td>${employee.birth}</td>
        <td>${employee.nation}</td>
        <td>${employee.education}</td>
        <td>${employee.duty}</td>
        <td>${employee.domicileplace}</td>
        <td>${employee.politics}</td>
        <td>${employee.physiological}</td>
        <td>${employee.contractsigningdate}</td>
        <td>${employee.contractexpirationdate}</td>
        <td>${employee.contractcontents}</td>
        <td align="center"><a href="../updateemployee.jsp?id=${employee.id}&eno=${employee.eno}&name=${employee.name}&sex=${employee.sex}&birth=${employee.birth}&nation=${employee.nation}&education=${employee.education}&duty=${employee.duty}&domicileplace=${employee.domicileplace}&politics=${employee.politics}&physiological=${employee.physiological}&contractsigningdate=${employee.contractsigningdate}&contractexpirationdate=${employee.contractexpirationdate}&contractcontents=${employee.contractcontents}">修改</a></td>
        <td align="center"><a href="deleteEmployee.action?id=${employee.id}">删除</a></td
    </tr>
    </c:forEach>
</table>
    <a href="../insertemployee.jsp">录入</a>

</body>
</html>
