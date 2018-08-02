// JavaScript Document
//验证必填项目
 function $(str){  
            return (document.getElementById(str));  
        }
 function check_submit(){  
            if($("comname").value ==""){  
                alert("请填写单位名称!");  
                return false;  
            }  
            if($("comaddr").value == ""){  
                alert("请填写单位地址!");  
                return false;  
            }  
			if($("comcode").value == ""){  
                alert("请填写组织机构代码!");  
                return false;  
            }
			
			if($("date").value == ""){  
                alert("请填写发薪日期!");  
                return false;  
            }
			if($("people").value == ""){  
                alert("请填写单位经办人!");  
                return false;  
            }
			if($("peopleid").value == ""){  
                alert("请填写经办人身份证号码!");  
                return false;  
            }
			if($("cproportion").value == ""){  
                alert("请填写单位比例!");  
                return false;  
            }
			if($("comcode").value == ""){  
                alert("请填写单位账号!");  
                return false;  
            }
			if($("idcode").value == ""){  
                alert("请填写证件号码!");  
                return false;  
            }
			if($("cardinal").value == ""){  
                alert("请填写缴存基数!");  
                return false;  
            }
			if($("username").value == ""){  
                alert("请填写用户名!");  
                return false;  
            }
			if($("password").value == ""){  
                alert("请填写密码!");  
                return false;  
            }
        }  
//验证组织机构代码长度
	function testlength(obj)
	{
		 if(obj.value.length!=9){
			help.innerHTML="请输入长度为9的文本";
   			obj.value = "";
		}else if(help!=null)
    {
        help.innerHTML="&radic;";
        return true;
        }
	}
//验证比例范围
	function testpro(obj)
	{
		var a = obj.value/100;
		 if(a<0.05||a>0.12){
			pro.innerHTML="范围为5%-12%";
   			obj.value = "";
		}else if(help!=null)
    {
        help.innerHTML="&radic;";
        return true;
        }
	}
//目前只支持身份证
	function supportid(){
		if(document.getElementById("text_fxAttribute").value == "666") {
		document.getElementById("text_fxAttribute").options[0].selected=true;
		
		return; 
	
	}
	}
//验证发薪日期
	function checkdate(obj)
	{
		 if(obj.value.length>1&&obj.value.length<31){
			tdate.innerHTML="日期范围为1-31";
   			obj.value = "";
		}else if(obj.value!=null)
    {
        tdate.innerHTML="&radic;";
        return true;
        }
	}
//验证用户名密码
function $(str){  
            return (document.getElementById(str));  
        }
 function check_submit1(){  
           if($("username").value == ""){  
                alert("请填写用户名!");  
                return false;  
            }
			else if($("password").value == ""){  
                alert("请填写密码!");  
                return false;  
            }
			else{
				window.location.href="Index.html";		
			}
			
 }
 //注册成功
 function $(str){  
            return (document.getElementById(str));  
        }
 function check_submit2(){  
           if($("username").value == ""){  
                alert("请填写用户名!");  
                return false;  
            }
			else if($("password").value == ""){  
                alert("请填写密码!");  
                return false;  
            }
			else{
				alert("注册成功！");		
			}
			}

	
	
	
	
