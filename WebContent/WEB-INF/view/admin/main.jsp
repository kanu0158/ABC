<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- jstl.jar 사용하기 위해 한 것 -->
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp"/>
<body>
<div id="wrapper">
	<div id="header">
		<h1>관리자페이지</h1>
		<jsp:include page="../common/menuBox.jsp"/>
	</div> 	<!-- header end -->
	<div id="content">
		<c:choose>
			<c:when test="${pageName eq 'search'}">
				<jsp:include page="../member/search.jsp"/>
			</c:when>
			<c:when test="${pageName eq 'remove'}">
			<jsp:include page="../member/remove.jsp"></jsp:include>
		</c:when>
		<c:when test="${pageName eq 'modify'}">
			<jsp:include page="../member/modify.jsp"></jsp:include>
		</c:when>
			<c:otherwise>
				<jsp:include page="../member/retrieve.jsp"/>
			</c:otherwise>
		</c:choose>
	</div> <!-- content end -->
	<div id="footer">
		<jsp:include page="../common/footerBox.jsp"/>
	</div>
</div>
<script>
admin.main({
		context : '${context}',
		pageName : '${pageName}'
	});
</script>
</body>
</html>

