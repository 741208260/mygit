<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'register.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	
</script>
</head>

<body>
	<div align="center">
		<h2>注册</h2>
		<hr />
		<form action="">
			<table border="0" align="center">
				<tr>
					<td width="150px">用户名</td>
					<td width="400px"><input type="text" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="text" /></td>
				</tr>
				<tr>
					<td>电话</td>
					<td><input type="text" /></td>
				</tr>
				<tr>
					<td>地址</td>
					<td><textarea cols="20" rows="5"></textarea></td>
				</tr>
				<tr>
					<td>验证码</td>
					<td><input type="text" style="width: 50px; height: 30px;">
					</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="checkbox" id="cb" onclick="check()" />是否同意本公司协议
					</td>
				</tr>

				<tr>
					<td align="center">
						<!--加标签判断能否跳转--> <input type="submit" value="注册" id="sub"
						disabled="true" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
