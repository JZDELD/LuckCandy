<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>合同管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/contract/index.css"/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.1.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/contract/index.js"></script>
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
            <h3>合同信息</h3>
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
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=1&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">首页</a>
                </li>
                <li class="">
                    <a class="shang"
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=${pageDTO.pageNow-1}&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">上一页</a>
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
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=${pageDTO.pageNow+1}&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">下一页</a>
                </li>
                <li>
                    <a class="weiye"
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=${pageDTO.pages}&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">尾页</a>
                </li>
            </ul>
        </div>
        <div class="col-sm-1" style="margin-left: 50px; padding: 0;">
            <div class="input-group">
                <input type="text" class="form-control target input-text" autocomplete="off"
                       oninput="value=value.replace(/[^\d]/g,'')"/>
                <span class="input-group-btn">
                    <button class="btn btn-default go" type="button">跳转</button>
                    <div style="display: none;">queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}</div>
                </span>
            </div>
        </div>
        <div class="col-sm-1" style="">
            <button id="sx" type="button" class="btn btn-default">刷新</button>
            <div style="display: none;">
                pageNow=${pageDTO.pageNow}&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}</div>
        </div>
    </div>
    <div class="table-responsive">
        <div class="tab-top">
            <form id="cx-form" action="${pageContext.request.contextPath}/contract/findContractByQuery.action"
                  class="bs-example bs-example-form" style="display: flex;" role="form">
                <div class="input-group" style="width: 1px;">
                    <span class="input-group-addon">ID</span>
                    <input name="queryId" type="text" class="form-control input-text" style="width: 80px;"
                           oninput="value=value.replace(/[^\d]/g,'')" value="${query.queryId}"/>
                </div>
                <div class="input-group" style="width: 1px;">
                    <span class="input-group-addon">租客ID</span>
                    <input name="queryUserId" type="text" class="form-control input-text" style="width: 80px;"
                           oninput="value=value.replace(/[^\d]/g,'')" value="${query.queryUserId}"/>
                </div>
                <div class="input-group" style="width: 1px;">
                    <span class="input-group-addon">合同状态</span>
                    <select class="form-control input-text" style="width: 80px;padding: 0;" name="queryStatus">
                        <option value=""></option>
                        <option value="1" ${query.queryStatus == 1 ? "selected" : ""}>生效中</option>
                        <option value="2" ${query.queryStatus == 2 ? "selected" : ""}>已失效</option>
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
                <th>Id</th>
                <th>签约方式</th>
                <th>租客ID</th>
                <th>租金</th>
                <th>服务费</th>
                <th>押金</th>
                <th>合同状态</th>
                <th>签约时间</th>
                <th>租期</th>
                <th>操作</th>
            </tr>
            <tr>
                <td colspan="11" style="padding: 0;">
                    <div class="msg">
                        已勾选本页信息<span>0</span>条
                    </div>
                </td>
            </tr>
            </thead>
            <form id="ids-msg" action="${pageContext.request.contextPath}/contract/deleteContractByIds.action">
                <input type="hidden" name="queryId" value="${query.queryId}"/>
                <input type="hidden" name="queryUserId" value="${query.queryUserId}"/>
                <input type="hidden" name="queryStatus" value="${query.queryStatus}"/>
                <input type="hidden" name="pageNow" value="${pageDTO.pageNow}"/>
                <tbody class="tbody-style">
                <c:forEach items="${contractList}" var="contract">
                    <tr style="background-color: #FFFFFF;">
                        <td><input name="id" type="checkbox" value="${contract.id}"/></td>
                        <td>${contract.id}</td>
                        <td>押1付${contract.signingMethod}</td>
                        <td>${contract.userId}</td>
                        <td>${contract.price}</td>
                        <td>${contract.servicePrice}</td>
                        <td>${contract.deposit}</td>
                        <td>${contract.status == 1 ? "生效中" : "已失效"}</td>
                        <td><fmt:formatDate value="${contract.startDate}" pattern="yyyy-MM-dd"/></td>
                        <td>${contract.lease}</td>
                        <td>
                            <a href="">详情</a>&nbsp;||
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
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=1&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">首页</a>
                </li>
                <li>
                    <a class="shang"
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=${pageDTO.pageNow-1}&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">上一页</a>
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
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=${pageDTO.pageNow+1}&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">下一页</a>
                </li>
                <li>
                    <a class="weiye"
                       href="${pageContext.request.contextPath}/contract/findContractByQuery.action?pageNow=${pageDTO.pages}&queryId=${query.queryId}&queryUserId=${query.queryUserId}&queryStatus=${query.queryStatus}">尾页</a>
                </li>
            </ul>
        </div>
    </div>

</div>
</body>

</html>