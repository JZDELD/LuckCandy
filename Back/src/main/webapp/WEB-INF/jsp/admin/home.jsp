<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>首页</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/home.css">
		<script type="text/javascript">
			function getTime(){
				var weekCN = ["天","一","二","三","四","五","六"];
				var sp = "&nbsp&nbsp&nbsp&nbsp";
				var years,month,day,week;
				var h,m,s,aop;
				var hh,mm,ss;
				var now = new Date();
				years = now.getFullYear();
				month = now.getMonth()+1;
				day = now.getDate();
				week = now.getDay();
				h = now.getHours();
				m = now.getMinutes();
				s = now.getSeconds();
				if(h<10){
					hh="0"+h;
				}else{
					hh=h;
				}
				if(m<10){
					mm="0"+m;
				}else{
					mm=m;
				}
				if(s<10){
					ss="0"+s;
				}else{
					ss=s;
				}
				var str = years+"年"+month+"月"+day+"日"+sp+"星期"+weekCN[week]+sp+hh+":"+mm+":"+ss;
				var e = document.getElementById("time");
				e.innerHTML = str;
			}
			setInterval("getTime()",0);
		</script>
	</head>
	<body>
		<div class="d">
			<div>房屋租赁管理系统</div>
			<div id="time"></div>
			<h1>欢迎使用本系统！</h1>
		</div>
	</body>
</html>