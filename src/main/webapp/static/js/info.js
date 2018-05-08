//判断浏览器是否支持FileReader接口
if (typeof FileReader == 'undefined') {
    alert("当前浏览器不支持FileReader接口");
}
//选择图片，马上预览
function xmTanUploadImg(obj) {
    var file = obj.files[0];
    var reader = new FileReader();
    reader.onload = function(e) {
        var img = document.getElementById("im");
        img.src = e.target.result;
    }
    reader.readAsDataURL(file);
}

//ajax提交信息
function uploadImg() {
    if($("#file").val() != "") {
        $.ajaxFileUpload({
            type: "POST",
            url:"${pageContext.request.contextPath}/uploadFile",
            dataType: "json",
            fileElementId:"file",  // 文件的id
            success: function(d){
                if(d.code == 0) {
                    //alert("上传成功");
                    //图片显示
                    $("#avatar").attr("value",d.data.url);
                    $("#avatarShow").attr("src",d.data.url);
                }
            },
            error: function () {
                alert("上传失败");
            },
        });
    } else {
        alert("请先选择文件");
    }
}