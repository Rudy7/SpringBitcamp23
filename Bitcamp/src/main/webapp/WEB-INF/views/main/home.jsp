<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<button id="btn">
		로그인  <!-- 돔객체, 너무빨라서 게터가 너무빠르면 존재하는 것이다 -->
	</button>
<script>
	$('#btn').on('click',function(){  //이게 ElementById 와 addEventListener 단축키이다.
		location.href = "${path.context}/login";
	});   
</script>

