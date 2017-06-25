<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/25
  Time: 上午11:03
  To change this template use File | Settings | File Templates.
--%>
<!-- 如果有一 -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工管理界面</title>
</head>
<body>
<p>员工管理。</p>
<form method="post" action="EmployeeController/insertEmployee.action">
   <ul>
       <li> <input type="text" name="id"></li>
       <li> <input type="text" name="eno"></li>
       <li> <input type="text" name="name"></li>
       <li> <input type="text" name="sex"></li>
       <li> <input type="date" name="brith"></li>
       <li> <input type="text" name="nation"></li>
       <li> <input type="text" name="education"></li>
       <li> <input type="text" name="duty"></li>
       <li> <input type="text" name="domicileplace"></li>
       <li> <input type="text" name="politics"></li>
       <li> <input type="text" name="physiological"></li>
       <li> <input type="date" name="contractsigningdate"></li>
       <li> <input type="date" name="contractexpirationdate"></li>
       <li> <input type="text" name="contractcontents"></li>
   </ul>
       <input type="button" value="录入">
</form>

<table>
<c:forEach var="employee" items="${employeelist}" varStatus="vs">
    <tr <c:if test="${status.count%2==0}">bgcolor="#CCCCFE"</c:if> align="left">

        <td>${employee.id}</td>
    </tr>
</c:forEach>
</table>

</body>
</html>
