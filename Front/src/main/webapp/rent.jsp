<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>LuckCandy租房网</title>

    <!-- Styles -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Poppins:400,600" rel="stylesheet">


    <!-- favicon and touch icons -->
    <link rel="shortcut icon" href="assets/images/favicon.jpg">

    <!-- Bootstrap -->
    <link href="plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="plugins/slick/slick.css" rel="stylesheet">
    <link href="plugins/slick-nav/slicknav.css" rel="stylesheet">
    <link href="plugins/wow/animate.css" rel="stylesheet">
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/theme.css" rel="stylesheet">
    <script type="text/javascript">
        function submitUp() {
            var form = document.getElementById("adv-search-form");
            form.submit();
        }
        function submitDown() {
            var form = document.getElementById("down_form");
            form.submit();
        }
    </script>
</head>
<body class="listing-template">
<div id="page-loader">
    <div class="loaders">
        <img src="assets/images/loader/3.gif" alt="First Loader">
        <img src="assets/images/loader/4.gif" alt="First Loader">
    </div>
</div>
<header id="site-header">
    <div id="site-header-top">
        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <div class="clearfix">
                        <button class="btn btn-warning btn-lg header-btn visible-sm pull-right">List your Property for
                            Free
                        </button>
                        <p class="timing-in-header">营业时间：周一至周六-上午8点至下午6点</p>
                    </div>
                </div>
                <div class="col-md-7">
                    <div class="clearfix">
                        <div class="language-in-header">
                            <i class="fa fa-registered"></i>
                            <a href="#"><label> 注册</label></a>
                        </div>
                        <div class="currency-in-header">
                            <i class="fa fa-flag"></i>
                            <a href="#"><label> 登录</label></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <figure id="site-logo">
                    <a href="index.jsp"><img src="assets/images/logo.png" alt="Logo"></a>
                </figure>
            </div>
            <div class="col-md-6 col-sm-8">
                <nav id="site-nav" class="nav navbar-default">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">主页</a></li>
                        <li><a href="findRegionByCityId.action?cityId=${cityId == null ? 1 : cityId}&rentType=${query.rentType}">租房</a></li>
                    </ul>
                </nav>
            </div>
            <div class="col-md-3 col-sm-4">
                <div class="contact-in-header clearfix">
                    <i class="fa fa-mobile"></i>
                    <span>  现在就打电话给我们 <br>
                    <strong>111-2252-3533</strong>
                    </span>
                </div>
            </div>
        </div>
    </div>
</header>
<div id="site-banner" class="text-center clearfix">
    <div class="container">
        <h1 class="title wow slideInLeft">租房</h1>
        <ol class="breadcrumb wow slideInRight">
            <li><a href="index.jsp">主页</a></li>
            <!--<li><a href="property-map-view.html">Listing</a></li>-->
            <li class="active">租房</li>
        </ol>
    </div>
</div>
<div id="advance-search" class="main-page clearfix">
    <div class="container">
        <!--<button class="btn top-btn" value="">寻找你的</button>-->
        <form action="findHouseByQuery.action" id="adv-search-form" class="clearfix">
            <fieldset>

                <select name="cityId" id="city" onchange="window.location='findRegionByCityId.action?rentType=${query.rentType}&cityId='+this.value">
                    <c:forEach items="${cityList}" var="city">
                        <option value="${city.id}" ${city.id  == cityId ? "selected" : ""}>${city.cityName}</option>
                    </c:forEach>
                </select>

                <input type="text" name="communityOrBusinessCircleName" placeholder="请输入小区/商业圈" value="${query.communityOrBusinessCircleName}">

                <select name="regionId" id="rent-region"
                        onchange="window.location='findRegionByCityId.action?cityId=${cityId}&rentType=${query.rentType}&regionId='+this.value">
                    <option value="">区域不限</option>
                    <c:forEach items="${regionList}" var="region">
                        <option value="${region.id}" ${region.id == query.regionId ? "selected" : ""}>${region.regionName}</option>
                    </c:forEach>
                </select>

                <select name="subwayId" id="rent-subway"
                        onchange="window.location='findRegionByCityId.action?cityId=${cityId}&rentType=${query.rentType}&subwayId='+this.value">
                    <option value="">地铁线不限</option>
                    <c:forEach items="${subwayList}" var="subway">
                        <option value="${subway.id}" ${subway.id == query.subwayId ? "selected" : ""}>${subway.subwayLine}</option>
                    </c:forEach>
                </select>

                <select id="rent-rentType" name="rentType" onchange="window.location='findRegionByCityId.action?cityId=${cityId}&regionId=${query.regionId}&subwayId=${query.subwayId}&rentType='+this.value">
                    <option value="0" ${query.rentType == 0 ? "selected" : ""}>合租</option>
                    <option value="1" ${query.rentType == 1 ? "selected" : ""}>整租</option>
                </select>

                <select id="rent-status" name="status">
                    <option value="">状态不限</option>
                    <option value="1"> 可立即入住</option>
                    <option value="2"> 可预签</option>
                    <option value="3"> 转租</option>
                </select>

                <input type="text" name="areaMin" id="rent-min-area" placeholder="最小面积 (m²)">
                <input type="text" name="areaMax" id="rent-max-area" placeholder="最大面积 (m²)">

                <input type="text" name="priceMin" id="rent-min-price" placeholder="最低价格 (元/月)">
                <input type="text" name="priceMax" id="rent-max-price" placeholder="最高价格 (元/月)">
            </fieldset>
            <button type="submit" class="btn btn-default btn-lg text-center">立即<br/>寻找</button>
            <input type="reset" class="btn btn-block btn-lg text-center" value="清空条件"/>
        </form>
    </div>
</div>
<section id="property-listing">
    <header class="section-header text-center">
        <div class="container">
            <h2 class="pull-left">寻找你的小屋</h2>
            <div class="pull-right">
                <div class="property-sorting pull-left">
                    <label for="property-sort-dropdown"> 排序方式: </label>
                    <select name="property-sort-dropdown" id="property-sort-dropdown">
                        <option value="">默认</option>
                        <option value="by_price">按价格</option>
                        <option value="by_area">按面积</option>
                    </select>
                </div>
                <p class="pull-left layout-view"> 查看方式: <i class="fa fa-th selected" data-layout="4"></i> <i
                        class="fa fa-th-large" data-layout="6"></i><i class="fa fa-list-ul" data-layout="12"></i></p>
            </div>
        </div>
    </header>
    <div class="container section-layout">
        <div class="row">
            <c:forEach items="${roomList}" var="room">
            <div class="col-lg-4 col-sm-6 layout-item-wrap">
                <article class="property layout-item clearfix">
                    <figure class="feature-image">
                        <a class="clearfix zoom" href="details.html"><img data-action="zoom"
                                                                          src="${room.image}"
                                                                          alt="Property Image"></a>
                        <span class="btn btn-warning btn-sale">for sale</span>
                    </figure>
                    <div class="property-contents clearfix">
                        <header class="property-header clearfix">
                            <div class="pull-left">
                                <h6 class="entry-title"><a href="details.html">${room.title}</a></h6>
                                <span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
                            </div>
                            <button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥${room.seasonPrice}">
                                <strong>¥${room.seasonPrice}</strong>
                            </button>
                        </header>
                        <div class="property-meta clearfix">
                            <span><i class="fa fa-arrows-alt"></i> ${room.area} m²</span>
                            <span><i class="fa fa-bed"></i> 3 床铺</span>
                            <span><i class="fa fa-bathtub"></i> 3 卫生间</span>
                            <span><i class="fa fa-cab"></i> Yes</span>
                        </div>
                        <div class="contents clearfix">
                            <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
                                tempor
                                invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et
                                accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata
                                sanctus est Lorem ipsum dolor sit amet. </p>
                        </div>
                        <div class="author-box clearfix">
                            <a href="#" class="author-img"><img src="assets/images/agents/1.jpg" alt="Agent Image"></a>
                            <cite class="author-name">房东<a href="#">Linda Garret</a></cite>
                            <span class="phone"><i class="fa fa-phone"></i> 00894 692-49-22</span>
                        </div>
                    </div>
                </article>
            </div>
        </c:forEach>
        </div>
        <ul id="pagination" class="text-center clearfix">
            <li class="disabled"><a href="#">上一页</a></li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">下一页</a></li>

        </ul>
    </div>
</section>
<footer id="footer">
    <div class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-6">
                    <section class="widget about-widget clearfix">
                        <h4 class="title hide">About Us</h4>
                        <a class="footer-logo" href="#"><img src="assets/images/footer-logo.png" alt="Footer Logo"></a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi</p>
                        <ul class="social-icons clearfix">
                            <li><a href="#"><i class="fa fa-qq"></i></a></li>
                            <li><a href="#"><i class="fa fa-wechat"></i></a></li>
                            <li><a href="#"><i class="fa fa-weibo"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        </ul>
                    </section>
                </div>
                <div class="col-md-4 col-sm-6">
                    <section class="widget twitter-widget clearfix">
                        <h4 class="title">最新推文</h4>
                        <div id="twitter-feeds" class="clearfix"></div>
                    </section>
                </div>
                <div class="col-md-4 col-sm-6">
                    <section class="widget address-widget clearfix">
                        <h4 class="title">Luck Candy</h4>
                        <ul>
                            <li><i class="fa fa-map-marker"></i> 江夏大道16号</li>
                            <li><i class="fa fa-phone"></i> (+86) 130 2167 6701</li>
                            <li><i class="fa fa-envelope"></i> luckcandy@gmail.com</li>
                            <li><i class="fa fa-fax"></i> 027-83638888</li>
                            <li><i class="fa fa-clock-o"></i> Mon - Sat: 9:00 - 18:00</li>
                        </ul>
                    </section>
                </div>
            </div>
        </div>
    </div>
    <div class="site-footer-bottom">
        <div class="container">
            <p class="copyright pull-left wow slideInRight">幸运糖果信息科技有限公司 Copyright &copy; 2020 luckcand.com<a
                    target="_blank" href="http://www.luckcandy.com/">了解更多</a></p>
            <nav class="footer-nav pull-right wow slideInLeft">
                <ul>
                    <li><a href="#">条款及细则</a></li>
                    <li><a href="#">定价</a></li>
                    <li><a href="#">联系</a></li>
                </ul>
            </nav>
        </div>
    </div>
</footer>
<a href="#top" id="scroll-top"><i class="fa fa-angle-up"></i></a>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.migrate.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="plugins/slick-nav/jquery.slicknav.min.js"></script>
<script src="plugins/slick/slick.min.js"></script>
<script src="plugins/jquery-ui/jquery-ui.min.js"></script>
<script src="plugins/tweetie/tweetie.js"></script>
<script src="plugins/forms/jquery.form.min.js"></script>
<script src="plugins/forms/jquery.validate.min.js"></script>
<script src="plugins/modernizr/modernizr.custom.js"></script>
<script src="plugins/wow/wow.min.js"></script>
<script src="plugins/zoom/zoom.js"></script>
<script src="plugins/mixitup/mixitup.min.js"></script>
<script src="plugins/whats-nearby/source/WhatsNearby.js"></script>
<script src="assets/js/theme.js"></script>
</body>
</html>
