<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- jstl.jar 사용하기 위해 한 것 -->
<!doctype html>
<html lang="en">
	<jsp:include page="head.jsp"/>
<body>
<div id="wrapper">
	<div id="header">
		<jsp:include page="titleBox.jsp"/>
		<jsp:include page="loginBox.jsp"/>
		<jsp:include page="menuBox.jsp"/>
	</div> 	<!-- header end -->
	<div id="content">
		<jsp:include page="contentBox.jsp"/>
	</div> <!-- content end -->
	<div id="footer">
		<jsp:include page="footerBox.jsp"/>
	</div>
</div>
<script> /* 바디 안에 넣음, 전역메소드로 처리한 것 */
common.main({
	context : '${context}',
	adminPass : '${adminPass}'}
	);
</script>
</body>
</html>