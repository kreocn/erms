<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品类型</title>
</head>
<body>
	<h1>This is Type List Page!!</h1>
	<h2>${name}</h2>
	<table border="1">
	<tr>
		<th>序号</th>
		<th>编号</th>
		<th>类型名称</th>
		<th>类型分组</th>
		<th>状态</th>
		<th>修改人</th>
		<th>修改时间</th>
	</tr>
	<c:forEach var="it" items="${goodsTypes}" varStatus="st">
	<tr>
		<td>${st.index}</td>
		<td>${it.uuid}</td>
		<td>${it.type_name}</td>
		<td>${it.type_group}</td>
		<td><fmt:formatNumber value="${it.status}" type="currency" /></td>
		<td>${it.lm_user}</td>
		<td><fmt:formatDate value="${it.lm_time}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>