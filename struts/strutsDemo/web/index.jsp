<%--
  Created by IntelliJ IDEA.
  User: linming
  Date: 2015/12/24 0024
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>hi struts</title>
  </head>
  <body>
  <p>hi struts</p>
  <a href="WEB-INF/jsp/login.jsp">login page</a>
  <form action="/lifec-tw/loginActioin.action" method="post">
    <label>用户名：</label><input type="text" name="username">
    <label>密码：</label><input type="password" name="password">
    <input type="submit" value="submit">
  </form>
  </body>
</html>
