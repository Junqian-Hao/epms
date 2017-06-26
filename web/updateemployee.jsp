<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/26
  Time: 下午12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改员工信息</title>
</head>
<body>

    <form method="post" action="EmployeeController/update.action">
            <ul>
                <li>ID：${employee.id} <input type="hidden" name="id" value="${employee.id}"></li>
                <li> <input type="text" name="eno" value="${employee.eno}"></li>
                <li> <input type="text" name="name" value="${employee.name}"></li>
                <li> <input type="text" name="sex" value="${employee.sex}"></li>
                <li> <input type="date" name="birth" value="new java.util.Date${employee.birth}"></li>
                <li> <input type="text" name="nation" value="${employee.nation}"></li>
                <li> <input type="text" name="education" value="${employee.education}"></li>
                <li> <input type="text" name="duty" value="${employee.duty}"></li>
                <li> <input type="text" name="domicileplace value="${employee.domicileplace}"></li>
                <li> <input type="text" name="politics" value="${employee.politics}"></li>
                <li> <input type="text" name="physiological" value="${employee.physiological}"></li>
                <li> <input type="date" name="contractsigningdate" value="${employee.contractsigningdate}"></li>
                <li> <input type="date" name="contractexpirationdate" value="${employee.contractexpirationdate}"></li>
                <li> <input type="text" name="contractcontents" value="${employee.contractcontents}"></li>
            </ul>
            <input type="submit" value="录入">
        </form>
</body>
</html>
