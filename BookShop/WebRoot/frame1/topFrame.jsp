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

<title>My JSP 'topFrame.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table width="100%" height="79px" border="0" cellspacing="0">
		<tr>
			<td width="50%"></td>
			<td align="center"
				style="font-size: 22px;color:red ;background-color: FBEAD0">网上书店</td>
		</tr>
		<tr bgcolor="F9A859">
			<td></td>
			<td align="center" style="font-size: 13px">尊敬的<%=session.getAttribute("name")%>欢迎您的到来！
			</td>
		</tr>
	</table>
</body>
</html>
