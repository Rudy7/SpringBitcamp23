<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <link rel="stylesheet" href="${path.css}/style.css" />
<style>
    .navbar-brand {
        padding-top: 0px;
        
    }
</style>
<nav class="navbar navbar-inverse navbar-fixed-top">   <!-- 인버스지우면 흰색된다. -->
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
          <img src="${path.img}/common/logo.jpg" alt="" />
          </a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
          
            <li>
            	<a id="home" href="#">
            		<span class="glyphicon glyphicon-home" aria-hidden="true">&nbsp;HOME
            		</span> 
            	</a>
            </li>
           <!--  HOME END -->	
            <li>
            	<a id="about" href="#">
            		<span class="glyphicon glyphicon-asterisk" aria-hidden="true">&nbsp;MAIL
            		</span>
            	</a>
            </li>
            <!-- MAIL END -->	
            <li>
            	<a id="a-login" href="#">
            		<span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;LOGIN
            		</span>
          		</a>
            </li>
            <li>
              <div id="header_util" class="dropdown">
		         <a  href="#" class="dropdown-toggle"
		          	data-toggle="dropdown" role="button"
		          	aria-haspopup="true" aria-expanded="false">
		          	유틸리티
		          	<span class="caret">
		          	</span>
		         </a>
		         <ul id="ul-util">
					<li><a>로또</a></li>   
					<li><a>햄버거주문</a></li>        
		         </ul>
    		  </div>
           </li> 
        </ul>
        </div>
        </div><!--/.nav-collapse -->
        	<!-- LOGIN END -->
    </nav>
    <script>
    $('#a-login').on('click',function(){
    	alert("로그인 클릭");
    	location.href="${path.context}/login";
    });
   	var $ulUtil=$("#ul-util");
   	$ulUtil.addClass("dropdown-menu");
   	
   	$('.dropdown-menu a').eq(0).on('click',function(){
   		alert('로또 하러 가자!!');
   		location.href="${path.context}/lotto/main";
   	})
   	$('.dropdown-menu a').eq(1).on('click',function(){
  	 	alert('햄버거 주문 하러 하러 가자!!');
  	 	location.href="${path.context}/burger/main";	
   	})
    </script> 
<body style="margin-bottom: 20px ">
	 
</body>

