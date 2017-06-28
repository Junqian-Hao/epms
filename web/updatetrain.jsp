
<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/27
  Time: 上午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="cn.edu.nuc.epms.entity.Train" %>
<html>
<head>
    <title>修改培训信息</title>
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
<%
    String trainid = request.getParameter("trainid");
%>

<p>培训信息修改</p>
    <form method="post" action="TrainController/updatetrain.action">
        培训编号：<%=trainid%> <br><input type="hidden" name="trainid" value="<%=trainid%>">
        培训开始时间：<input type="date" name="tstarttime" value="<%=request.getParameter("tstarttime")%>"><br>
        培训结束时间：<input type="date" name="tendtime" value="<%=request.getParameter("tendtime")%>"><br>
        培训内容：<input type="text" name="tcontent" value="<%=request.getParameter("tcontent")%>"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
