<%--
  Created by IntelliJ IDEA.
  User: insist
  Date: 2020/5/27
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="update" method="post">
        <input type="hidden" name="id" value="${cat.id}">
        姓名：<input type="text" name="name" value="${cat.name}"><br>
        年龄：<input type="text" name="age" value="${cat.age}"><br>
        种类：<input type="text" name="kind" value="${cat.kind}"><br>
        性别：<input type="text" name="sex" value="${cat.sex}"><br>
        <input type="submit"  value="提交">
    </form>
</body>
</html>
