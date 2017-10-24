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

<title>My JSP 'rightFrame.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
tr {
	height: 50px;
}

td {
	width: 200px;
	text-align: center;
}
</style>

</head>

<body>
	<table border="1">
		<tr>
			<td style="font-family: 楷体  ;font-size: 25px ;color: gray;">书名</td>
			<td style="font-family: 楷体  ;font-size: 25px ;color: gray;">定价</td>
			<td style="font-family: 楷体  ;font-size: 25px ;color: gray;">作者</td>
			<td style="font-family: 楷体  ;font-size: 25px ;color: gray;">求购</td>
		</tr>

		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	<span>下一页</span>
	<hr />
</body>
</html>
