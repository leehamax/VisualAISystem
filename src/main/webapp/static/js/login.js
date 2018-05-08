var code;
function createCode(){
    code="";
    var length=4;

    var coderesource=new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    for(var i=0;i<length;i++){
        var temp=Math.floor(Math.random()*52);
        code+=coderesource[temp];

    }
    ;
}
var f1=false;
var f2=false;
var f3=false;
function cf1() {
    var curr=document.getElementById("login_form_username");
    curr.value="";
    f1=false;
}
function checkCode1() {
    var curr=document.getElementById("login_form_username");
    if(curr.value.trim()==''){curr.value='  输入用户名'}
    else if(curr.value.trim()!=''){
        if(curr.value.replace(/\s/gi,'').length>=1&&curr.value.replace(/\s/gi,'').length<=10){

            curr.value=curr.value.replace(/\s/gi,'');
            f1=true;
        }
        else {

            curr.value='  用户名应在1位到10位之间!';
        }

    }
}
function hide(){
    var curr=document.getElementById("login_form_password");
    curr.type="password";
    curr.value="";
    f2=false;
}
function checkCode4(){
    var curr=document.getElementById("login_form_password");

    if(curr.value.trim()==''){
        curr.type="text";
        curr.value="  请输入密码(6-15位）";
    }
    else if(curr.value.trim()!=''){

        if(!(curr.value.replace(/\s/gi,'').length>=6&&curr.value.replace(/\s/gi,'').length<=15)){
            curr.type="text";
            curr.value="  请输入6-15位的密码！";
        }
        else{
            f2=true;
            curr.value=curr.value.replace(/\s/gi,'');

        }
    }
}
function cf3() {
    var curr=document.getElementById("inputcode");
    curr.value="";
    f3=false;
}
function checkCode6() {
    var curr=document.getElementById("inputcode");
    if(curr.value.trim()==''){curr.value='请输入验证码'}
    else if(curr.value.trim()!=''){

        if (!(curr.value.toUpperCase()==code.toUpperCase())){
            curr.value='正确输入！';
        }
        else {
            f3=true;
        }
    }

}
function finalSubmit() {
    /*if(f1){
        alert("1对");
    }
    if (f2){
        alert("2对");
    }
    if (f3){
        alert("3对");
    }*/

    if(f1&&f2&&f3){
        alert("准备提交");
        var temp=document.getElementById("login_form_submit");
        temp.type="submit";

    }
    else {
        alert("请检查表单数据并仔细查看提示！");

    }
}

function draw(){
    var context=document.getElementById("code")
    var con=context.getContext("2d");
    con.font="135px Arial";
    con.textBaseline="top";
    con.fillStyle = "rgb(0,0,0)";
    con.fillText(code,0,0);

}
function Redraw() {
    createCode();
    var context=document.getElementById("code")
    var con=context.getContext("2d");
    con.clearRect(0,0,context.width,context.height);
    con.font="135px Arial";
    con.textBaseline="top";
    con.fillStyle = "rgb(0,0,0)";
    con.fillText(code,0,0);
}