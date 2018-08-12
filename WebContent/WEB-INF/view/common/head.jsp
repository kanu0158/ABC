<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- session에 담았으니 이제 필요없게 됌 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- jstl , c는 core의 약자-->
<c:set var="context" value="<%=application.getContextPath() %>" />
 --%>
<head>
	<meta charset="UTF-8" />
	<title>Main</title>
	<link rel="stylesheet" href="${css}/style.css" />
	<script src="${js}/app.js"></script>
	<div>
		<table>
			<tr>
				<td width="400px"></td>
				<td colspan="2"><img src="${img}/home/turtle.jpg"/></td>
				<td width="400px"></td>
			</tr>
		</table>
	</div>
</head>