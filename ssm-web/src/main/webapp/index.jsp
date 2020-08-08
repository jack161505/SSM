<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

This is index page!
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
