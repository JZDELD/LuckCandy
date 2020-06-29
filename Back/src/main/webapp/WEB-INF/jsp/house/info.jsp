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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/house/index.css">
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
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 房屋信息详情</strong></div>
    <div class="body-content">
        <form enctype="multipart/form-data" method="post" class="form-x"
              action="${pageContext.request.contextPath }/house/updateHouseInfo.action">
            <input type="hidden" name="queryId" value="${query.queryId}"/>
            <input type="hidden" name="queryStatus" value="${query.queryStatus}"/>
            <input type="hidden" name="queryCityId" value="${query.queryCityId}"/>
            <input type="hidden" name="queryLandlordId" value="${query.queryLandlordId}"/>
            <input type="hidden" name="pageNow" value="${query.pageNow}"/>
            <input type="hidden" name="configurationId" value="${houseDTO.house.configurationId}"/>
            <div class="form-group">
                <div class="label">
                    <label>ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w30" name="id" value="${houseDTO.house.id}" readonly/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>业务员：</label>
                    </div>
                    <select class="input w50" name="salesmanId">
                        <option value="0"></option>
                        <c:forEach items="${salesmanList}" var="salesman">
                            <option value="${salesman.id}" ${salesman.id == houseDTO.house.salesmanId ? "selected" : ""}>${salesman.id}：${salesman.name}
                                & 电话：${salesman.tel}</option>
                        </c:forEach>
                    </select>
                    <div class="tips"></div>
                    <a href="${pageContext.request.contextPath}/house/roomInsert.action?id=${houseDTO.house.id}&pageNow=${query.pageNow}&queryId=${query.queryId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}&queryLandlordId=${query.queryLandlordId}">
                        <button style="margin-left: 6%;" class="button bg-red icon-plus" type="button"> 添加房间</button>
                    </a>

                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>房东ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w20" name="" value="${houseDTO.landlord.id}" disabled/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>房东姓名：</label>
                    </div>
                    <input type="text" class="input w20" name="" value="${houseDTO.landlord.name}" disabled/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>房东电话：</label>
                    </div>
                    <input type="text" class="input w30" name="" value="${houseDTO.landlord.tel}" disabled/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>房屋照片：</label>
                </div>
                <div class="field">
                    <c:choose>
                        <c:when test="${not empty houseDTO.house.image}">
                            <img id="pic-img" src="${houseDTO.house.image}" alt='封面'
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
                    <label>房屋视频：</label>
                </div>
                <div class="field">
                    <video id="video-video" src="${houseDTO.house.video}" controls="controls"
                           style="width: 384px;height: 216px;"></video>
                    <input id="video-btn" type="button" class="button bg-blue margin-left" value="+ 选择">
                    <input id="video-file" type="file" name="videoFile" hidden="" value=""/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>市：</label>
                </div>
                <div class="field">
                    <select id="city" class="input w20" name="cityId">
                        <option value="0"></option>
                        <c:forEach items="${cityList}" var="city">
                            <option value="${city.id}"  ${city.id == houseDTO.house.cityId ? "selected" : ""}>${city.cityName}</option>
                        </c:forEach>
                    </select>
                    <div class="tips"></div>
                    <div class="label">
                        <label>区：</label>
                    </div>
                    <select id="region" class="input w20" name="regionId">
                        <option value="0"></option>
                        <c:forEach items="${regionList}" var="region">
                            <option value="${region.id}"  ${region.id == houseDTO.house.regionId ? "selected" : ""}>${region.regionName}</option>
                        </c:forEach>
                    </select>
                    <div class="tips"></div>
                    <div class="label">
                        <label>地铁线：</label>
                    </div>
                    <select id="subway" class="input w20" name="subwayId">
                        <option value="0"></option>
                        <c:forEach items="${subwayList}" var="subway">
                            <option value="${subway.id}"  ${subway.id == houseDTO.house.subwayId ? "selected" : ""}>${subway.subwayLine}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>标题：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="title" value="${houseDTO.house.title}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>状态：</label>
                    </div>
                    <select class="input w30" name="status">
                        <option value="0" ${houseDTO.house.status == 0 ? "selected" : ""}>合租</option>
                        <option value="1" ${houseDTO.house.status == 1 ? "selected" : ""}>空闲</option>
                        <option value="2" ${houseDTO.house.status == 2 ? "selected" : ""}>预租</option>
                        <option value="3" ${houseDTO.house.status == 3 ? "selected" : ""}>转租</option>
                        <option value="4" ${houseDTO.house.status == 4 ? "selected" : ""}>已出租</option>
                        <option value="5" ${houseDTO.house.status == 5 ? "selected" : ""}>已下架</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>简介</label>
                </div>
                <div class="field">
            		<textarea class="input w50" name="introduction"
                              style="height:130px;resize: none;">${houseDTO.house.introduction}</textarea>
                    <div class="tips"></div>
                    <div class="label">
                        <label>面积：</label>
                    </div>
                    <input type="text" class="input w30c" name="area" value="${houseDTO.house.area}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>小区名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="communityName" value="${houseDTO.house.communityName}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>附近商圈名：</label>
                    </div>
                    <input type="text" class="input w50" name="businessCircleName"
                           value="${houseDTO.house.businessCircleName}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>详细地址：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="address" value="${houseDTO.house.address}"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>当前层数：</label>
                    </div>
                    <input type="text" class="input w10c" name="nowFloor" value="${houseDTO.house.nowFloor}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>大楼总层数：</label>
                    </div>
                    <input type="text" class="input w10c" name="totalFloor" value="${houseDTO.house.totalFloor}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>年代：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w20c" name="time" value="${houseDTO.house.time}" maxlength="4"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>绿化度：</label>
                    </div>
                    <input type="text" class="input w20c" name="degreeOfGreening"
                           value="${houseDTO.house.degreeOfGreening}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>电梯(有/无)：</label>
                    </div>
                    <select class="input w20" name="elevator">
                        <option value="0" ${houseDTO.house.elevator == 0 ? "selected" : ""}>无</option>
                        <option value="1" ${houseDTO.house.elevator == 1 ? "selected" : ""}>有</option>
                    </select>
                    <div class="tips"></div>
                    <div class="label">
                        <label>户型：</label>
                    </div>
                    <input type="text" class="input w20c" name="houseType" value="${houseDTO.house.houseType}"
                           maxlength="4"/>
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
                    <input type="text" class="input w20c" name="monthlyPrice" value="${houseDTO.house.monthlyPrice}"
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>季付：</label>
                    </div>
                    <input type="text" class="input w20c" name="seasonPrice" value="${houseDTO.house.seasonPrice}"
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>半年付：</label>
                    </div>
                    <input type="text" class="input w20c" name="halfYearPrice" value="${houseDTO.house.halfYearPrice}"
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>押金：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w20c" name="deposit" value="${houseDTO.house.deposit}" maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>服务费：</label>
                    </div>
                    <input type="text" class="input w20c" name="servicePrice" value="${houseDTO.house.servicePrice}"
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
                    <input type="text" class="input w10c" name="bed" value="${houseDTO.configuration.bed}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>卫生间：</label>
                    </div>
                    <input type="text" class="input w10c" name="bathroom" value="${houseDTO.configuration.bathroom}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>空调：</label>
                    </div>
                    <input type="text" class="input w10c" name="airConditioning"
                           value="${houseDTO.configuration.airConditioning}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>电视：</label>
                    </div>
                    <input type="text" class="input w10c" name="TV" value="${houseDTO.configuration.TV}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>路由器：</label>
                    </div>
                    <input type="text" class="input w10c" name="router" value="${houseDTO.configuration.router}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>智能锁：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w10c" name="smartLock" value="${houseDTO.configuration.smartLock}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>油烟机：</label>
                    </div>
                    <input type="text" class="input w10c" name="rangeHood" value="${houseDTO.configuration.rangeHood}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>冰箱：</label>
                    </div>
                    <input type="text" class="input w10c" name="refrigerator"
                           value="${houseDTO.configuration.refrigerator}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>微波炉：</label>
                    </div>
                    <input type="text" class="input w10c" name="microwaveOven"
                           value="${houseDTO.configuration.microwaveOven}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>浴霸：</label>
                    </div>
                    <input type="text" class="input w10c" name="yuba" value="${houseDTO.configuration.yuba}"
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
                           value="${houseDTO.configuration.washingMachine}" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>衣柜：</label>
                    </div>
                    <input type="text" class="input w10c" name="wardrobe" value="${houseDTO.configuration.wardrobe}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>桌子：</label>
                    </div>
                    <input type="text" class="input w10c" name="table" value="${houseDTO.configuration.table}"
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>椅子：</label>
                    </div>
                    <input type="text" class="input w10c" name="chair" value="${houseDTO.configuration.chair}"
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
                           value="${houseDTO.house.remark}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <input class="button bg-green icon-check-square-o" type="reset" name="" id="" value="重置"/>
                    <button class="button bg-main icon-check-square-o" type="submit"> 修改</button>
                    <a href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=${query.pageNow}&queryId=${query.queryId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}&queryLandlordId=${query.queryLandlordId}">
                        <button class="button bg-red icon-caret-left" type="button"> 返回</button>
                    </a>
                </div>
            </div>
        </form>
    </div>

    <c:if test="${not empty roomList}">
        <div class="div-room">
            <h1>房间信息</h1>
            <c:forEach items="${roomList}" var="room">
                <div>
                    <input type="button" class="del-room" value="删除" />
                    <div class="room">
                        <div><span>房间ID：</span><span>${room.id}</span></div>
                        <c:choose>
                            <c:when test="${not empty room.image}">
                                <img src="${room.image}" alt='封面'
                                     style="width: 400px;height: 225px;"/>
                            </c:when>
                            <c:otherwise>
                                <img src="${pageContext.request.contextPath}/img/house/fm.jpg" alt='封面'
                                     style="width: 400px;height: 225px;"/>
                            </c:otherwise>
                        </c:choose>
                        <div>
                            <span>可用面积：${room.area}m²</span>
                            <span>状态：${houseDTO.status[room.status]}</span>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:if>
</div>
</body>

</html>