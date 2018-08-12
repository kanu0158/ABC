<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="content">
	<h1>user detail page 진입</h1>
	<div>
		<table id="mypage-table">
			<tr>
				<td rowspan="3"><img src="${img}/home/bugs.PNG" alt="" /></td>
				<td>ID</td>
				<td colspan="2">${user.userId}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td colspan="2">${user.name}</td>
			</tr>
			<tr>
				<td>비번</td>
				<td colspan="2">********</td>
			</tr>
			<tr>
				<td>나이</td>
				<td>${user.age}</td>
				<td>팀명</td>
				<td>${user.teamId}</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>${user.gender}</td>
				<td>직책</td>
				<td>${user.roll}</td>
			</tr>
		</table>
	</div>
	<div>
		<a><button>로그아웃</button></a> <a id="myPageMoveToModify"><button>정보수정</button></a>
		<a id="myPageMoveToRemove"><button>계정탈퇴</button></a>
	</div>

</div>
<!-- content end -->
