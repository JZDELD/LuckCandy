<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>房屋管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/house/index.css"/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.1.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/house/index.js"></script>
</head>

<body>
<c:if test="${not empty msg}">
    <div id="msg">
        <h2>提示信息</h2>
        <div id="msg-msg">${msg}</div>
        <div id="msg-btn">确认</div>
    </div>
</c:if>
<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <h3>房屋信息</h3>
        </div>
    </div>
    <div class="row row-add">
        <div class="col-sm-1" style="">
            <button type="button" class="btn btn-default delete">删除</button>
        </div>
        <div class="col-sm-4" style="margin-left: 20%;">
            <ul class="pagination" style="margin: 0 0 -5px 0;">
                <li>
                    <a class="shouye"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=1&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">首页</a>
                </li>
                <li class="">
                    <a class="shang"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=${pageDTO.pageNow-1}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">上一页</a>
                </li>
                <li>
                    <a class="dangqian" href="javascript:;">${pageDTO.pageNow}</a>
                </li>
                <li>
                    <a href="javascript:;">/</a>
                </li>
                <li>
                    <a class="wei" href="javascript:;">${pageDTO.pages}</a>
                </li>
                <li>
                    <a class="xia"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=${pageDTO.pageNow+1}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">下一页</a>
                </li>
                <li>
                    <a class="weiye"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=${pageDTO.pages}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">尾页</a>
                </li>
            </ul>
        </div>
        <div class="col-sm-1" style="margin-left: 50px; padding: 0;">
            <div class="input-group">
                <input type="text" class="form-control target input-text" autocomplete="off"
                       oninput="value=value.replace(/[^\d]/g,'')"/>
                <span class="input-group-btn">
                    <button class="btn btn-default go" type="button">跳转</button>
                    <div style="display: none;">queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}</div>
                </span>
            </div>
        </div>
        <div class="col-sm-1" style="">
            <button id="sx" type="button" class="btn btn-default">刷新</button>
            <div style="display: none;">
                pageNow=${pageDTO.pageNow}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}</div>
        </div>
    </div>
    <div class="table-responsive">
        <div class="tab-top">
            <form id="cx-form" action="${pageContext.request.contextPath}/house/findHouseByQuery.action"
                  class="bs-example bs-example-form" style="display: flex;" role="form">
                <div class="input-group" style="width: 1px;">
                    <span class="input-group-addon">ID</span>
                    <input name="queryId" type="text" class="form-control input-text" style="width: 80px;"
                           oninput="value=value.replace(/[^\d]/g,'')" value="${query.queryId}"/>
                </div>
                <div class="input-group" style="width: 1px;">
                    <span class="input-group-addon">房东ID</span>
                    <input name="queryLandlordId" type="text" class="form-control input-text" style="width: 80px;"
                           oninput="value=value.replace(/[^\d]/g,'')" value="${query.queryLandlordId}"/>
                </div>
                <div class="input-group" style="width: 1px;">
                    <span class="input-group-addon">当前状态</span>
                    <select class="form-control input-text" style="width: 80px;padding: 0;" name="queryStatus">
                        <option value=""></option>
                        <option value="0" ${query.queryStatus == 0 ? "selected" : ""}>合租</option>
                        <option value="1" ${query.queryStatus == 1 ? "selected" : ""}>空闲</option>
                        <option value="2" ${query.queryStatus == 2 ? "selected" : ""}>预租</option>
                        <option value="3" ${query.queryStatus == 3 ? "selected" : ""}>转租</option>
                        <option value="4" ${query.queryStatus == 4 ? "selected" : ""}>已出租</option>
                        <option value="5" ${query.queryStatus == 5 ? "selected" : ""}>已下架</option>
                    </select>
                </div>
                <div class="input-group" style="width: 1px;">
                    <span class="input-group-addon">所在市</span>
                    <select class="form-control input-text" style="width: 80px;padding: 0;" name="queryCityId">
                        <option value=""></option>
                        <c:forEach items="${cityList}" var="city">
                            <option value="${city.id}" ${city.id == query.queryCityId ? "selected" : ""}>${city.cityName}</option>
                        </c:forEach>
                    </select>
                </div>

                <button id="select" type="submit" class="btn btn-default">点击查询</button>
            </form>
            <button id="clean" type="button" class="btn btn-default" style="margin-left: 20px">清空查询条件</button>
        </div>

        <table class="table table-striped table-bordered" style="margin-bottom: 0;">
            <thead>
            <tr>
                <th><input type="checkbox"/></th>
                <th>ID</th>
                <th>户型</th>
                <th>当前状态</th>
                <th>面积</th>
                <th>月付价格</th>
                <th>所在市</th>
                <th>所在区</th>
                <th>小区名</th>
                <th>房东ID</th>
                <th>房东姓名</th>
                <th>操作</th>
            </tr>
            <tr>
                <td colspan="12" style="padding: 0;">
                    <div class="msg">
                        已勾选本页信息<span>0</span>条
                    </div>
                </td>
            </tr>
            </thead>
            <form id="ids-msg" action="${pageContext.request.contextPath}/house/deleteHouseByIds.action">
                <input type="hidden" name="queryId" value="${query.queryId}"/>
                <input type="hidden" name="queryLandlordId" value="${query.queryLandlordId}"/>
                <input type="hidden" name="queryStatus" value="${query.queryStatus}"/>
                <input type="hidden" name="queryCityId" value="${query.queryCityId}"/>
                <input type="hidden" name="pageNow" value="${pageDTO.pageNow}"/>
                <tbody class="tbody-style">
                <c:forEach items="${houseDTOList}" var="houseDTO">
                    <tr style="background-color: #FFFFFF;">
                        <td><input name="id" type="checkbox" value="${houseDTO.house.id}"/></td>
                        <td>${houseDTO.house.id}</td>
                        <td>${houseDTO.house.houseType}</td>
                        <td>${houseDTO.status[houseDTO.house.status]}</td>
                        <td>${houseDTO.house.area}</td>
                        <td>${houseDTO.house.monthlyPrice}</td>
                        <td>${houseDTO.city.cityName}</td>
                        <td>${houseDTO.region.regionName}</td>
                        <td>${houseDTO.house.communityName}</td>
                        <td>${houseDTO.landlord.id}</td>
                        <td>${houseDTO.landlord.name}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/house/details.action?id=${houseDTO.house.id}&pageNow=${pageDTO.pageNow}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">详情</a>&nbsp;||
                            <a href="javascript:;" onclick="asc(this)">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </form>
        </table>
        <div class="tab-div">
            选择：
            <a class="a-all" href="javascript:;">全部</a>&nbsp;-&nbsp;
            <a class="a-null" href="javascript:;">无</a>
        </div>
    </div>
    <div class="row row-add">
        <div class="col-sm-1" style="">
            <button type="button" class="btn btn-default delete">删除</button>
        </div>
        <div class="col-sm-4" style="margin-left: 20%;">
            <ul class="pagination" style="margin: 0 0 -5px 0;">
                <li>
                    <a class="shouye"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=1&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">首页</a>
                </li>
                <li>
                    <a class="shang"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=${pageDTO.pageNow-1}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">上一页</a>
                </li>
                <li>
                    <a class="dangqian" href="javascript:;">${pageDTO.pageNow}</a>
                </li>
                <li>
                    <a href="javascript:;">/</a>
                </li>
                <li>
                    <a class="wei" href="javascript:;">${pageDTO.pages}</a>
                </li>
                <li>
                    <a class="xia"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=${pageDTO.pageNow+1}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">下一页</a>
                </li>
                <li>
                    <a class="weiye"
                       href="${pageContext.request.contextPath}/house/findHouseByQuery.action?pageNow=${pageDTO.pages}&queryId=${query.queryId}&queryLandlordId=${query.queryLandlordId}&queryStatus=${query.queryStatus}&queryCityId=${query.queryCityId}">尾页</a>
                </li>
            </ul>
        </div>
    </div>

</div>
</body>

</html>