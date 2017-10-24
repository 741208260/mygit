<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!-- 登录模块  -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'leftFrame.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	//检查输入值是否为空
	function checkVlaue(th) {
		var sp = th.nextSibling;
		if (th.value != null && th.value != "") {
			//显示一个绿勾
			sp.style.backgroundColor ="#00ff00";
			sp.innerHTML = "√";
		} else {
			//显示一个x
			sp.style.backgroundColor ="#ff0000";
			sp.innerText = "×";
		}
	}
</script>

</head>

<body>
<div align="center">
	<%
	//获得所有cookie
	Cookie cok [] = request.getCookies();
	//用于存储cookie的账号密码
	String user = "";
	String pwd = "";
	//给checkBox保持状态
	String che = "";
	if(cok!=null){
		for(int i =0 ; i < cok.length ; i++){
			if("user".equals(cok[i].getName())){
				user = cok[i].getValue();
				//对utf-8格式的Cookie解码
				user = URLDecoder.decode(user, "utf-8");
				che = "checked";
			}else if("pwd".equals(cok[i].getName())){
				pwd = cok[i].getValue();
			}
		}
	}
	 %>
	<h3>请登录</h3>
	<form action="servlet/Login" >
		用户名:<input type="text" name="user" value="<%=user%>"  onblur="checkVlaue(this)" /><span
			id="sp1" ></span></br> 
		密&nbsp;&nbsp;&nbsp;码:<input type="password"
			name="pwd"  value="<%=pwd%>"  onblur="checkVlaue(this)" /><span
			id="sp2" ></span></br>  
			<input type="submit" value="登录" id="login" checkVlaue(this)/>
			记住密码<input type="checkbox" name = "check" value = "ok" <%=che%>/></br>
			<a href="register/Register.jsp">注册</a> 
	</form>
	</div>
</body>
</html>
