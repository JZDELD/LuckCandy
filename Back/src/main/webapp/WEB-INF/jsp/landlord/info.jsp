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
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/landlord/index.css">
    <script src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
    <script src="${pageContext.request.contextPath }/js/landlord/info.js" type="text/javascript" charset="utf-8"></script>

    <script type="text/javascript">
        $(function () {
            $("[name=sex]").eq(${landlord.sex}).click();
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
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 房东信息详情</strong></div>
    <div class="body-content">
        <form enctype="multipart/form-data" method="post" class="form-x"
              action="${pageContext.request.contextPath }/landlord/updateLandlordInfo.action">
            <input type="hidden" name="queryId" value="${query.queryId}"/>
            <input type="hidden" name="queryName" value="${query.queryName}"/>
            <input type="hidden" name="queryHome" value="${query.queryHome}"/>
            <input type="hidden" name="pageNow" value="${query.pageNow}"/>
            <div class="form-group">
                <div class="label">
                    <label>ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="id" value="${landlord.id}" readonly/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>姓名：</label>
                    </div>
                    <input type="text" class="input w50" name="name" value="${landlord.name}"/>
                    <a href="${pageContext.request.contextPath}/house/findHouseByQuery.action?queryLandlordId=${landlord.id}">
                        <button style="margin-left: 50px;" class="button bg-yellow icon-home" type="button"> 查看房屋</button>
                    </a>
                    <a href="${pageContext.request.contextPath}/house/insert.action?id=${landlord.id}&pageNow=${query.pageNow}&queryId=${query.queryId}&queryName=${query.queryName}&queryHome=${query.queryHome}">
                        <button class="button bg-red icon-plus" type="button"> 添加房屋</button>
                    </a>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>头像：</label>
                </div>
                <div class="field">
                    <c:choose>
                        <c:when test="${not empty landlord.avatar}">
                            <img id="pic-img" src="${landlord.avatar}" alt='头像'
                                 style="width: 150px;height: 150px;"/>
                        </c:when>
                        <c:otherwise>
                            <img id="pic-img" src="${pageContext.request.contextPath}/img/landlord/y.jpg" alt='头像'
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
                    <input type="text" class="input w50" name="tel" value="${landlord.tel}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>银行卡号：</label>
                    </div>
                    <input type="text" class="input w50" name="bankCard" value="${landlord.bankCard}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>生日：</label>
                </div>
                <div class="field">
                    <input type="date" class="input w50" name="birthDate"
                           value="<fmt:formatDate value="${landlord.birthDate}" pattern="yyyy-MM-dd"/>"/>
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
                    <input type="text" class="input w50" name="home" value="${landlord.home}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>详细地址：</label>
                    </div>
                    <input type="text" class="input w50" name="address" value="${landlord.address}"/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>注册时间：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="regTime"
                           value="<fmt:formatDate value="${landlord.regTime}" pattern="yyyy/MM/dd HH:mm:ss"/>" disabled/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>备注：</label>
                    </div>
                    <input type="text" class="input w50" name="remark" value="${landlord.remark}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <input class="button bg-green icon-check-square-o" type="reset" name="" id="" value="重置"/>
                    <button class="button bg-main icon-check-square-o" type="submit"> 修改</button>
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