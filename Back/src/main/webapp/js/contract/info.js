$(function () {
    $("#pic-btn").click(function () {
        $("#pic-file").click();
        $("#pic-file").off("change").change(function () {
            var file = $(this).val();
            var choose_file = this.files[0];
            //获取文件格式
            var ftype = choose_file.name.substring(choose_file.name.lastIndexOf(".") + 1);
            //校验格式是否是图片类型
            if (ftype == "jpg" || ftype == "png" || ftype == "jpeg" || ftype == "JPG") {

                //限制图片大小
                var size = choose_file.size / 1024 / 1024;
                if (size > 5) {
                    alert("照片不能大于5M");
                    return false;
                }

                console.log(file);
                //实例化一个阅读器对象
                var reader = new FileReader();
                //读取文件的路径，没有返回值，结果在reader.result里
                reader.readAsDataURL(choose_file);
                //读取需要时间，读完后再修改图片路径
                reader.onload = function () {
                    //回显给上方图片中
                    $("#pic-img").attr("src", this.result);
                }

            } else {
                alert("所选择的照片格式不对，请重新选择！");
                return false;
            }
        });
    });

    $("#video-btn").click(function () {
        console.log("video");
        $("#video-file").click();
        $("#video-file").off("change").change(function () {
            var file = $(this).val();
            var choose_file = this.files[0];
            //获取文件格式
            var ftype = choose_file.name.substring(choose_file.name.lastIndexOf(".") + 1);
            //校验格式是否是图片类型
            if (ftype == "mp4") {

                //限制图片大小
                var size = choose_file.size / 1024 / 1024;
                if (size > 200) {
                    alert("上传的视频不能大于200M");
                    return false;
                }

                console.log(file);
                //实例化一个阅读器对象
                var reader = new FileReader();
                //读取文件的路径，没有返回值，结果在reader.result里
                reader.readAsDataURL(choose_file);
                //读取需要时间，读完后再修改图片路径
                reader.onload = function () {
                    //回显给上方图片中
                    $("#video-video").attr("src", this.result);
                }

            } else {
                alert("视频格式只支持mp4，请重新选择！");
                return false;
            }
        });
    });

    $("form").submit(function () {
        var numError = $(this).find('.check-error').length;
        if (numError) {
            return false;
        }
        if (!confirm("确定修改？")) {
            return false;
        } else {
            return true;
        }
    });

    $(".room").click(function () {
        var id = "id=" + $(this).find("span:eq(1)").text();
        var queryId = "&queryId=" + $("[name = queryId]").val();
        var queryStatus = "&queryStatus=" + $("[name = queryStatus]").val();
        var queryCityId = "&queryCityId=" + $("[name = queryCityId]").val();
        var queryLandlordId = "&queryLandlordId=" + $("[name = queryLandlordId]").val();
        var pageNow = "&pageNow=" + $("[name = pageNow]").val();
        console.log(id + queryId + queryStatus + queryCityId + queryLandlordId + pageNow);
        window.location.href = "/Back/room/details.action?" + id + queryId + queryStatus + queryCityId + queryLandlordId + pageNow;
    });

    $(".del-room").click(function(){
        if(confirm("确定删除？")){
            var id = "id=" + $(this).parent().find("span:eq(1)").text();
            var houseId = "&houseId=" + $("[name = id]").val();
            var queryId = "&queryId=" + $("[name = queryId]").val();
            var queryStatus = "&queryStatus=" + $("[name = queryStatus]").val();
            var queryCityId = "&queryCityId=" + $("[name = queryCityId]").val();
            var queryLandlordId = "&queryLandlordId=" + $("[name = queryLandlordId]").val();
            var pageNow = "&pageNow=" + $("[name = pageNow]").val();
            console.log(id + queryId + queryStatus + queryCityId + queryLandlordId + pageNow);
            window.location.href = "/Back/room/deleteRoomById.action?" + id + houseId + queryId + queryStatus + queryCityId + queryLandlordId + pageNow;
        }

    });

    $("#city").change(function () {
        let url = '/Back/house/findRegionAndSubwayByCityId.action';
        var ss = this.value;
        console.log("ss" + ss);
        $.ajax({
            type: "get",
            url: url,
            data: {"cityId": this.value},
            dataType: "json",
            success: function (data) {
                let region = data["region"];
                let subway = data["subway"];
                let regionHtml = "<option value=\"0\"></option>";
                let subwayHtml = "<option value=\"0\"></option>";
                $.each(region, function (index, obj) {
                    regionHtml += "<option value=" + obj['id'] + ">" + obj['regionName'] + "</option>";
                });
                $.each(subway, function (index, obj) {
                    subwayHtml += "<option value=" + obj['id'] + ">" + obj['subwayLine'] + "</option>";
                });
                $("#region").html(regionHtml);
                $("#subway").html(subwayHtml);
            }
        });
    });

    $("#msg-btn").click(function () {
        $("#msg").hide();
    });
});