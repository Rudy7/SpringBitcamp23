<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
	

<div id="wrapper3">
		<header id="index_header">
			<a href="#">프로젝트</a>
		</header>
		<section >
			<article>
		 <table id="index_table" >
			<tr >
			<td colspan="5">
				
					<table>
							<tr>
		   						<td>
		   							<input id="id" name="id" type="text" value="kim" placeholder="ID"> <!--id=자바스크립트에서사용(.js.jsp), name=자바에서사용(.java)-->
							    </td>
							    <td rowspan="2">
							    	<button id="index_login_btn"  >로그인</button>   	
								</td>
							</tr>
							<tr>
								<td>
									<input id="pass" name="pass" type="text" value="1" placeholder="PASSWORD" />
									<input type="hidden" name="cmd" value="login" />
									<!-- <input type="hidden" name="dir" value="bitcamp" /> -->
									<input type="hidden" name="page" value="mypage" />
								</td>
							</tr>	
					</table>
				
				<table>
				<tr>
					<td>
						<a id="go_admin_link" href="#" >관리자 <br/>
						</a> 
						<a id="go_join_link" href="#" >회원가입  <br/>
						</a>
						<a id="go_jdbc_link" href="#" >JDBC TEST 
						</a>
					</td>
				</tr>
				</table>	
			</table> 
			</article>
	</section>
</div>
</body>
<script>
$('#index_login_btn').on('click',function(){
	alert("로그인 버튼클릭 ");
	location.href = "${context}/mypage"
});
</script>
</html>
