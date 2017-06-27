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
    培训编号：<<input type="number" name="trainid">
   培训项目起始日期:<input type="date" name="tstarttime">
    培训项目截止日期:<input type="date" name="tendtime">
     培训内容:<input type="text" name="tcontent">
    <input type="submit" value="提交">
</form>
</body>
</html>
