<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>住房公积金管理系统</title>
<link href="style/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function start(){
		alert("柜员"+${sessionScope.op}+"登陆成功！");
	}
</script>
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
            		<ul>
                		<li><input type="button" class="sub1" onclick="location.href='ComSelectUnitNum.jsp'"></li>
                    	<li><input type="button" class="sub2" onclick="location.href='PerModification.html'"></li>
                        <li><input type="button" class="sub3" ></li>
                        <li><input type="button" class="kaihu" onclick="location.href='OpenAccount.html'"></li>
                	</ul>
            	</div>
            </div>
        	    	
        </div>
        <div id="footer"></div>
    </div>
</body>
</html>
