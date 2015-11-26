<%--
  Created by IntelliJ IDEA.
  User: liuqizhe
  Date: 15/9/28
  Time: 上午9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
  <link type="text/css" rel="stylesheet" media="all" href="../styles/global.css" />
  <link type="text/css" rel="stylesheet" media="all" href="../styles/global_color.css" />

  <script type="text/javascript">
      function doSubmit() {
        document.getElementById("loginForm").submit() ;
      }

//    $(function () {
//      $('#code').click(function() {
//        $('#code').src="getCode.from?K=" + Math.random() ;
//      }) ;
//    }) ;

    </script>
</head>
<body>
  <form id="loginForm" action="login.from" method="post">
    <div>
      <table>
      <tr>
        <td class="login_info">账号：</td>
        <td colspan="2"><input name="username" type="text" class="width150"/></td>
        <td class="login_error_info"><span class="required">30长度的字母数字和下划线</span></td>
      </tr>
      <tr>
        <td class="login_info">密码：</td>
        <td colspan="2"><input name="password" type="password" class="width150"/></td>
        <td><span class="required">30长度的字母数字下划线</span></td>
      </tr>
      <tr>
        <td class="login_info">验证码：</td>
        <td class="width70"><input name="code" type="text" class="width70"/></td>
        <td><img src="getCode.from" alt="验证码" title="点击更换" onClick="this.src='getCode.from?';"/></td>
        <td><span class="required">${code_error}</span></td>
      </tr>
      <tr>
        <td></td>
        <td class="login.button" colspan="2"><a href="#" onclick="doSubmit();"><img src="../images/login_btn.png"/></a></td>
        <td><span class="required">${error}</span> </td>
      </tr>
      </table>
    </div>
  </form>
</body>
</html>
