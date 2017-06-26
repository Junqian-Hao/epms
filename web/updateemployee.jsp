<%@ page import="cn.edu.nuc.epms.entity.Employee" %><%--
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
<%
    String id = request.getParameter("id");
    String eno = request.getParameter("eno");
    String name = request.getParameter("name");
    String sex = request.getParameter("sex");
    String birth = request.getParameter("birth");
    String nation = request.getParameter("nation");
    String education = request.getParameter("education");
    String duty = request.getParameter("duty");
    String domicileplace = request.getParameter("domicileplace");
    String politics = request.getParameter("politics");
    String physiological = request.getParameter("physiological");
    String contractsigningdate = request.getParameter("contractsigningdate");
    String contractexpirationdate = request.getParameter("contractexpirationdate");
    String contractcontents = request.getParameter("contractcontents");
%>
    <form method="post" action="EmployeeController/update.action">
            <ul>
                <li>ID：<%=id%> <input type="hidden" name="id" value="<%=id%>"></li>
                <li> <input type="text" name="eno" value="<%=eno%>"></li>
                <li> <input type="text" name="name" value="<%=name%>"></li>
                <li> <input type="text" name="sex" value="<%=sex%>"></li>
                <li> <input type="date" name="birth" value="<%=birth%>"></li>
                <li> <input type="text" name="nation" value="<%=nation%>"></li>
                <li> <input type="text" name="education" value="<%=education%>"></li>
                <li> <input type="text" name="duty" value="<%=duty%>"></li>
                <li> <input type="text" name="domicileplace" value="<%=domicileplace%>"></li>
                <li> <input type="text" name="politics" value="<%=politics%>"></li>
                <li> <input type="text" name="physiological" value="<%=physiological%>"></li>
                <li> <input type="date" name="contractsigningdate" value="<%=contractsigningdate%>"></li>
                <li> <input type="date" name="contractexpirationdate" value="<%=contractexpirationdate%>"></li>
                <li> <input type="text" name="contractcontents" value="<%=contractcontents%>"></li>
            </ul>
            <input type="submit" value="录入">
        </form>
</body>
</html>
