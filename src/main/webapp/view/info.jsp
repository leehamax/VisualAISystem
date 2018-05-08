<%--
  Created by IntelliJ IDEA.
  User: Leeham
  Date: 2018/3/25
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="example.pojo.User" %>
<html>
<head>
    <title>Information</title>
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
    <script type="text/javascript" src="../static/js/resAndErr.js"></script>
    <!–[if lt IE 9]><script src=”http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js”></script><![endif]–>
    <link href="../static/css/mainframe.css" type="text/css" rel="stylesheet">
    <link href="../static/css/info.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="../static/js/resAndErr.js"></script>
    <script type="text/javascript" src="../static/js/move.js"></script>
    <script type="text/javascript" src="../static/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="../static/js/ajaxfileupload.js"></script>
    <script type="text/javascript" src="../static/js/info.js"></script>
</head>
<body onload="loadInfo()">
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
    <div id="main_mid_info" class="info">
        <div class="user-item" style="margin-top:30px;position: relative;">
            <label>头像</label>
            <div style="margin-left: 230px;">
                <form id="upload_photo_form" action="" method="post" enctype="multipart/form-data">
                    <div class="photo">
                        <img  id="im" style="border-radius: 50px;" src='https://accounts.processon.com/uphoto/3/666/5a0f8d5fe4b06c8e10929e55.png' />
                        <div class="photo-mask">编辑头像</div>
                        <input type="file" id="file" class="img-upload" accept="image/jpeg,image/gif,image/png"  onchange="xmTanUploadImg(this)" name="photo">
                    </div>
                </form>
            </div>
        </div>
        <div class="user-item" style="margin-top:30px;position: relative;">
            <label>昵称</label>
            <div><input type="text" class="txt" id="name_txt" value="${sessionScope.user.username}" placeholder="请输15位以内的昵称"  name="fullName"/></div>
        </div>
        <div class="user-item" style="margin-top:30px;position: relative;">
            <label>邮箱</label>
            <div><input type="text" class="txt" value="${sessionScope.user.mailbox}" id="mail_txt" disabled name="email"/></div>
        </div>
        <div class="user-item" style="margin-top:30px;position: relative;">
            <label>密码</label>
            <div><input type="password" class="txt" id="password_txt" value="${sessionScope.user.password}" disabled name="pass"/></div>
        </div>
        <div class="user-item" style="margin-top:30px;position: relative;">
            <label>电话</label>
            <div><input type="text" class="txt" value="${sessionScope.user.number}" id="number_txt" disabled name="number"/></div>
        </div>
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
