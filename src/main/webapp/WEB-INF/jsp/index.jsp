<%--
  Created by IntelliJ IDEA.
  User: liuqizhe
  Date: 15/9/28
  Time: 上午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<div id="header">
  <span>当前账号：<b><%=session.getAttribute("user")%></b></span>
  <a href="../login/toLogin.from">[退出]</a>
</div>
<div id="navi">
  <ul id="menu">
    <li><a href="../emplist.from">员工列表</a> </li>
    <li><a href="../deptlist.from">部门列表</a> </li>
  </ul>
</div>
</body>
</html>
