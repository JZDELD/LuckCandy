<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <meta name="keywords" content="scclui框架">
    <meta name="description" content="scclui为轻量级的网站后台管理系统模版。">
    <title>房屋租赁管理系统</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/common/css/sccl.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/common/skin/qingxin/skin.css"
          id="layout-skin"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.1.js"></script>
    <style type="text/css">
        .layout-main-tab a {
            cursor: default;
        }
    </style>
</head>

<body>

<div class="layout-admin">
    <header class="layout-header">
        <span class="header-logo">房屋租赁管理系统</span>
        <a class="header-menu-btn" href="javascript:;"><i class="icon-font">&#xe600;</i></a>
        <ul class="header-bar">
            <li class="header-bar-role">
                <a href="javascript:;">超级管理员</a>
            </li>
            <li class="header-bar-nav">
                <a href="javascript:;">${sessionScope.admin.name }<i class="icon-font"
                                                                     style="margin-left:5px;">&#xe60c;</i></a>
                <ul class="header-dropdown-menu">
                    <li>
                        <a href="javascript:;">个人信息</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/admin/loginOut.action">切换账户</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/admin/loginOut.action">退出</a>
                    </li>
                </ul>
            </li>
            <li class="header-bar-nav">
                <a href="javascript:;" title="换肤"><i class="icon-font">&#xe608;</i></a>
                <ul class="header-dropdown-menu right dropdown-skin">
                    <li>
                        <a href="javascript:;" data-val="qingxin" title="清新">清新</a>
                    </li>
                    <li>
                        <a href="javascript:;" data-val="blue" title="蓝色">蓝色</a>
                    </li>
                    <li>
                        <a href="javascript:;" data-val="molv" title="墨绿">墨绿</a>
                    </li>

                </ul>
            </li>
        </ul>
    </header>
    <aside class="layout-side">
        <ul class="side-menu">

        </ul>
    </aside>

    <div class="layout-side-arrow">
        <div class="layout-side-arrow-icon"><i class="icon-font">&#xe60d;</i></div>
    </div>

    <section class="layout-main">
        <div class="layout-main-tab">
            <button class="tab-btn btn-left"><i class="icon-font">&#xe60e;</i></button>
            <nav class="tab-nav">
                <div class="tab-nav-content">
                    <a href="javascript:;" class="content-tab active" data-id="home.jsp">首页</a>
                </div>
            </nav>
            <button class="tab-btn btn-right"><i class="icon-font">&#xe60f;</i></button>
        </div>
        <div class="layout-main-body">
            <iframe class="body-iframe" name="iframe0" width="100%" height="99%" src="${pageContext.request.contextPath}/admin/home.action" frameborder="0"
                    data-id="home.jsp" seamless></iframe>
        </div>
    </section>
    <div class="layout-footer">2019-2020 luckcandy © www.luckcandy.com</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/common/js/sccl.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/common/js/sccl-util.js"></script>
</body>

</html>