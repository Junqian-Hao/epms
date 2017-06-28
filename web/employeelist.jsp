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
    <style type="text/css">
    .myButton {
        position: absolute;
        right: 0px;
    background-color:#44c767;
    -moz-border-radius:31px;
    -webkit-border-radius:31px;
    border-radius:31px;
    border:1px solid #18ab29;
    display:inline-block;
    cursor:pointer;
    color:#ffffff;
    font-family:Arial;
    font-size:17px;
    padding:18px 42px;
    text-decoration:none;
    text-shadow:0px 1px 0px #2f6627;
    }
    .myButton:hover {
    background-color:#5cbf2a;
    }
    .myButton:active {
    position:relative;
    top:1px;
    }
    </style>
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

<p align="center" style="font-size: large">员工管理</p>
<table border="10" color="#00bfff">
    <tr>
        <td align="center">员工编号</td>
        <td align="center">部门号</td>
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
        <td align="center"><a href="updatetra.action?id=${employee.id}">修改</a> </td>
        <td align="center"><a href="deleteEmployee.action?id=${employee.id}">删除</a></td>
    </tr>
    </c:forEach>
</table>
<a  href="../insertemployee.jsp"><p class="myButton">录入</p></a>

</body>
</html>
