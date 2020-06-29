$(function(){
	$("#pic-btn").click(function(){
		$("#pic-file").click();
		$("#pic-file").off("change").change(function(){
			var file = $(this).val();
			var choose_file = this.files[0];
			//获取文件格式
			var ftype = choose_file.name.substring(choose_file.name.lastIndexOf(".")+1);
			//校验格式是否是图片类型
			if(ftype=="jpg" || ftype=="png" || ftype=="jpeg" || ftype == "JPG"){
				
				//限制图片大小
				var size = choose_file.size / 1024 / 1024;
				if(size > 2){
					alert("头像不能大于2M");
					return false;
				}
				
				console.log(file);
				//实例化一个阅读器对象
				var reader = new FileReader();
				//读取文件的路径，没有返回值，结果在reader.result里
				reader.readAsDataURL(choose_file);
				//读取需要时间，读完后再修改图片路径
				reader.onload = function(){
					//回显给上方图片中
					$("#pic-img").attr("src",this.result);
				}
				
			}else{
				alert("头像格式不对，请重新选择！");
				return false;
			}
		});
	});
	
	$("form").submit(function(){
		var numError = $(this).find('.check-error').length;
		if(numError){
			return false;
		}
		if(!confirm("确定修改？")){
			return false;
		}else{
			return true;
		}
	});

	$("#msg-btn").click(function () {
		$("#msg").hide();
	});
});
