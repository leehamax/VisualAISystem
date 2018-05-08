<%--
  Created by IntelliJ IDEA.
  User: Leeham
  Date: 2018/3/25
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
    <meta charset="utf-8"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Cache-Control" content="no-transform" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="description" content="安全帽智能提取系统,一款基于人工智能和计算机视觉的识别工具
为您所处的环境进行实时监控及抓包提取"/>
    <meta name="keyword" content="安全帽，智能提取，人工智能，计算机视觉，识别" />
    <meta name="format-detection" content="telephone=no,email=no,address=no" />
    <meta name="renderer" content="webkit" />
    <meta name=”viewport” content=”width=device-width, initial-scale=1″ />
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0;" name="viewport" />
    <!–[if lt IE 9]><script src=”http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js”></script><![endif]–>
    <link href="../static/css/textflash.css" type="text/css" rel="stylesheet">
    <link href="../static/css/mainframe.css" type="text/css" rel="stylesheet">
    <link href="../static/css/product.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="../static/js/resAndErr.js"></script>
    <script type="text/javascript" src="../static/js/move.js"></script>
    <script type="text/javascript" src="../static/js/product.js"></script>
</head>
<body onload="begin()">
<div id="main_top" class="top">
    <div id="main_top_title" class="title">
        <b><span style="color: rgb(255, 255, 255);"><span style="font-size: 38px;"><span style="color: rgb(0, 160, 233);">AR</span> Future</span></span></b>
    </div>
    <div id="main_top_menu" class="menu">
        <table id="main_top_table" class="table"cellspacing="30">
            <tr>
                <td><button id="button1" class="button" onclick="move1()">首页</button></td>
                <td><button id="button2" class="button" onclick="move2()">资源识别</button></td>
                <td><button id="button3" class="button" onclick="move3()">实时截取</button></td>
                <td><button id="button4" class="button" onclick="move4()">用户信息</button></td>
            </tr>

        </table>
    </div>
    <div id="main_top_login" class="login">
        <table id="main_top_logintable" class="table"cellspacing="20">
            <tr>
                <td><button id="button5" class="button_1" onclick="move5()">登陆</button></td>
                <td><button id="button6" class="button_2" onclick="move6()">注册</button></td>

            </tr>

        </table>
    </div>
</div>
<div id="main_mid" class="mid">
    <h1 class="loadingtext" style="position:absolute;top:0px;left:11%;">
        <span>U</span>
        <span>P</span>
        <span>L</span>
        <span>O</span>
        <span>A</span>
        <span>D</span>

    </h1>
  <div id="pro_mid" class="captionflash">

  </div>
    <div id="pro_mid_board" class="board">
        <form action="/dddemo/file/upload" method="post" ENCTYPE="multipart/form-data" class="video_upload" id="video_upload" name="video_upload">
        <table class="upload_table">
            <tr style=" border:1px solid rgb(255, 255, 255) ;">
                <td><p id="p2" >上传资源（多文件拖拽上传）</p></td>

            </tr>
            <tr style=" border:1px solid rgb(255, 255, 255) ;">
                <td><div id="area"style="border: white 1px solid;border-radius: 10px;width: 70%;height: 130px;float: top;margin-left: 15%"></div></td>
            </tr>
            <tr style=" border:1px solid rgb(255, 255, 255) ;">
                <td><p id="p1">有效图片： 张</p> </td>
                <td></td>
            </tr>
        </table>
        </form>
    </div>
    <div id="pro_mid_right" class="right">
    <img id="np"src="../static/image/np.gif" style="height: 100%;width: 100%">
    </div>
</div>
<div id="main_down" class="down">
    <div id="inner_div" class="down_inner">
        <table id="down_table" class="down_table" cellspacing="50" style="margin: 0px;padding: 0px;" >
            <tr>
                <td>
                    <div id="main_down_aboutus" class="aboutus">
                        <a href="/dddemo/down/videlist" onclick=""><img src="../static/image/44.png"></a>
                        <span style="color: rgb(255, 255, 255);font-size: 20px;font-weight: 100 ;margin-top: 10px;align-content: center;">&nbsp;历史记录</span>
                    </div></td>
                <td>
                    <div id="main_down_info" class="aboutus">
                        <a href="/dddemo/resanderr/res"><img src="../static/image/15.png"></a>
                        <span style="color: rgb(255, 255, 255);font-size: 20px;font-weight: 100 ;margin-top: 10px;align-content: center;">&nbsp;使用体验</span>
                    </div>
                </td>
                <td>
                    <div id="main_down_joinus" class="aboutus">
                        <a href="http://cs.whu.edu.cn"onclick=><img src="../static/image/34.png"></a>
                        <span style="color: rgb(255, 255, 255);font-size: 20px;font-weight: 100 ;margin-top: 10px;align-content: center;">&nbsp;加入我们</span>
                    </div>
                </td>
                <td>
                    <div id="main_down_improve" class="aboutus">
                        <a href="/dddemo/resanderr/err"><img src="../static/image/32.png"></a>
                        <span style="color: rgb(255, 255, 255);font-size: 20px;font-weight: 100 ;margin-top: 10px;align-content: center;">&nbsp;错误反馈</span>
                    </div>
                </td>
            </tr>


        </table>
    </div>
</div>

</body>
</html>
