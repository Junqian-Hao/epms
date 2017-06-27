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

    <form method="post" action="EmployeeController/updateEmployee.action">
            <ul>
                <li>ID：${employee.id} <input type="hidden" name="id" value="<%=request.getParameter("id")%>"></li>
                <li> <input type="text" name="eno" value="<%=request.getParameter("eno")%>"></li>
                <li> <input type="text" name="name" value="<%=request.getParameter("name")%>"></li>
                <li> <input type="text" name="sex" value="<%=request.getParameter("sex")%>"></li>
                <li> <input type="date" name="birth" value="<%=request.getParameter("birth")%>"></li>
                <li> <input type="text" name="nation" value="<%=request.getParameter("nation")%>"></li>
                <li> <input type="text" name="education" value="<%=request.getParameter("education")%>"></li>
                <li> <input type="text" name="duty" value="<%=request.getParameter("duty")%>"></li>
                <li> <input type="text" name="domicileplace" value="<%=request.getParameter("domicileplace")%>"></li>
                <li> <input type="text" name="politics" value="<%=request.getParameter("politics")%>"></li>
                <li> <input type="text" name="physiological" value="<%=request.getParameter("physiological")%>"></li>
                <li> <input type="date" name="contractsigningdate" value="<%=request.getParameter("contractsigningdate")%>"></li>
                <li> <input type="date" name="contractexpirationdate" value="<%=request.getParameter("contractexpirationdate")%>"></li>
                <li> <input type="text" name="contractcontents" value="<%=request.getParameter("contractcontents")%>"></li>
            </ul>
            <input type="submit" value="录入">
        </form>
</body>
</html>
