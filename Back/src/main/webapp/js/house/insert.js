$(function () {
    $("#msg-btn").click(function () {
        $("#msg").hide();
    });

    $("#city").change(function () {
        let url = '/Back/house/findRegionAndSubwayByCityId.action';
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
});