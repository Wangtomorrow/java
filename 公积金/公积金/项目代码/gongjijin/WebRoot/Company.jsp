<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>单位网上业务平台</title>
<link href="style/main-company.css" rel="stylesheet" type="text/css">
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
            	<ul>
                	
                    <li><input type="button" class="Cmod" onclick="location.href='UnitMod.jsp'"/></li>
                    <li><input type="button" class="Cinquire" onclick="location.href='CompanyForm-1.html'" /></li>
                    <li><input type="button" class="remitted" onclick="location.href='Remitted.html'" /></li>
                    <li><input type="button" class="backtax" onclick="location.href='Backtax.html'" /></li>
                    <li><input type="button" class="delete" onclick="location.href='Delete.html'" /></li>
                </ul>
            </div>
        </div>
    </div>    	
</body>
</html>

