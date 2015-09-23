<%--
  Created by IntelliJ IDEA.
  User: liuqizhe
  Date: 15/9/23
  Time: 下午1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>emp_list</title>
</head>
<body>
  <h2>员工列表</h2>
  <table border="1px">
    <tr>
      <td>编号</td>
      <td>姓名</td>
      <td>职位</td>
      <td>薪水</td>
      <td></td>
      <td></td>
    </tr>
    <c:forEach items="${emps}" var="e">
    <tr>
      <td>${e.empno}</td>
      <td>${e.ename}</td>
      <td>${e.job}</td>
      <td>${e.sal}</td>
      <td><a href="delete.from?id=${e.empno}">删除</a> </td>
      <td><a href="toupdate.from?id=${e.empno}">修改</a> </td>
    </tr>
    </c:forEach>
  </table>
</body>
</html>
