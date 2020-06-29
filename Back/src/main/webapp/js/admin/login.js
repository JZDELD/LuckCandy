$(function() {
	$("#remeber").hide();
	$(".jzmm").toggle(
		function() {
			$(this).css({
				"background-color": "#5fb878",
				"border-color": "#5fb878"
			});
			$(this).find("i").css({
				"background-color": "#FFFFFF"
			}).animate({
				"left": "31px"
			}, 100).before("<span>ON</span>");
			$("#remeber").get(0).checked = true;
		},
		function() {
			$(this).css({
				"background-color": "#FFFFFF",
				"border-color": "#d2d2d2"
			}).find("span").remove();
			$(this).find("i").css({
				"background-color": "#d2d2d2"
			}).animate({
				"left": "5px"
			}, 100);
			$("#remeber").get(0).checked = false;
		}
	);
	$(".btn").hover(
		function() {
			$(this).css({
				"border-color": "#5fb878"
			});
		},
		function() {
			$(this).css({
				"border-color": "aliceblue",
			});
		}
	);
	
	$("#btn2").click(function(){
		$(".msg").hide();
	});
	
});

function isNull() {
	var flag = true;
	$("input").each(function() {
		if($(this).val() == "") {
			alert("请输入账号密码");
			flag = false;
			return false;
		}
	});
	return flag;
}