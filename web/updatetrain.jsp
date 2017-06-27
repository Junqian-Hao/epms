<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 2017/6/27
  Time: 上午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改培训信息</title>
</head>
<body>

<p>培训信息修改</p>
    <form method="post" action="TrainController/updatetrain.action">
        培训编号：<input type="hidden" name="trainid" value="${train.trainid}">
        培训开始时间：<input type="date" name="tstarttime" value="${train.tstarttime}">
        培训结束时间：<input type="date" name="tendtime" value="${train.tendtime}">
        培训内容：<input type="text" name="tcontent" value="${train.tcontent}">
        <input type="submit" value="提交">
    </form>
</body>
</html>
