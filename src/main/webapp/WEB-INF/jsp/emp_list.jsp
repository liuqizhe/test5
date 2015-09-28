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
    <script type="text/javascript">

      function deleteEmp(empno) {
        var r = window.confirm("确定删除"+empno+"吗") ;
        if(r) {
          window.location="deleteEmp.from?empno="+empno ;
        }
      }

    </script>
</head>
<body>
  <h2>员工列表</h2>
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
    <c:forEach items="${emps}" var="e">
    <tr>
      <td>${e.empno}</td>
      <td>${e.ename}</td>
      <td>${e.job}</td>
      <td>${e.sal}</td>
      <td><input type="button" value="修改" class="btn_delete" onclick="location.href='toUpdate.from?empno=${e.empno}';"/></td>
      <td><input type="button" value="删除" class="btn_update" onclick="deleteEmp(${e.empno});"/></td>
    </tr>
    </c:forEach>
    <div id="pages">
      <c:choose>
        <c:when test="${page.page>1}">
          <a href="emplist.from?page=${page.page-1}">上一页</a>
        </c:when>
        <c:otherwise>
          <a>上一页</a>
        </c:otherwise>
      </c:choose>

      <c:forEach var="i" begin="1" end="${page.totalPage}">
        <c:choose>
          <c:when test="${i==page.page}">
            <a href="emplist.from?page=${i}" class="current_page">${i}</a>
          </c:when>
          <c:otherwise>
            <a href="emplist.from?page=${i}">${i}</a>
          </c:otherwise>
        </c:choose>
      </c:forEach>

      <c:choose>
        <c:when test="${page.page<page.totalPage}">
          <a href="emplist.from?page=${page.page+1}">下一页</a>
        </c:when>
        <c:otherwise>
          <a>下一页</a>
        </c:otherwise>
      </c:choose>

    </div>
  </table>
</body>
</html>
