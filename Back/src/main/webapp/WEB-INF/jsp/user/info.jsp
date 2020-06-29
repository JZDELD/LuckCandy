<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="renderer" content="webkit">
    <title>信息详情</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/user/index.css">
    <script src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
    <script src="${pageContext.request.contextPath }/js/user/info.js" type="text/javascript" charset="utf-8"></script>

    <script type="text/javascript">
        $(function () {
            $("[name=sex]").eq(${user.sex}).click();
        });
    </script>
</head>

<body>
<c:if test="${not empty msg}">
    <div id="msg">
        <h2>提示信息</h2>
        <div id="msg-msg">${msg}</div>
        <div id="msg-btn">确认</div>
    </div>
</c:if>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 用户信息详情</strong></div>
    <div class="body-content">
        <form enctype="multipart/form-data" method="post" class="form-x"
              action="${pageContext.request.contextPath }/user/updateUserInfo.action">
            <input type="hidden" name="queryId" value="${query.queryId}"/>
            <input type="hidden" name="queryUserName" value="${query.queryUserName}"/>
            <input type="hidden" name="queryHome" value="${query.queryHome}"/>
            <input type="hidden" name="pageNow" value="${query.pageNow}"/>
            <div class="form-group">
                <div class="label">
                    <label>ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="id" value="${user.id}" readonly/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>用户名：</label>
                    </div>
                    <input type="text" class="input w50" name="userName" value="${user.userName}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>头像：</label>
                </div>
                <div class="field">
                    <c:choose>
                        <c:when test="${not empty user.avatar}">
                            <img id="pic-img" src="${user.avatar}" alt='头像'
                                 style="width: 150px;height: 150px;"/>
                        </c:when>
                        <c:otherwise>
                            <img id="pic-img" src="${pageContext.request.contextPath}/img/user/y.jpg" alt='头像'
                                 style="width: 150px;height: 150px;"/>
                        </c:otherwise>
                    </c:choose>
                    <input id="pic-btn" type="button" class="button bg-blue margin-left" id="image1" value="+ 修改头像">
                    <input id="pic-file" type="file" name="avatarFile" hidden="" value=""/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>手机号：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="tel" value="${user.tel}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>Email：</label>
                    </div>
                    <input type="text" class="input w50" name="email" value="${user.email}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>生日：</label>
                </div>
                <div class="field">
                    <input type="date" class="input w50" name="birthDate"
                           value="<fmt:formatDate value="${user.birthDate}" pattern="yyyy-MM-dd"/>"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>性别：</label>
                    </div>
                    <div class="button-group radio">
                        <label class="button active">
                            <span class="icon icon-male"></span>

                            <input name="sex" value="0" type="radio"}>男
                        </label>
                        <label class="button active">
                            <span class="icon icon-female"></span>
                            <input name="sex" value="1" type="radio"}>女
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>所在地：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="home" value="${user.home}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>详细地址：</label>
                    </div>
                    <input type="text" class="input w50" name="address" value="${user.address}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>个性签名：</label>
                </div>
                <div class="field">
                    <textarea class="input w50" name="signature"
                              style="height:130px;resize: none;">${user.signature}</textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>注册时间：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="regTime"
                           value="<fmt:formatDate value="${user.regTime}" pattern="yyyy/MM/dd HH:mm:ss"/>" disabled/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>备注：</label>
                    </div>
                    <input type="text" class="input w50" name="remark" value="${user.remark}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <input class="button bg-green icon-check-square-o" type="reset" name="" id="" value="重置"/>
                    <button class="button bg-main icon-check-square-o" type="submit"> 修改</button>
                    <a href="${pageContext.request.contextPath}/user/findUserByQuery.action?pageNow=${query.pageNow}&queryId=${query.queryId}&queryUserName=${query.queryUserName}&queryHome=${query.queryHome}">
                        <button class="button bg-red icon-caret-left" type="button"> 返回</button>
                    </a>
                </div>
            </div>
        </form>
    </div>
</div>
</body>

</html>