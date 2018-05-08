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
        var file = files[0];
        var reader = new FileReader();
        reader.onload = function (e) {
            var img = document.getElementById("np");
            img.src = e.target.result;
        }
        reader.readAsDataURL(file);

        var formData = new FormData();

        //相当于 <input type=file name='myfile' />

        formData.append("myfile", file);

        //使用ajax异步上传，暂时不考虑兼容性

        var xmlHttp = new XMLHttpRequest();

        //必须使用post才能提交文件类型的数据，即大量的数据

        xmlHttp.open();

        //发送表单数据，然后服务端使用myfile这个名称接收即可

        xmlHttp.send(formData);
    }
}