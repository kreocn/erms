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
				<td><input type="text" name="type_name" value="${type_name}" /></td>
			</tr>
			<tr>
				<td>类型分组:</td>
				<td><input type="text" name="type_group" value="${type_group}" /></td>
			</tr>
			<tr>
				<td>状态:</td>
				<td><input type="text" name="status" value="${status}" /></td>
			</tr>
			<tr>
				<td>修改人:</td>
				<td><input type="text" name="lm_user" value="${lm_user}" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>