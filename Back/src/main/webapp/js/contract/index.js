$(function () {
    $("[type=checkbox]").css({
        "zoom": "130%",
        "outline": "none"
    });

    $("button").css({
        "outline": "none"
    });
    var count = 0;
    $("th [type=checkbox]").click(function () {
        var flag = this.checked;
        count = 0;
        $("td [type=checkbox]").each(function () {
            this.checked = flag;
            count++;
        });

        if (flag) {
            $(".msg").show();
            $(".msg").find("span:first").text(count);
        } else {
            count = 0;
            $(".msg").hide();
        }
    });
    $("td [type=checkbox]").click(function () {
        var flag = true;
        count = 0;

        $("td [type=checkbox]").each(function () {

            if (this.checked == false) {
                flag = false;
                $("th [type=checkbox]").get(0).checked = false;
            } else {
                count++;
            }
        });
        console.log(count);
        if (flag) {
            $("th [type=checkbox]").get(0).checked = true;
        }
        if (count > 0) {
            $(".msg").show();
            $(".msg").find("span").text(count);
        } else {
            $(".msg").hide();
        }
    });

    $(".go").click(function () {
        var query = $(this).next().text().trim();
        var target = $(".target").val();
        if (!(parseFloat(target).toString() == "NaN")) {
            query = query + "&pageNow=" + target;
            console.log(query);
            window.location.href = "/Back/contract/findContractByQuery.action?" + query;
        }
    });

    $(".target").keydown(function (e) {
        if (e.keyCode == 13) {
            $(".go").click();
        }
    });

    $("#sx").click(function () {
        var query = $(this).next().text().trim();
        window.location.href = "/Back/contract/findContractByQuery.action?" + query;
    });

    $("#clean").click(function () {
        window.location.href = "/Back/contract/findContractByQuery.action";
    });

    $(".delete").click(function () {
        var flag = false;
        var index = 0;
        $("td [type=checkbox]").each(function () {
            if (this.checked) {
                flag = true;
                index++;
            }
        });
        if (flag) {
            if (confirm("确定要删除被选中的" + index + "份合同？")) {
                $("#ids-msg").submit();
            }
        } else {
            alert("请选择要删除的合同");
        }
    });
    $(".a-all").click(function () {
        count = 0;
        $("th [type=checkbox]").get(0).checked = true;
        $("td [type=checkbox]").each(function () {
            $(this).get(0).checked = true;
            count++;
        });
        $(".msg").show();
        $(".msg").find("span").text(count);
    });
    $(".a-null").click(function () {
        $("th [type=checkbox]").get(0).checked = false;
        $("td [type=checkbox]").each(function () {
            $(this).get(0).checked = false;
        });
        count = 0;
        $(".msg").hide();
    });
    $("tr:gt(0)").hover(
        function () {
            $(this).css({
                "background-color": "#F1F1F1"
            });
        },
        function () {
            $(this).css({
                "background-color": "#FFF"
            });
        }
    );
    $("#msg-btn").click(function () {
        $("#msg").hide();
    });
});

function asc(e) {
    if (confirm("确定要删除该房屋？")) {
        var query = $("#sx").next().text().trim();
        var id = $(e).parent().parent().find("td:eq(1)").text().trim();
        query = query + "&id=" + id;
        console.log(query);
        window.location.href = "/Back/contract/deleteContractById.action?" + query;
    }
}
