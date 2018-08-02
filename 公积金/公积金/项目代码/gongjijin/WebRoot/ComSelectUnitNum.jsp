<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>单位公积金账号搜索</title>
		<link href="style/main_comModification.css" rel="stylesheet"
			type="text/css">
	</head>

	<body>
		<div id="warp">
			<div id="header">
				<div class="text">
					<ul>
						<li>
							<h1>
								住房公积金管理系统
							</h1>
						</li>
						<li>
							<h3>
								主办单位：住房公积金管理中心
							</h3>
						</li>
					</ul>
				</div>
			</div>
			<div id="contents">
				<div class="all">
					<div class="form">
						<form action="selectUnitServlet" method="post">
							<table>
								<tr>
									<td>
										单位公积金帐号:
										<input type="text" name="unitaccnum"
											style="width: 300px; border: 1px solid #666; height: 25px;">
									</td>
									<td>
										<input type="submit" value="确认"
											style="width: 50px; height: 25px; background: #999;"">
									</td>
								</tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
