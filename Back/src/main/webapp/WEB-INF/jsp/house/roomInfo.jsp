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
    <title>房间信息详情</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/house/index.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/house/info.css">
    <script src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
    <script src="${pageContext.request.contextPath }/js/house/info.js" type="text/javascript"
            charset="utf-8"></script>
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
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 房间信息详情</strong></div>
    <div class="body-content">
        <form enctype="multipart/form-data" method="post" class="form-x"
              action="${pageContext.request.contextPath }/room/updateRoomInfo.action">
            <input type="hidden" name="queryId" value="${query.queryId}"/>
            <input type="hidden" name="queryStatus" value="${query.queryStatus}"/>
            <input type="hidden" name="queryCityId" value="${query.queryCityId}"/>
            <input type="hidden" name="queryLandlordId" value="${query.queryLandlordId}"/>
            <input type="hidden" name="pageNow" value="${query.pageNow}"/>
            <input type="hidden" name="houseId" value="${roomDTO.room.houseId}"/>
            <input type="hidden" name="configurationId" value="${roomDTO.room.configurationId}"/>
            <div class="form-group">
                <div class="label">
                    <label>ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="id" value="${roomDTO.room.id}" readonly/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>房间照片：</label>
                </div>
                <div class="field">
                    <c:choose>
                        <c:when test="${not empty roomDTO.room.image}">
                            <img id="pic-img" src="${roomDTO.room.image}" alt='封面'
                                 style="width: 320px;height: 180px;"/>
                        </c:when>
                        <c:otherwise>
                            <img id="pic-img" src="${pageContext.request.contextPath}/img/house/fm.jpg" alt='封面'
                                 style="width: 320px;height: 180px;"/>
                        </c:otherwise>
                    </c:choose>
                    <input id="pic-btn" type="button" class="button bg-blue margin-left" value="+ 选择">
                    <input id="pic-file" type="file" name="imageFile" hidden="" value=""/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>房间视频：</label>
                </div>
                <div class="field">
                    <video id="video-video" src="${roomDTO.room.video}" controls="controls"
                           style="width: 384px;height: 216px;"></video>
                    <input id="video-btn" type="button" class="button bg-blue margin-left" value="+ 选择">
                    <input id="video-file" type="file" name="videoFile" hidden="" value=""/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>标题：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="title" value="${roomDTO.room.title}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>状态：</label>
                    </div>
                    <select class="input w30" name="status">
                        <option value="1" ${roomDTO.room.status == 1 ? "selected" : ""}>空闲</option>
                        <option value="2" ${roomDTO.room.status == 2 ? "selected" : ""}>预租</option>
                        <option value="3" ${roomDTO.room.status == 3 ? "selected" : ""}>转租</option>
                        <option value="4" ${roomDTO.room.status == 4 ? "selected" : ""}>已出租</option>
                        <option value="5" ${roomDTO.room.status == 5 ? "selected" : ""}>已下架</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>简介</label>
                </div>
                <div class="field">
            		<textarea class="input w50" name="introduction"
                              style="height:130px;resize: none;">${roomDTO.room.introduction}</textarea>
                    <div class="tips"></div>
                    <div class="label">
                        <label>可用面积：</label>
                    </div>
                    <input type="text" class="input w30c" name="area" value="${roomDTO.room.area}" maxlength="2"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <hr/>
            <div class="form-group">
                <div style="padding: 5px 0 5px 20px;">
                    <h1>费用设置</h1>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>月付：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w20c" name="monthlyPrice" value="${roomDTO.room.monthlyPrice}"
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>季付：</label>
                    </div>
                    <input type="text" class="input w20c" name="seasonPrice" value="${roomDTO.room.seasonPrice}"
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>半年付：</label>
                    </div>
                    <input type="text" class="input w20c" name="halfYearPrice" value="${roomDTO.room.halfYearPrice}"
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>押金：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w20c" name="deposit" value="${roomDTO.room.deposit}" maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>服务费：</label>
                    </div>
                    <input type="text" class="input w20c" name="servicePrice" value="${roomDTO.room.servicePrice}"
                           maxlength="4"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <hr/>
            <div class="form-group">
                <div style="padding: 5px 0 5px 20px;">
                    <h1>配置详情</h1>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>床位：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w10c" name="bed" value="${roomDTO.configuration.bed}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>卫生间：</label>
                    </div>
                    <input type="text" class="input w10c" name="bathroom" value="${roomDTO.configuration.bathroom}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>空调：</label>
                    </div>
                    <input type="text" class="input w10c" name="airConditioning"
                           value="${roomDTO.configuration.airConditioning}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>电视：</label>
                    </div>
                    <input type="text" class="input w10c" name="TV" value="${roomDTO.configuration.TV}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>路由器：</label>
                    </div>
                    <input type="text" class="input w10c" name="router" value="${roomDTO.configuration.router}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>智能锁：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w10c" name="smartLock" value="${roomDTO.configuration.smartLock}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>油烟机：</label>
                    </div>
                    <input type="text" class="input w10c" name="rangeHood" value="${roomDTO.configuration.rangeHood}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>冰箱：</label>
                    </div>
                    <input type="text" class="input w10c" name="refrigerator"
                           value="${roomDTO.configuration.refrigerator}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>微波炉：</label>
                    </div>
                    <input type="text" class="input w10c" name="microwaveOven"
                           value="${roomDTO.configuration.microwaveOven}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>浴霸：</label>
                    </div>
                    <input type="text" class="input w10c" name="yuba" value="${roomDTO.configuration.yuba}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>洗衣机：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w10c" name="washingMachine"
                           value="${roomDTO.configuration.washingMachine}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>衣柜：</label>
                    </div>
                    <input type="text" class="input w10c" name="wardrobe" value="${roomDTO.configuration.wardrobe}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>桌子：</label>
                    </div>
                    <input type="text" class="input w10c" name="table" value="${roomDTO.configuration.table}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>椅子：</label>
                    </div>
                    <input type="text" class="input w10c" name="chair" value="${roomDTO.configuration.chair}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <hr/>
            <div class="form-group">
                <div class="label">
                    <label>备注：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="remark"
                           value="${roomDTO.room.remark}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <input class="button bg-green icon-check-square-o" type="reset" name="" id="" value="重置"/>
                    <button class="button bg-main icon-check-square-o" type="submit"> 修改</button>
                    <a href="${pageContext.request.contextPath}/house/details.action?id=${roomDTO.room.houseId}&pageNow=${query.pageNow}&queryId=${query.queryId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}&queryLandlordId=${query.queryLandlordId}">
                        <button class="button bg-red icon-caret-left" type="button"> 返回</button>
                    </a>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
