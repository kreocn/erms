<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GoodsType</title>
</head>
<body>
	<h1>This is goods type!!</h1>
	<h2>${name}</h2>
	<form action="/erms/goods/type_add" method="post">
		<table border="1">
			<tr>
				<td>类型名称:</td>
				<td><input type="text" name="type_name" value="${goodsType.type_name}" /></td>
			</tr>
			<tr>
				<td>类型分组:</td>
				<td><input type="text" name="type_group" value="${goodsType.type_group}" /></td>
			</tr>
			<tr>
				<td>状态:</td>
				<td><input type="text" name="status" value="${goodsType.status}" /></td>
			</tr>
			<tr>
				<td>修改人:</td>
				<td><input type="text" name="lm_user" value="${goodsType.lm_user}" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
	
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
</body>
</html>