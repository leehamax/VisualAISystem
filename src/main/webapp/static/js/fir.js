var current=0;
var currrentinterval=5000;
var arr=new Array();
arr[0]="../image/md_bg6.jpg";
arr[1]="../image/md_bg7.jpg";
setInterval(changebgimage,currrentinterval);
function changebgimage() {
    var obj=document.getElementById("main_mid");
    if(current==arr.length-1){
        current=0;
    }
    else{
        current+=1;
    }
    obj.style.backgroundImage="url("+arr[current]+")";

}