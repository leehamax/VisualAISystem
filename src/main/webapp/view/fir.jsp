<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>H M S</title>
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
    <link href="../static/css/mainframe.css" type="text/css" rel="stylesheet">
    <link href="../static/css/fir.css" type="text/css" rel="stylesheet">
   
    <script type="text/javascript" src="../static/js/fir.js"></script>
    <script type="text/javascript" src="../static/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="../static/js/prevent.js"></script>
    <script type="text/javascript" src="../static/js/resAndErr.js"></script>
    <script type="text/javascript" src="../static/js/move.js"></script>
</head>
<body >


<div id="main_top" class="top" >
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
        <table id="main_top_logintable" class="table"cellspacing="20" >
            <tr>
                <td><button id="button5" class="button_1" onclick="move5()">登陆</button></td>
                <td><button id="button6" class="button_2" onclick="move6()">注册</button></td>

            </tr>

        </table>
    </div>

</div>
<div id="main_mid" class="mid" >
    <div id="main_mid_caption" class="caption">
        <b>
            <span style="color: rgb(255, 255, 255);"><span style="font-size: 60px;font-weight: 200 ;"><span style="color: rgb(0, 160, 233);">工商图片</span>智能识别系统</span></span>
            <br><br><br>
            <span style="color: rgb(255, 255, 255);font-size: 20px;font-weight: 100 ;">&nbsp;&nbsp;&nbsp;&nbsp;一款基于人工智能和计算机视觉的识别工具</span>
            <br><br>
            <span style="color: rgb(255, 255, 255);font-size: 20px;font-weight: 100 ;">&nbsp;&nbsp;&nbsp;&nbsp;为所取工商图片进行有效的提取与利用</span>
            <br><br><br><br>
        </b>
        <button id="button8" class="button_3">了解更多</button>
    </div>
</div>
    <div id="main_down" class="down" >
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
