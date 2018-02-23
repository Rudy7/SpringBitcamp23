<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
	<div>
		<h1>마이페이지</h1>
		<button id="mypage_nav_btn">네비 바 이동</button>
			<article>
				<table id="memberInfo">
					<tr id="pict">
						<td rowspan="5" id="pi"><img id="pin" src=""/></td>
						<td>ID</td>
						<td></td>
						<td>생년월일</td>
						<td></td>
					</tr>
					<tr>
						<td>PASS</td>
						<td></td>
						<td>NO</td>
						<td></td>     
					</tr>
					<tr>
						<td>이름</td>
						<td></td>
						<td>이메일</td>
						<td></td>        
					</tr>
					<tr>
						<td>성별</td>
						<td>남자</td>
						<td>주소</td>
						<td></td>          
					</tr>
					<tr>
						<td>ACCOUNT</td>
						<td colspan="3"></td>  <!-- user에는 어카운트넘버가 없다 -->
						<!-- <td> <td/>
						<td> <td/> -->
					</tr>
				</table> <br />
				  <form id="attend_form" action="result.jsp">
					<table id="frame" >
						<tr>
							<th>월</th>
							<th>화</th>
							<th>수</th>
							<th>목</th>
							<th>금</th>
						</tr>
					</table>
				 </form>	<br />
					<table id="pass_update_css" >	
						<tr>
							<td colspan="6">
								<input type="hidden" name="id" value="null" />
								<button id="leave">회원 탈퇴</button>
								<button id="pass_update" >비밀번호 변경</button>
								<input type="hidden" name="cmd" value="deleteMember" /><!--  -->
								<input type="hidden" name="dir" value="user" />
								<input type="hidden" name="page" value="login" />
							</td>
						</tr>
					</table>		
			</article>
	</div>
</body>
<script>
$('#mypage_nav_btn').on('click',function(){
	alert("마이페이지에서 클릭이벤트");
	location.href ="${context}/nav"
});	
</script>
</html>