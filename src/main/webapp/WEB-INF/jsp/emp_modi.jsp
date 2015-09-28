<%--
  Created by IntelliJ IDEA.
  User: liuqizhe
  Date: 15/9/24
  Time: 下午2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>emp_add</title>
</head>
<body>
<div>
</div>
  <div id="main">

    <div id="save_result_info" class="sava_file">保存失败</div>
    <form:form action="updateEmp.from" method="post" commandName="emp" class="main_form">
      <div class="text_info clearfix"><span>编号</span></div>
      <div class="input_info">
        <form:input path="empno" cssClass="readonly" readonly="true"/>
        <span class="required">*</span>
        <div class="validate_msg_short">编号重复</div>
      </div>
      <div class="text_info clearfix"><span>姓名</span></div>
      <div class="input_info">
        <form:input path="ename" class="width300"/>
      </div>
      <div class="text_info clearfix"><span>职位</span></div>
      <div class="input_info">
        <form:input path="job" class="width300"/>
      </div>
      <div class="text_info clearfix"><span>管理员编号</span></div>
      <div class="input_info">
        <form:input path="mgr" class="width300"/>
      </div>
      <div class="text_info clearfix"><span>薪水</span></div>
      <div class="input_info">
        <form:input path="sal" class="width300"/>
      </div>
      <div class="text_info clearfix"><span>奖金</span></div>
      <div class="input_info">
        <form:input path="comm" class="width300"/>
      </div>
      <div class="text_info clearfix"><span>部门号</span></div>
      <div class="input_info">
        <form:input path="deptno" class="width300"/>
      </div>
      <div class="button_info clearfix">
        <input type="submit" value="保存" class="btn_save"/>
        <input type="button" value="取消" class="btn_save" onclick="location.href='emplist.from';"/>
      </div>
    </form:form>
  </div>
</body>
</html>
