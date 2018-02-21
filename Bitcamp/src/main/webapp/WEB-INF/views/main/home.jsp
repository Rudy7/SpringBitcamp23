<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>
<button id="btn">
로그인 
</button>
</body>
<script>
$('#btn').on('click',function(){  //이게 ElementById 와 addEventListener 단축키이다.
		alert('제이쿼리가 작동한다 !!');
	
});   
</script>
</html>
