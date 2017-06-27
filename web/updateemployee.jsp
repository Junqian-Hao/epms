<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/26
  Time: 下午12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改员工信息</title>
</head>
<body>

    <form method="post" action="updateEmployee.action">
            <ul>
                <li>员工编号：${employee1.id} <input type="hidden" name="id" value="${employee1.id}"></li>
                <li>部门号： <input type="text" name="eno" value="${employee1.eno}"></li>
                <li>姓名： <input type="text" name="name" value="${employee1.name}"></li>
                <li>性别： <input type="text" name="sex" value="${employee1.sex}"></li>
                <li>出生日期： <input type="date" name="birth" value="<fmt:formatDate value="${employee1.birth}" pattern="yyyy-MM-dd"/>"></li>
                <li>民族： <input type="text" name="nation" value="${employee1.nation}"></li>
                <li>教育程度： <input type="text" name="education" value="${employee1.education}"></li>
                <li>职位： <input type="text" name="duty" value="${employee1.duty}"></li>
                <li>户口所在地： <input type="text" name="domicileplace" value="${employee1.domicileplace}"></li>
                <li>政治面貌： <input type="text" name="politics" value="${employee1.politics}"></li>
                <li>健康状况： <input type="text" name="physiological" value="${employee1.physiological}"></li>
                <li>合同签署日期： <input type="date" name="contractsigningdate" value="<fmt:formatDate value="${employee1.contractsigningdate}" pattern="yyyy-MM-dd"/>"></li>
                <li>合同截止日期： <input type="date" name="contractexpirationdate" value="<fmt:formatDate value="${employee1.contractexpirationdate}" pattern="yyyy-MM-dd"/>"></li>
                <li>合同内容： <input type="text" name="contractcontents" value="${employee1.contractcontents}"></li>
            </ul>
            <input type="submit" value="录入">
        </form>
</body>
</html>
