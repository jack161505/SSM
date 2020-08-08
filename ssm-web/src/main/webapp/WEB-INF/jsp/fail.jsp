<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 2020/8/2
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fail</title>
</head>
<body>
This is relogin page!
<h2>请登录</h2>
<form action="login" method="post">
    用户名：<input type="text" name="loginname" value="请输入用户名！"><br/>
    密码：<input type="text" name="loginpwd" value="请输入密码"><br/>
    <c:if test="${msg!=null}">
        <span style="color: red">${msg}</span> <br/>
    </c:if>
    <input type="submit" value="登录">
</form>
</body>
</html>
