<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<title>LuckCandy租房网</title>

	<!-- Styles -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Poppins:400,600" rel="stylesheet">

	<!-- favicon and touch icons -->
	<link rel="shortcut icon" href="../assets/images/favicon.jpg">

	<!-- Bootstrap -->
	<link href="../plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<link href="../plugins/slick/slick.css" rel="stylesheet">
	<link href="../plugins/slick-nav/slicknav.css" rel="stylesheet">
	<link href="../plugins/wow/animate.css" rel="stylesheet">
	<link href="../assets/css/bootstrap.css" rel="stylesheet">
	<link href="../assets/css/theme.css" rel="stylesheet">
</head>
<body class="">
<div id="page-loader">
	<div class="loaders">
		<img src="../assets/images/loader/3.gif" alt="First Loader">
		<img src="../assets/images/loader/4.gif" alt="First Loader">
	</div>
</div>
<header id="site-header">
	<div id="site-header-top">
		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<div class="clearfix">
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
	<div id="site-header-container" class="container">
		<div class="row">
			<div class="col-md-3">
				<figure id="site-logo">
					<a href="index.html"><img src="../assets/images/logo.png" alt="Logo"></a>
				</figure>
			</div>
			<div class="col-md-6 col-sm-8">
				<nav id="site-nav" class="nav navbar-default">
					<ul class="nav navbar-nav">
						<li><a href="REindex.jsp">主页</a></li>
						<li><a href="findRegionByCityId.action?cityid=${cityid == null ? 1 : cityid}">租房</a></li>
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
<div class="main-slider-wrapper clearfix">
	<div id="main-slider">
		<div class="slide"><img src="../assets/images/slider/1.jpg" alt="Slide"></div>
		<div class="slide"><img src="../assets/images/slider/2.jpg" alt="Slide"></div>
		<div class="slide"><img src="../assets/images/slider/3.jpg" alt="Slide"></div>
		<div class="slide"><img src="../assets/images/slider/4.jpg" alt="Slide"></div>
	</div>
	<div id="slider-contents">
		<div class="container text-center">
			<div class="jumbotron">
				<h1>找到你的梦想之家</h1>
				<div class="contents clearfix">
					<p>如果您梦想设计一个可以充分利用您所 <br>
						钟爱的独特地理和风景的新房屋</p>
				</div>
				<a class="btn btn-warning btn-lg btn-3d" data-hover="我们的服务" href="#" role="button">我们的服务</a>
				<a class="btn btn-default btn-border btn-lg" href="#" role="button">成为房东</a>
			</div>
		</div>
	</div>
</div>

<section id="home-property-listing">
	<header class="section-header home-section-header text-center">
		<div class="container">
			<h2 class="wow slideInRight">精选房源</h2>
			<p class="wow slideInLeft">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
				incididunt ut <br>
				labore et dolore magna aliquan ut enim ad minim veniam.</p>
		</div>
	</header>
	<div class="container">
		<div class="row">
			<c:forEach items="">
				<div class="col-lg-4 col-sm-6 layout-item-wrap">
					<article class="property layout-item clearfix">
						<figure class="feature-image">
							<a class="clearfix zoom" href="details.html"><img data-action="zoom"
							                                                  src="../assets/images/property/1.jpg"
							                                                  alt="封面"></a>
							<span class="btn btn-warning btn-sale">签</span>
						</figure>
						<div class="property-contents clearfix">
							<header class="property-header clearfix">
								<div class="pull-left">
									<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
									<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
								</div>
								<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00">
									<strong>¥389.00</strong>
								</button>
							</header>
							<div class="property-meta clearfix">
								<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
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
								<a href="#" class="author-img"><img src="../assets/images/agents/1.jpg" alt="Agent Image"></a>
								<cite class="author-name">Personal Seller: <a href="#">Linda Garret</a></cite>
								<span class="phone"><i class="fa fa-phone"></i> 00894 692-49-22</span>
							</div>
						</div>
					</article>
				</div>
			</c:forEach>

			<div class="col-lg-4 col-sm-6 layout-item-wrap">
				<article class="property layout-item clearfix">
					<figure class="feature-image">
						<a class="clearfix zoom" href="details.html"><img data-action="zoom"
						                                                  src="../assets/images/property/2.jpg"
						                                                  alt="Property Image"></a>
						<span class="btn btn-warning btn-sale">签</span>
					</figure>
					<div class="property-contents clearfix">
						<header class="property-header clearfix">
							<div class="pull-left">
								<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
								<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
							</div>
							<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00"><strong>¥389.00</strong>
							</button>
						</header>
						<div class="property-meta clearfix">
							<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
							<span><i class="fa fa-bed"></i> 3 床铺</span>
							<span><i class="fa fa-bathtub"></i> 3 卫生间</span>
							<span><i class="fa fa-cab"></i> Yes</span>
						</div>
						<div class="contents clearfix">
							<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor
								invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et
								accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata
								sanctus est Lorem ipsum dolor sit amet. </p>
						</div>
						<div class="author-box clearfix">
							<a href="#" class="author-img"><img src="../assets/images/agents/1.jpg" alt="Agent Image"></a>
							<cite class="author-name">Personal Seller: <a href="#">Linda Garret</a></cite>
							<span class="phone"><i class="fa fa-phone"></i> 00894 692-49-22</span>
						</div>
					</div>
				</article>
			</div>
		</div>
	</div>
</section>
<section id="announcement-section" class="text-center">
	<div class="container ">
		<h2 class="title wow slideInLeft">幸运糖果屋</h2>
		<p class="wow slideInRight">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
			incididunt ut <br>
			labore et dolore magna aliquan ut enim ad minim veniam.</p>
	</div>
</section>
<section id="home-property-for-rent-listing">
	<header class="section-header home-section-header text-center">
		<div class="container">
			<h2 class="wow slideInLeft">办公室出租</h2>
			<p class="wow slideInRight">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
				incididunt ut <br>
				labore et dolore magna aliquan ut enim ad minim veniam.</p>
		</div>
	</header>
	<div class="container">
		<div class="row">
			<div id="property-for-rent-slider">
				<div class="col-lg-4 col-md-6">
					<article class="property clearfix">
						<figure class="feature-image">
							<a class="clearfix" href="details.html"> <img src="../assets/images/property/1.jpg"
							                                              alt="Property Image"></a>
						</figure>
						<div class="property-contents">
							<header class="property-header clearfix">
								<div class="pull-left">
									<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
									<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
								</div>
								<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00">
									<strong>¥389.00</strong></button>
							</header>
							<div class="property-meta clearfix">
								<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
								<span><i class="fa fa-bed"></i> 3 床铺</span>
								<span><i class="fa fa-bathtub"></i> 3 卫生间</span>
								<span><i class="fa fa-cab"></i> Yes</span>
							</div>
						</div>
					</article>
				</div>
				<div class="col-lg-4 col-md-6">
					<article class="property clearfix">
						<figure class="feature-image">
							<a class="clearfix" href="details.html"> <img src="../assets/images/property/2.jpg"
							                                              alt="Property Image"></a>
						</figure>
						<div class="property-contents">
							<header class="property-header clearfix">
								<div class="pull-left">
									<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
									<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
								</div>
								<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00">
									<strong>¥389.00</strong></button>
							</header>
							<div class="property-meta clearfix">
								<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
								<span><i class="fa fa-bed"></i> 3 床铺</span>
								<span><i class="fa fa-bathtub"></i> 3 卫生间</span>
								<span><i class="fa fa-cab"></i> Yes</span>
							</div>
						</div>
					</article>
				</div>
				<div class="col-lg-4 col-md-6">
					<article class="property clearfix">
						<figure class="feature-image">
							<a class="clearfix" href="details.html"> <img src="../assets/images/property/3.jpg"
							                                              alt="Property Image"></a>
						</figure>
						<div class="property-contents">
							<header class="property-header clearfix">
								<div class="pull-left">
									<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
									<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
								</div>
								<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00">
									<strong>¥389.00</strong></button>
							</header>
							<div class="property-meta clearfix">
								<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
								<span><i class="fa fa-bed"></i> 3 床铺</span>
								<span><i class="fa fa-bathtub"></i> 3 卫生间</span>
								<span><i class="fa fa-cab"></i> Yes</span>
							</div>
						</div>
					</article>
				</div>
				<div class="col-lg-4 col-md-6">
					<article class="property clearfix">
						<figure class="feature-image">
							<a class="clearfix" href="details.html"> <img src="../assets/images/property/4.jpg"
							                                              alt="Property Image"></a>
						</figure>
						<div class="property-contents">
							<header class="property-header clearfix">
								<div class="pull-left">
									<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
									<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
								</div>
								<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00">
									<strong>¥389.00</strong></button>
							</header>
							<div class="property-meta clearfix">
								<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
								<span><i class="fa fa-bed"></i> 3 床铺</span>
								<span><i class="fa fa-bathtub"></i> 3 卫生间</span>
								<span><i class="fa fa-cab"></i> Yes</span>
							</div>
						</div>
					</article>
				</div>
				<div class="col-lg-4 col-md-6">
					<article class="property clearfix">
						<figure class="feature-image">
							<a class="clearfix" href="details.html"> <img src="../assets/images/property/5.jpg"
							                                              alt="Property Image"></a>
						</figure>
						<div class="property-contents">
							<header class="property-header clearfix">
								<div class="pull-left">
									<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
									<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
								</div>
								<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00">
									<strong>¥389.00</strong></button>
							</header>
							<div class="property-meta clearfix">
								<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
								<span><i class="fa fa-bed"></i> 3 床铺</span>
								<span><i class="fa fa-bathtub"></i> 3 卫生间</span>
								<span><i class="fa fa-cab"></i> Yes</span>
							</div>
						</div>
					</article>
				</div>
				<div class="col-lg-4 col-md-6">
					<article class="property clearfix">
						<figure class="feature-image">
							<a class="clearfix" href="details.html"> <img src="../assets/images/property/6.jpg"
							                                              alt="Property Image"></a>
						</figure>
						<div class="property-contents">
							<header class="property-header clearfix">
								<div class="pull-left">
									<h6 class="entry-title"><a href="details.html">Guaranteed modern home</a></h6>
									<span class="property-location"><i class="fa fa-map-marker"></i> 14 Tottenham Road, London</span>
								</div>
								<button class="btn btn-default btn-price pull-right btn-3d" data-hover="¥389.00">
									<strong>¥389.00</strong></button>
							</header>
							<div class="property-meta clearfix">
								<span><i class="fa fa-arrows-alt"></i> 3060 m²</span>
								<span><i class="fa fa-bed"></i> 3 床铺</span>
								<span><i class="fa fa-bathtub"></i> 3 卫生间</span>
								<span><i class="fa fa-cab"></i> Yes</span>
							</div>
						</div>
					</article>
				</div>
			</div>
		</div>
	</div>
</section>
<section id="home-features-section" class="text-center">
	<header class="section-header home-section-header">
		<div class="container">
			<h2 class="wow slideInRight">为什么选择我们</h2>
			<p class="wow slideInLeft">2020海燕计划第7季已正式启动，面向应届毕业生推出“月付、0押金、送搬家券”三项超级福利，同时联合滴滴出行、腾讯视频、美团、拉勾、汉堡王、<br>
				饿了么超市、喜马拉雅、小米有品、苏宁易购9大品牌，及自如公司旗下五大产品线，为毕业生们送上史上超强租房福利。</p>
		</div>
	</header>
	<div class="container">
		<div class="row">
			<div class="col-md-3 col-xs-6">
				<div class="feature clearfix">
					<i class="icon"><img src="../assets/images/features/1.png" alt="Feature Icon"></i>
					<h6 class="entry-title">更好的位置</h6>
					<p>交通变例，四通八达，超大绿<br>化，满眼绿意</p>
				</div>
			</div>
			<div class="col-md-3 col-xs-6">
				<div class="feature clearfix">
					<i class="icon"><img src="../assets/images/features/2.png" alt="Feature Icon"></i>
					<h6 class="entry-title">更优惠的价格</h6>
					<p>拒绝中间商赚差价，应届毕业<br>生租房押金最高可免50%</p>
				</div>
			</div>
			<div class="col-md-3 col-xs-6">
				<div class="feature clearfix">
					<i class="icon"><img src="../assets/images/features/3.png" alt="Feature Icon"></i>
					<h6 class="entry-title">节省您的时间</h6>
					<p>提前一天预约看房，第二天可<br>直接看房，无需等待</p>
				</div>
			</div>
			<div class="col-md-3 col-xs-6">
				<div class="feature clearfix">
					<i class="icon"><img src="../assets/images/features/4.png" alt="Feature Icon"></i>
					<h6 class="entry-title">更贴心的服务</h6>
					<p>全国一流物业，还有客服为您<br>专业解答你的疑问</p>
				</div>
			</div>
		</div>
	</div>
</section>
<footer id="footer">
	<div class="site-footer">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-sm-6">
					<section class="widget about-widget clearfix">
						<h4 class="title hide">About Us</h4>
						<a class="footer-logo" href="#"><img src="../assets/images/footer-logo.png" alt="Footer Logo"></a>
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
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/jquery.migrate.js"></script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../plugins/slick-nav/jquery.slicknav.min.js"></script>
<script src="../plugins/slick/slick.min.js"></script>
<script src="../plugins/jquery-ui/jquery-ui.min.js"></script>
<script src="../plugins/tweetie/tweetie.js"></script>
<script src="../plugins/forms/jquery.form.min.js"></script>
<script src="../plugins/forms/jquery.validate.min.js"></script>
<script src="../plugins/modernizr/modernizr.custom.js"></script>
<script src="../plugins/wow/wow.min.js"></script>
<script src="../plugins/zoom/zoom.js"></script>
<script src="../plugins/mixitup/mixitup.min.js"></script>
<script src="../plugins/whats-nearby/source/WhatsNearby.js"></script>
<script src="../assets/js/theme.js"></script>
</body>
</html>
