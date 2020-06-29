<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
  <meta name="renderer" content="webkit">
  <title>添加房东信息</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/landlord/index.css">
  <script src="${pageContext.request.contextPath }/js/jquery.js"></script>
  <script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
  <script src="${pageContext.request.contextPath }/js/landlord/index.js"></script>
</head>
<body>
<c:if test="${not empty msg}">
  <div id="msg">
    <h2>提示信息</h2>
    <div id="msg-msg">${msg}</div>
    <div id="msg-btn">确认</div>
  </div>
</c:if>
<div class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>添加房东信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath}/landlord/insertLandlord.action">
      <input type="hidden" name="queryId" value="${query.queryId}"/>
      <input type="hidden" name="queryName" value="${query.queryName}"/>
      <input type="hidden" name="queryHome" value="${query.queryHome}"/>
      <input type="hidden" name="pageNow" value="${query.pageNow}"/>
      <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input id="zc-name" type="text" class="input w50" name="name" value="" maxlength="8"
                 data-validate="required:姓名不能为空"/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>手机号：</label>
        </div>
        <div class="field">
          <input id="zc-tel" type="text" class="input w50" name="tel" autocomplete="off" maxlength="11"
                 oninput="value=value.replace(/[^\d]/g,'')" data-validate="required:手机号不能为空,phone:请输入正确的手机号"/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>银行卡号：</label>
        </div>
        <div class="field">
          <input id="zc-bankCard" type="text" class="input w50" name="bankCard" autocomplete="off" maxlength="19"
                 data-validate="length#>=19:银行卡号位数不足19位"/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>密码：</label>
        </div>
        <div class="field">
          <input id="zc-pwd" type="password" class="input w50" name="password" value=""
                 placeholder="密码长度最多为16位" maxlength="16" data-validate="required:请输入密码,length#>=5:密码不能小于5位"/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>确认密码：</label>
        </div>
        <div class="field">
          <input id="zc-rePwd" type="password" class="input w50" name="password2" value="" maxlength="16"
                 data-validate="required:请再次输入密码,repeat#password:两次输入的密码不一致"/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <input class="button bg-green icon-check-square-o" type="reset" name="" id="" value="重置"/>
          <button id="zc" class="button bg-main icon-check-square-o" type="submit"> 添加</button>
          <a href="${pageContext.request.contextPath}/landlord/findLandlordByQuery.action?pageNow=${query.pageNow}&queryId=${query.queryId}&queryName=${query.queryName}&queryHome=${query.queryHome}">
            <button class="button bg-red icon-caret-left" type="button"> 返回</button>
          </a>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>