<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'frame.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<frameset border="1" rows="100,*">
		<frame  src="frame1/topFrame.jsp" noresize="noresize"/>
		<!--中间-->
		<frameset cols="200,*" border = "1" >
			<!--上边标题-->
			<frame src = "frame1/leftFrame.jsp" noresize="noresize"
			
			/>
			<!--下边内容-->
			<frame src = "frame1/rightFrame.jsp"/>
		</frameset>
	
	
	</frameset>

  </head>
  
  <body>
  </body>
</html>
