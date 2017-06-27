<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/27
  Time: 上午11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加培训项目</title>
</head>
<body>
<p>添加培训项目</p>
<form action="TrainController/inserttrain.action" method="post">
    <input type="date" name="tstarttime">
    <input type="date" name="tendtime">
    <input type="text" name="tcontent">
    <input type="submit" value="提交">
</form>
</body>
</html>
