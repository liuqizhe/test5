<%--
  Created by IntelliJ IDEA.
  User: liuqizhe
  Date: 15/9/24
  Time: 下午2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>dept_info</title>
</head>
<body>
  <h2>部门人员信息</h2>
  <div class="search_add">
    <input type="button" value="添加" class="btn_add" onclick="window.location='toAdd.from';"/>
  </div>
  <table border="1px">
    <tr>
      <td>编号</td>
      <td>姓名</td>
      <td>职位</td>
      <td>薪水</td>
      <td></td>
      <td></td>
    </tr>
    <c:forEach items="${emp}" var="e">
    <tr>
      <td>${e.empno}</td>
      <td>${e.ename}</td>
      <td>${e.job}</td>
      <td>${e.sal}</td>
      <td><input type="button" value="修改" class="btn_delete" onclick="location.href='toUpdate.from?empno=${e.empno}';"/></td>
      <td><input type="button" value="删除" class="btn_update" onclick="deleteEmp(${e.empno});"/></td>
    </tr>
    </c:forEach>
</body>
</html>
