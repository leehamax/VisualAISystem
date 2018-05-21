function begin() {
    var box = document.getElementById("area");
    box.ondragenter = function (e) {
        e.preventDefault();
    };
    box.ondragover = function (e) {
        e.preventDefault();
        document.getElementById("p2").innerHTML = "松开鼠标开始上传";
    };
    box.ondragleave = function (e) {
        e.preventDefault();
        document.getElementById("p2").innerHTML = "拖拽到这里上传";
    };
    box.ondrop = function (e) {
        e.preventDefault();
        document.getElementById("p2").innerHTML = "上传中...";
        var files = e.dataTransfer.files;
        document.getElementById("p1").innerHTML = "有效图片：" + files.length + " 张";
        document.getElementById("p2").innerHTML = "上传完毕！";
        //预览第一张图片
        var file = files[0];
        var reader = new FileReader();
        reader.onload = function (e) {
            var img = document.getElementById("np");
            img.src = e.target.result;
        }
        reader.readAsDataURL(file);

        var formData = new FormData();
        for(var i=0; i< files.length; i++){
            alert(files[i].name);
            formData.append("fileArray",files[i]);   // 文件对象
        }

        使用ajax异步上传，暂时不考虑兼容性

        var xmlHttp = new XMLHttpRequest();



        xmlHttp.open("post","/picture/analysis",true);
        xmlHttp.setRequestHeader("X-Requested-With", "XMLHttpRequest");

        xmlHttp.send(formData);
        xmlHttp.onload = function () {
            alert("上传完成!");
        };
    }
}