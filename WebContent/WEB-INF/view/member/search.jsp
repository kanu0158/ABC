<%@page import="domain.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- jstl.jar 사용하기 위해 한 것 -->
<div id="content-box">
	<div id="searchBox">
		<input id="searchBtn" name="searchBtn"  type ="button" value="검색" />
		<input id="searchWord" name="searchWord" type="text" placeholder="검색어 입력"/>
		<select name="searchOption" id="searchOption">
			<option value="none">검색조건</option>
			<option value="userId">아이디</option>
			<option value="name">이  름</option>
			<option value="teamId">팀  명</option>
		</select>

	</div>

	<table id="contentBoxTab">
		<tr id="contentBoxMeta">
			<th>아이디</th>
			<th>이   름</th>
			<th>나   이</th>
			<th>성   별</th>
			<th>역   할</th>
			<th>팀아이디</th>
		</tr>
		<%-- <c:forEach begin="" end="" items="" step="" var="" varStatus=""> for-loop --%>
		<c:forEach items='${list}' var='user'> <!-- for-each -->
		<tr>
			<td>${user.userId}</td>
			<td><a class="username"  id="${user.userId}">${user.name}</a></td>
			<!-- 이렇게 살지 말자 우리 삼촌세대에서 이렇게 했다. -->
			<%-- <td><a href="${context}/admin.do?action=retrieve&page=memberDetail&user_id=${member.userid}" style="cursor:pointer;">${member.name}</a></td> --%>
			<td>${user.age}</td>
			<td>${user.gender}</td>
			<td>${user.roll}</td>
			<td>${user.teamId}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="6">
				<!-- 그 수많은 리스트를 가지고 와서 사이즈구하는건 미친짓이다! -->
				<%-- 조회 회원수 : ${count}   --%>
				조회 회원수 결과 : ${page.count}  
				<br />
				<ul class="pageBox">
					<c:if test="${page.existPrev}"> 
						<li><a class="pageNum" id="${page.prevBlock}" >이전◀</a></li>
					 </c:if> 
				
					<c:forEach begin="${page.beginPage}" end="${page.endPage}" step="1" varStatus="i">
					<li>
						<span><a class="pageNum" id="${i.index}">${i.index}</a></span>
					</li>
					</c:forEach>
					
					<%-- <c:if test="${count gt next}"> --%>
					<c:if test="${page.existNext}"> 
						<li><a class="pageNum" id="${page.nextBlock}" >다음▶</a></li>
					 </c:if> 
				</ul>
				<!-- 그 수많은 리스트를 가지고 와서 사이즈구하는건 미친짓이다! -->
				<%-- <c:forEach begin="1" end="${count%5 == 0 ? count/5 : count/5 + 1}" step="1" var="i"> --%>
				<%-- <c:forEach begin="1" end="${pagenum}" step="1" varStatus="i">
					<span><a href="#">${i.index}</a><span>
				</c:forEach> --%>
			</td>
		</tr>
	</table>
</div>


