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
    <title>dept_list</title>
    <script type="text/javascript">

    </script>
</head>
<body>
  <h2>部门列表</h2>
  <table border="1px">
    <tr>
      <td>部门号</td>
      <td>部门名</td>
      <td>地点</td>
      <td>主管</td>
      <td></td>
      <td></td>
    </tr>
    <c:forEach items="${depts}" var="d">
    <tr>
      <td>${d.deptno}</td>
      <td>${d.dname}</td>
      <td>${d.loc}</td>
      <td>${d.manager}</td>
      <td><input type="button" value="查看人员信息" class="btn_delete" onclick="location.href='toInfo.from?deptno=${d.deptno}';"/></td>
      <td></td>
      <!--
      <td></td>
      <td><input type="button" value="修改" class="btn_delete" onclick="location.href='toUpdate.from?empno=';"/></td>
      <td><input type="button" value="删除" class="btn_update" onclick="deleteEmp();"/></td>
      -->
    </tr>
    </c:forEach>
  </table>
</body>
</html>
