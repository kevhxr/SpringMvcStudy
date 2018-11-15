<%--
  Created by IntelliJ IDEA.
  User: huangxr
  Date: 2018/10/20
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Study Index Page</title>
</head>
<body>
    <form action="springmvc/login" method="post">
        username:<input type="text" name="userName">
        password:<input type="text" name="password"><br>
        <input type="submit" value="login">
    </form>

    <form action="springmvc/login2" method="post">
        username:<input type="text" name="userName">
        password:<input type="text" name="password"><br>
        identity:<br>
        admin<input type="checkbox" name="identity" value="admin"><br>
        cook<input type="checkbox" name="identity" value="cook"><br>
        father<input type="checkbox" name="identity" value="father"><br>
        <input type="submit" value="login">
    </form>

    <form action="springmvc/login3" method="post">
        username:<input type="text" name="users[0].userName">
        password:<input type="text" name="users[0].password">
        username2:<input type="text" name="users[1].userName">
        password2:<input type="text" name="users[1].password"><br>
        <input type="submit" value="login">
    </form>

    <br>
    <a href="helloWorld">hello world</a>
    <br><br>
    <a href="register">register</a>
    <br><br>
    <a href="springmvc/login4/123/evvv">register4</a>
    <br><br>
    <a href="springmvc/login5">register5</a>
</body>
</html>
