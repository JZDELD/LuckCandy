<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/login.css"/>
		<script src="${pageContext.request.contextPath}/js/jquery-1.7.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/js/admin/login.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body onselectstart="return false">
		<div class="login-box">
			<div class="log-1" style="padding: 10px;">管理员登录</div>
			<div class="log-2">
				<form class="log-form" action="${pageContext.request.contextPath}/admin/login.action" method="post" onsubmit="return isNull()">
					<div class="log-2-1">
						<div class="pic1" id="zhanghao"></div>
						<input name="account" lay-verify="userName" type="text" autocomplete="off" placeholder="请输入账号" />
					</div>
					<div class="log-2-1">
						<div class="pic1" id="mima"></div>
						<input name="password"  lay-verify="password" type="password" placeholder="请输入密码" />
					</div>
					<div class="log-2-2">
						<label>记住账号？</label>
						<div class="jzmm">
							<input id="remeber" name="rememberMe" type="checkbox" value="true" />
							<i></i>
						</div>
					</div>
					<div class="log-2-2">
						<input id="dneglu" class="btn" type="submit" value="登录" />
					</div>
				</form>
			</div>
			<div class="log-3">
				<p>luckcandy © www.luckcandy.com</p>
			</div>
			<c:if test="${not empty requestScope.msg }">
			<div class="msg">
				<div class="msg1">
					<div>警&nbsp;&nbsp;告</div>
					<p>你输入的账号或密码不正确，原因可能是:</p>
					<p>1、账号输入有误;</p>
					<p>2、忘记密码;</p>
					<p>3、未区分字母大小写;</p>
					<p>4、未开启小写键盘。</p><br />
					<p>如果你的密码丢失或遗忘，可呼叫超级管理员找回密码。</p>
				</div>
				<div class="msg2">
					<input id="btn2" type="button" value="确定" />
				</div>
			</div>
			</c:if>
			
		</div>
		
	</body>
</html>
