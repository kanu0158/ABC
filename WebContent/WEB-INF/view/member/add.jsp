<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div id="content">
		<div id="user-login-layout">
	<h1>회원가입</h1>
	<form id="user-join-form">
		ID: <input type="text" name="userId" /><br>
		PASS: <input type="text" name="userPass" /><br>
		NAME: <input type="text" name="name" /><br>
		SSN: <input type="text" name="ssn" /><br>
		<br/>
		소속팀:
		<input type="radio" name="teamId" value="" checked="checked"/>없음
		<input type="radio" name="teamId" value="ATEAM" checked="checked"/>걍놀자
		<input type="radio" name="teamId" value="HTEAM" checked="checked"/>지은이네
		<input type="radio" name="teamId" value="STEAM" checked="checked"/>왕거북이
		<input type="radio" name="teamId" value="CTEAM" checked="checked"/>코딩짱
		<br/>
		프로젝트역할
		<select name="roll" id="roll">
			<option value="leader">팀장</option>
			<option value="front">프론트개발</option>
			<option value="back">백단개발</option>
			<option value="android">안드로이드개발</option>
			<option value="minfe">민폐</option>
		</select>
		<br/>
		수강과목
		<input type="checkbox" name="subject" value="java" checked="checked" />Java 
		<input type="checkbox" name="subject" value="clang" />C언어 
		<input type="checkbox" name="subject" value="jsp" />JSP 
		<input type="checkbox" name="subject" value="php" />PHP 
		<input type="checkbox" name="subject" value="nodejs" />NodeJS 
		<input type="checkbox" name="subject" value="linux" />Linux
		<input type="checkbox" name="subject" value="html" />HTML
		<input type="checkbox" name="subject" value="spring" />Spring
		<br/>
		<input id="addFormBtn"type="button" value="전송" />
	</form>
	</div>
	</div> <!-- content end -->
