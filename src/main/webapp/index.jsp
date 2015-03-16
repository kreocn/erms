<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>INDEX FILES</title>
<body>
<h1>Hello World!</h1>
<div align="right"><a href="https://login.qkjchina.com/erms-sso/logout?service=http://localhost:8881/erms">注销</a></div>
<div>===================</div>
<div>
<%
java.util.Enumeration<String> keys = request.getAttributeNames();
while (keys.hasMoreElements()) {
	String key = keys.nextElement();
	String value = request.getAttribute(key).toString();
	//this.appendConfig(key, value);
	out.println("====================================================<br />");
	out.println("<span style='color:red'>"  +key + "</span>:" + value);
	out.println("<br />====================================================<br />");
}

out.println("====================================================<br />");
out.println("==================  SESSION START  ====================<br />");
out.println("====================================================<br />");

java.util.Enumeration<String> sessions = request.getSession().getAttributeNames();
while (sessions.hasMoreElements()) {
	String key = sessions.nextElement();
	String value = request.getSession().getAttribute(key).toString();
	out.println("====================================================<br />");
	out.println("<span style='color:red'>"  +key + "</span>:" + value);
	out.println("<br />====================================================<br />");
}

out.println(request.getAttribute("credentials"));
%>
</div>
<div>===================</div>
</body>
</html>
