<%--
  Created by IntelliJ IDEA.
  User: wangchao (专业bug开发）
  Date: 2022/5/20
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>欢迎登陆</title>
    <link rel="stylesheet" type="text/css" href="static/css/index.css">
</head>
<body>
<div class="wrap">
    <div class="container" >
        <h1>Welcome Login</h1>
        <form method="post" action="${pageContext.request.contextPath}/user/login" >
            <input type="text"  placeholder="UserName"   name="username"   id="UserName"/>
            <input type="password"  placeholder="PassWord"   name="password"   id="PassWord"/>
            <input type="submit" value="Login"/>
        </form>
        <form method="post" action="${pageContext.request.contextPath}/user/register">
            <input type="submit" value="Register"/>
        </form>
    </div>

    <ul>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>
</div>
</body>
</html>
