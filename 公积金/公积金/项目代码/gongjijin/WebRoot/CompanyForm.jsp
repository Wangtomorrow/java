<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>单位开户</title>
<script type="text/javascript" src="js/form.js"></script>
</head>
	
    	<form action="openUnitServlet" method="post">
        	<table  cellpadding="7" cellspacing="0" align="center" width="550">
            	
                <caption><h3>单位住房公积金开户申请表</h3></caption>
                <tr>
                	<td width="120">单位名称:</td>
                    <td><input type="text" name="unitaccname" id="comname" style="width:200px;"><span style="color:#F00;">&nbsp;*</span></td>                   
                </tr>
                <tr>
                	<td>单位地址:</td>
                    <td><input type="text" name="unitaddr" id="comaddr"><span style="color:#F00;">&nbsp;*</span></td>
                </tr>
                <tr>
                	<td>组织机构代码：</td>
                    <td><input type="text" name="orgcode" id="comcode" onBlur="testlength(this)";><span id=help style="color:#F00; font-size:12px;">&nbsp;*&nbsp;9位长度</span></td>
                </tr>
                <tr>
                	<td>单位类别：</td>
                    <td>
                    	<select name="unitchar">
                        	<option value="1">1.企业</option>
                            <option value="2">2.事业</option>
                            <option value="3">3.机关业</option>
                            <option value="4">4.团体</option>
                            <option value="5">5.其他</option>
                        </select>
                        <span style="color:#F00;">&nbsp;*</span>
                    </td>
                </tr>
                <tr>
                	<td>企业类型:</td>
                    <td>
                    	<select name="unitkind">
                        	<option value="110">110 国有经济</option>
                            <option value="120">120 集体经济</option>
                            <option value="140">140 联营企业</option>
                            <option value="150">150 有限责任公司</option>
                            <option value="160">160 股份有限公司</option>
                            <option value="170">170 私营企业</option>
                            <option value="190">190 其他企业</option>
                            <option value="200">200 港、澳、台商投资企业</option>
                            <option value="300">300 外商投资企业</option>
                            <option value="900">900 其他</option>
                        </select>
                        <span style="color:#F00;">&nbsp;*</span>
                    </td>
                </tr>
                <tr>
                	<td>发薪日期：</td>
                    <td>
                    	<input type="text" name="salarydate" id="date" onblur="checkdate(this)">日<span id= tdate style="color:#F00; font-size:12px;" >&nbsp;*&nbsp；1-31</span>
                    </td>
                    
                    
                </tr>
                <tr>
                	<td>联系电话:</td>
                    <td><input type="text" name="unitphone" id="number"><span style="color:#F00;">&nbsp;*</span></td>
                    
                </tr>
                <tr>
                	<td>单位经办人：</td>
                    <td><input type="text" name="unitlinkman" id="people"><span style="color:#F00;">&nbsp;*</span></td>
                    
                <tr>
                	<td>经办人身份证号码：</td>
                    <td><input type="text" name="unitagentpapno" id="peopleid" ><span style="color:#F00;">&nbsp;*</span></td>
                </tr>
                <tr>
                	<td>单位比例：</td>
                    <td><input type="text" name="unitprop" id="cproportion" onblur="testpro(this)">%<span id=pro style="color:#F00; font-size:12px;">&nbsp;*&nbsp;范围5%-12%</span></td>
                </tr>
                <tr>
                	<td colspan="2">备注：<textarea name="remark" cols="55" rows="3"></textarea></td>
                </tr>
                <tr>
                	<td colspan="3" align="right">
                    <span style="color:#F00; text-align:left; font-size:12px;">&nbsp;*为必填项</span>
                    	<input type="submit" class="sub" value="确认" onclick="check_submit()">
                    	<input type="submit" class="sub1" value="打印">
                    	<input type="reset" class="sub1" value="重置">
                    </td>
                </tr>
            </table>
     
	</form>        	
   
<body>
</body>
</html>
