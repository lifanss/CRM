<%--
  Created by IntelliJ IDEA.
  User: insist
  Date: 2020/5/27
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="addCat" method="post">
        编号：<input type="text" name="id" value=""><br>
        姓名：<input type="text" name="name" value=""><br>
        年龄：<input type="text" name="age" value=""><br>
        种类：<input type="text" name="kind" value=""><br>
        性别：<input type="text" name="sex" value=""><br>
        <input type="submit" value="添加">
    </form>
</body>
</html>
