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
function checkCode() {
    var inputcode=document.getElementById("inputcode");
    if(inputcode.length==0){

    }
    else if(inputcode.toUpperCase()!=code.toUpperCase()){

    }
    else{

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