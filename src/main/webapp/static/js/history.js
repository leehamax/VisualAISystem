
    window.addEventListener("DOMContentLoaded", function() {
        // Grab elements, create settings, etc.
        var canvas = document.getElementById("canvas"),
            context = canvas.getContext("2d"),
            video = document.getElementById("video"),
            videoObj = { "video": true },
            errBack = function(error) {
                console.log("Video capture error: ", error.code);
            };

        // Put video listeners into place
        if(navigator.getUserMedia) { // Standard
            //alert("支持navigator.getUserMedia");
            navigator.getUserMedia(videoObj, function(stream) {
                video.src = stream;
                video.play();
            }, errBack);
        } else if(navigator.webkitGetUserMedia) { // WebKit-prefixed
            //alert("支持navigator.webkitGetUserMedia");
            navigator.webkitGetUserMedia(videoObj, function(stream){
                video.src = window.webkitURL.createObjectURL(stream);
                video.play();
            }, errBack);
        }
        else if(navigator.mozGetUserMedia) { // Firefox-prefixed
            //alert("支持navigator.mozGetUserMedia");
            navigator.mozGetUserMedia(videoObj, function(stream){
                video.src = window.URL.createObjectURL(stream);
                video.play();
            }, errBack);
        }
        // 触发拍照动作
        document.getElementById("snap").addEventListener("click", function() {
            context.drawImage(video, 0, 0, 300,200);
        });

    }, false);