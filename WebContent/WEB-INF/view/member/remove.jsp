<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div id="content">
		<div id="user-login-layout">
		<h1>계정탈퇴</h1>
		<form id="user-delete-form">
		비밀번호 재입력: <input TYPE="password" name="userPass" id="userPass" /><br>
		<input id="deleteFormBtn" type="button" value="전 송"/> 
		</form>
	</div>
	</div> <!-- content end -->
	
<script>
	var form = document.getElementById('user-delete-form'); //폼은 이제 객체
	
 document.getElementById('deleteFormBtn').addEventListener('click',function(){
		alert('로긴폼태그 클릭 내부');
		var password = form.userPass.value;
		var x = service.passChecker({pass : '${user.password}',
									 newPass : password	});
		if(x.checker){
			form.action = "${context}/member.do";
			form.method = "post";
			var node = document.createElement('input');
			node.innerHTML =
				'<input type="hidden" name="action" value="remove" />';
			form.appendChild(node); // 객체(node)로 만든 다음에 form에 자식으로 붙여 넣는것!
			//정적코딩은 static 준것(html들...) 에서 처리한것(메모리 잡아먹는것)
			//동적코딩은 메소드에 의한(function(){}내부) 처리, 수행 전까지는 메모리를 잡아먹지 않고 이게 끝나면 메모리 잡아먹던 리소스가 제거된다.
			form.submit();
		}else{
			alert(x.text);
		}
	}); 
</script>
</body>
</html>