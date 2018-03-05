<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<section>
		<article>
			<div style="width: 300px; height: 200px; margin-top:200px; ">
			구매 금액 : <input id="money" type="text" name="money" value="${money}" />
			<button id="btn-money">전송</button>
			
			</div>
		</article>
		<article>
			<div style="height: 40px; width: 300px;">	</div>
			 	<table>
			 		<tr>
			 			<th>No.</th>
			 			<th>로또번호</th>
			 		</tr>
			 		<c:forEach var="i" items="${lottos}" step="1" varStatus="status" >
			 		<tr>
			 			<td>${status.count}</td>
			 			<td>${i.lottoNumber}</td>
			 		</tr>
			 		</c:forEach>
			 	</table>
		</article>
	</section>
		<aside>
	
		</aside>
<script>

	
</script>
