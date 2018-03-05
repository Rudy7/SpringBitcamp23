<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<section style="margin-top: 100px">
<article>
	<table id="mypage-table">
		<tr>
			<td id="mypage-profile-img-td" rowspan="5">
				<img id="mypage-profile-img" src="${path.img}/profile.jpg" alt="" /></td>
			<td class="mypage-column">ID</td>
			<td class="mypage-data"></td>
			<td class="mypage-column">BIRTHDAY</td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
			<td class="mypage-column">PASSWORD</td>
			<td class="mypage-data"></td>
			<td class="mypage-column">PHONE</td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
			<td class="mypage-column">NAME</td>
			<td class="mypage-data"></td>
			<td class="mypage-column">EMAIL</td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
			<td class="mypage-column">SSN</td>
			<td class="mypage-data"></td>
			<td class="mypage-column">ADDRESS</td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
			<td class="mypage-column">ACCOUNT</td>
			<td class="mypage-data"></td>
			<td class="mypage-column"></td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
  			<td colspan="6" style="width: 100%">
  				<button id="mypage-leave-btn" >
  					탈 퇴
  				</button>
  				<button id="mypage-change-btn">
  					수 정
  				</button>
  			</td>
  		</tr>
	</table>
</article>
</section>


<script>
$(function() {
	$('#btn-pass_update').on('click',function(){
		alert("마이페이지에서 클릭이벤트");
//		location.href ="${path.context}/"
	});	
});
</script>

