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
    <title>添加房屋信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/house/index.css"/>
    <script src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/house/insert.js"></script>
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
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加房屋信息</strong></div>
    <div class="body-content">
        <form enctype="multipart/form-data" method="post" class="form-x"
              action="${pageContext.request.contextPath }/house/insertHouse.action">
            <input type="hidden" name="queryId" value="${query.queryId}"/>
            <input type="hidden" name="queryName" value="${query.queryName}"/>
            <input type="hidden" name="queryHome" value="${query.queryHome}"/>
            <input type="hidden" name="pageNow" value="${query.pageNow}"/>

            <div class="form-group">
                <div class="label">
                    <label>房东ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w20" name="landlordId" value="${landlord.id}" readonly/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>房东姓名：</label>
                    </div>
                    <input type="text" class="input w20" name="" value="${landlord.name}" disabled/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>业务员：</label>
                    </div>
                    <select class="input w50" name="salesmanId">
                        <option value="0"></option>
                        <c:forEach items="${salesmanList}" var="salesman">
                            <option value="${salesman.id}">${salesman.id}：${salesman.name}
                                & 电话：${salesman.tel}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>房屋照片：</label>
                </div>
                <div class="field">
                    <img id="pic-img" src="${pageContext.request.contextPath}/img/house/fm.jpg" alt='封面'
                         style="width: 320px;height: 180px;"/>
                    <input id="pic-btn" type="button" class="button bg-blue margin-left" value="+ 选择">
                    <input id="pic-file" type="file" name="imageFile" hidden="" value=""/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>房屋视频：</label>
                </div>
                <div class="field">
                    <video id="video-video" src="" controls="controls"
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
                            <option value="${city.id}">${city.cityName}</option>
                        </c:forEach>
                    </select>
                    <div class="tips"></div>
                    <div class="label">
                        <label>区：</label>
                    </div>
                    <select id="region" class="input w20" name="regionId">
                        <option value="0"></option>
                    </select>
                    <div class="tips"></div>
                    <div class="label">
                        <label>地铁线：</label>
                    </div>
                    <select id="subway" class="input w20" name="subwayId">
                        <option value="0"></option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>标题：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="title" value=""/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>状态：</label>
                    </div>
                    <select class="input w30" name="status">
                        <option value="0">合租</option>
                        <option value="1">空闲</option>
                        <option value="2">预租</option>
                        <option value="3">转租</option>
                        <option value="4">已出租</option>
                        <option value="5">已下架</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>简介</label>
                </div>
                <div class="field">
            		<textarea class="input w50" name="introduction"
                              style="height:130px;resize: none;"></textarea>
                    <div class="tips"></div>
                    <div class="label">
                        <label>面积：</label>
                    </div>
                    <input type="text" class="input w30c" name="area" value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>小区名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="communityName" value=""/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>附近商圈名：</label>
                    </div>
                    <input type="text" class="input w50" name="businessCircleName"
                           value=""/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>当前层：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w10c" name="nowFloor" value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>大楼总层数：</label>
                    </div>
                    <input type="text" class="input w10c" name="totalFloor" value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>电梯(有/无)：</label>
                    </div>
                    <select class="input w20" name="elevator">
                        <option value="0">无</option>
                        <option value="1">有</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>详细地址：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w30" name="address" value="" data-validate="required:不能为空"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>年代：</label>
                    </div>
                    <input type="text" class="input w20c" name="time" value="" maxlength="4"
                           oninput="value=value.replace(/[^\d]/g,'')" data-validate="required:不能为空"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>绿化度：</label>
                    </div>
                    <input type="text" class="input w20c" name="degreeOfGreening" value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')" data-validate="required:不能为空"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>户型：</label>
                    </div>
                    <input type="text" class="input w20" name="houseType" value="" maxlength="4"
                           data-validate="required:不能为空"/>
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
                    <input type="text" class="input w20c" name="monthlyPrice" value=""
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>季付：</label>
                    </div>
                    <input type="text" class="input w20c" name="seasonPrice" value=""
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>半年付：</label>
                    </div>
                    <input type="text" class="input w20c" name="halfYearPrice" value=""
                           maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>押金：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w20c" name="deposit" value="" maxlength="5"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>服务费：</label>
                    </div>
                    <input type="text" class="input w20c" name="servicePrice" value=""
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
                    <input type="text" class="input w10c" name="bed" value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>卫生间：</label>
                    </div>
                    <input type="text" class="input w10c" name="bathroom" value=""
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>空调：</label>
                    </div>
                    <input type="text" class="input w10c" name="airConditioning"
                           value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>电视：</label>
                    </div>
                    <input type="text" class="input w10c" name="TV" value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>路由器：</label>
                    </div>
                    <input type="text" class="input w10c" name="router" value=""
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>智能锁：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w10c" name="smartLock" value=""
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>油烟机：</label>
                    </div>
                    <input type="text" class="input w10c" name="rangeHood" value=""
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>冰箱：</label>
                    </div>
                    <input type="text" class="input w10c" name="refrigerator"
                           value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>微波炉：</label>
                    </div>
                    <input type="text" class="input w10c" name="microwaveOven"
                           value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>浴霸：</label>
                    </div>
                    <input type="text" class="input w10c" name="yuba" value=""
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
                           value="" maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>衣柜：</label>
                    </div>
                    <input type="text" class="input w10c" name="wardrobe" value=""
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>桌子：</label>
                    </div>
                    <input type="text" class="input w10c" name="table" value=""
                           maxlength="3"
                           oninput="value=value.replace(/[^\d]/g,'')"/>
                    <div class="tips"></div>
                    <div class="label">
                        <label>椅子：</label>
                    </div>
                    <input type="text" class="input w10c" name="chair" value=""
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
                           value=""/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <input class="button bg-green icon-check-square-o" type="reset" name="" id="" value="重置"/>
                    <button class="button bg-main icon-check-square-o" type="submit"> 添加</button>
                    <a href="${pageContext.request.contextPath}/landlord/details.action?id=${landlord.id}&pageNow=${query.pageNow}&queryId=${query.queryId}&queryName=${query.queryName}&queryHome=${query.queryHome}">
                        <button class="button bg-red icon-caret-left" type="button"> 返回</button>
                    </a>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
