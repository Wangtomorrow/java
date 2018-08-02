<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<link href="style/main_login.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/form.js"></script>
</head>
<body>
	<div id="warp">
    	<div id="header">
        	<div class="text">
            	<ul>
                	<li><h1>住房公积金管理系统</h1></li>
                    <li><h3>主办单位：住房公积金管理中心</h3></li>
                </ul>
            </div>
        </div>
        	
        <div id="contents">
        	<div class="all">
            	<div class="left"><img src="img/logo.jpg" alt="" / class="img"></div>
            	<div class="right">
            		<form action="loginServlet" method="post">
            		<ul>
                    	<li>用户名：<input type="text" id="op" name="op"></li>
                        <li>密码： <input type="password" id="password" name="password" class="password" ></li>
                        <li><input type="submit" value="登录" id="button"  class="button" onclick="check_submit1()">
                        <input type="button" value="注册" id="button1"  class="button1" onclick="check_submit2()"></li>
                    </ul>
                    </form>
            	</div>
            </div>
        	    	
        </div>
        <div id="footer"></div>
    </div>
</body>
</html>

