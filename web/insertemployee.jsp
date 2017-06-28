<%@ page import="cn.edu.nuc.epms.entity.Remove" %><%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/26
  Time: 下午3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入员工信息</title>
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

<form method="post" action="EmployeeController/insertEmployee.action">
    <ul>
        <li> ID:<input type="text" name="id"></li>
        <li> ENO:<input type="text" name="eno"></li>
        <li> NAME:<input type="text" name="name"></li>
        <li> SEX:<input type="text" name="sex"></li>
        <li> BIRTH:<input type="date" name="birth"></li>
        <li> NATION:<input type="text" name="nation"></li>
        <li> EDUCATION:<input type="text" name="education"></li>
        <li> DUTY:<input type="text" name="duty"></li>
        <li> DOMICILEPLACE:<input type="text" name="domicileplace"></li>
        <li> POLITICS:<input type="text" name="politics"></li>
        <li> PHYSIOLOGICAL:<input type="text" name="physiological"></li>
        <li> CONTRACTSIGNINGDATE:<input type="date" name="contractsigningdate"></li>
        <li> CONTRACTSIGNINGDATE:<input type="date" name="contractexpirationdate"></li>
        <li> CONTRACTCONTENTS:<input type="text" name="contractcontents"></li>
    </ul>
    <input type="submit" value="录入">
</form>

</body>
</html>
