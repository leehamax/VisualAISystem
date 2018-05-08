<%--
  Created by IntelliJ IDEA.
  User: Leeham
  Date: 2018/3/25
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Response</title>
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
    <script type="text/javascript" src="../static/js/error.js"></script>
    <link href="../static/css/reponse.css" type="text/css" rel="stylesheet">
    <!–[if lt IE 9]><script src=”http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js”></script><![endif]–>
</head>
<body onload="createCode();draw();">
<div id="error_page" class="page">
    <div id="main_mid_signup" class="signup">
        <h1  style="text-align: center;margin-top: 8px;font-style: italic ;color: rgb(255,255,255);">Response Page</h1>
        <form id="sign_up_form" name="reponse_form" class="form" action="" method="post">

            <select name="reponse_select" class="input_board_select">
                <option name="response_select_tag1" value="BSD">点赞界面美工</option>
                <option name="response_select_tag2" value="BAC">点赞算法实现</option>
                <option name="response_select_tag3" value="BCL">点赞控件逻辑</option>
                <option name="response_select_tag4" value="BBB">单纯为您打call</option>
            </select>
            <textarea name=" response_textarea" class="input_board_textarea" id="" cols="30" rows="80"wrap="soft"  onfocus="if(this.value=='使用体验'){value=''}" onblur="if(this.value==''){value='使用体验'}">使用体验</textarea>">


            <input id="inputcode" class="input_board" type="text" style="width: 20%;width: 20%;float: left"  value="请输入验证码"onfocus="this.value=''" onblur="if(this.value==''){this.value='请输入验证码'}">

            <canvas id="code" style="float: left;width: 15%;height:50px;margin-top:22px;margin-left:5%;border: 1px white solid;background-color: white;" onclick="Redraw()"></canvas>

            <input class="input_board" type="submit" name="submit" style="float: left;width: 20%;margin-left: 10%;">
        </form>
    </div>
</div>
</body>
</html>
