<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>-->
<html>
<head>
<meta charset="utf-8">
<!--自适应，宽度为屏幕宽度，初始网页占屏幕面积100%-->
<meta name="viewport" content="width:device-width,initial-scale=1"/>
<script language="javascript" type="text/javascript" src="js/jquery-1.1.3.1.pack.js"></script>
<script src="js/jquery-1.4.4.min.js"></script>
<script src="js/slides.min.jquery.js"></script>
	<script>
	$(function() {
    swapValues = [];
    $(".swap_value").each(function(i){
        swapValues[i] = $(this).val();
        $(this).focus(function(){
            if ($(this).val() == swapValues[i]) {
                $(this).val("");
            }
        }).blur(function(){
            if ($.trim($(this).val()) == "") {
                $(this).val(swapValues[i]);
            }
        });
    });
});
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'img/loading.gif',
				play: 3500,
				pause: 2500,
				hoverPause: true,
				animationStart: function(){
					$('.caption').animate({
						bottom:-35
					},100);
				},
				animationComplete: function(current){
					$('.caption').animate({
						bottom:0
					},200);
					if (window.console && console.log) {
						// example return of current slide number
						console.log(current);
					}
				}
			});
		});
	</script>

<title>社团主页</title>

<style type="text/css">
	*{
		margin:0px;
		padding:0px;	
	}
	a{
		text-decoration:none;
		color:#000;
		font-family:"Microsoft YaHei UI";
		font-size:18px;
		}
	li{
		list-style:none;
		}
	p {
   		 padding: 12px 0;
   		 margin: 0;
  		 font-size: .8em;
    	 line-height: 1.5;
	}
	form {
    	 margin: 0;
	}
	#search_box {
   		 width: 201px;
   		 height: 31px;
   		 background: url(img/bg_search_box.gif);
	   	 position:relative;
	     left:950px;
	     top:30px;
    }
    #search_box #s {
    	 float: left;
    	 padding: 0;
    	 margin: 6px 0 0 6px;
    	 border: 0;
    	 width: 159px;
    	 background: none;
    	 font-size: .8em;
 	}
	#search_box #go {
   	 	 float: right;
    	 margin: 3px 4px 0 0;
	}
	.NEU{
		position:absolute;
		left:20px;}
	.logo{
	position: absolute;
	left: 15px;
	top: 160px;
		}
	.dz{
		position:relative;
		left:1180px;
		top:4px;
		width:100px;
	}
	.dz a{
		text-decoration:none;
		color:#000;
		}
	.huo{color:#000;}
	.dz a:hover{
		color:green;
		}
	.title_1{
		position:absolute;
		left:158px;
		top:90px;
		}
	.title_2{
		position:absolute;
		left:211px;
		top:90px;
		}
	.title_3{
		position:absolute;
		left:264px;
		top:90px;
		}
	.title_4{
		position:absolute;
		left:317px;
		top:90px;
		}
	.title_1 a:hover{
		color:green;
		}
	.title_2 a:hover{
		color:green;
		}
	.title_3 a:hover{
		color:green;
		}
	.title_4 a:hover{
		color:green;
		}
	#container {
		width:1349px;
		position:relative;
		top:-345px;
		z-index:0;
	}
	#slides .next,#slides .prev {
		position:absolute;
		top:217px;
		left:229px;
		width:24px;
		height:43px;
		display:block;
		z-index:101;
	}
	#slides .next {
		left:980px;
	}
	.slides_container {
		width:1349px;
		height:500px;
		overflow:hidden;
	}
	.pagination {
		margin:26px auto 0;
		width:100px;
		position:absolute;
		top:450px;
		left:600px;
		z-index:1000;
	}
	.pagination li {
		float:left;
		margin:0 1px;
	}
	.pagination li a {
		display:block;
		width:12px;
		height:0;
		padding-top:12px;
		background-image:url(img/pagination.png);
		background-position:0 0;
		float:left;
		overflow:hidden;
	}
	.pagination li.current a {
		background-position:0 -12px;
	}
	.caption {
		position:absolute;
		bottom:-35px;
		height:30px;
		padding:5px 20px 0 20px;
		background:#000;
		background:rgba(0,0,0,.5);
		width:540px;
		font-size:1.3em;
		line-height:1.33;
		color:#fff;
		border-top:1px solid #000;
		text-shadow:none;
	}

	.pagination li a:link,.pagination li a:visited {
		color:#599100;
		text-decoration:none;
	}

	.pagination li a:hover,.pagination li a:active {
		color:#599100;
		text-decoration:underline;
	}
	.from{
		position:absolute;
		top:310px;
		left:95px;
		}
	.sum{
		position:absolute;
		top:545px;
		left:50px;
		}
	.footer{
		width:100%;
		height:130px;
		background:#5C5C5C;
		position:absolute;
		top:1040px;
		}
	.footer img{
		position:absolute;
		top:100px;
		left:590px;
		background-color:#666666;
		}
	.top{
		position:absolute;
		left:490px;
		top:10px;
		}
	.top a{
		color:#FFF;
		font-size:16px;
		}
	.middle{
		position:absolute;
		top:40px;
		left:530px;
		color:#FFF;
		font-size:14px;
		}
	.foot{
		position:absolute;
		top:70px;
		left:410px;
		color:white;
		font-size:14px;
	}
	.logo{
		position:absolute;
		left:130px;
		top:12px;
	}
	.clubpic{
		position:absolute;
		left:20px;
		top:150px;
		border: 5px sold #F0F8FF; 
		padding:7px;
		text-align:center;
	}
	.clubpic img{
		border: 5px sold #F0F8FF; 
		padding:7px;
		text-align:center;
		
	}
	.lefter{;
		top:200px;
		width:240px;
	}
	.clubname{
		top:325px;
		font-family: "Arial",sans-serif;
		word-wrap: break-word; 
		word-break: normal; 
	}
	.clubfunction{
		font-family: Georgia,serif;
		text-align:center;
		font-size:36px;
	}
	.bgpic{
		left:320px;
		top:240px;
		margin:0px 0px auto 320px;
	}
	.toper{
		background-color:#FFFFFF;
		height:140px;
	} 
	.middle{
		left:320px;
	}
</style>
</head>
<body style="background-color:#E9EBEE" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/Community Maven Webapp/src/main/webapp/WEB-INF/jsp/homepage.jsp">
<div class="NEU" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/Community Maven Webapp/src/main/webapp/WEB-INF/jsp/homepage.jsp">
	<img src="img/58ee3d6d55fbb2fbfc64180b4d4a20a44623dc58.png" width="120" height="113">
</div>
<div class="logo">
	<img src="img/150017160818052.png">
</div>
<!--搜索栏-->
<div id="search_box">
    <form id="search_form" method="post" action="#">
        <input type="text" id="s" value="搜索从这里开始…" class="swap_value" />
        <input type="image" src="img/btn_search_box.gif" width="27" height="24" id="go" alt="Search" 				         title="Search" />
    </form>
</div>
<div class="dz">
<!--登录、注册-->
<a class="enter" href="#">登录<a><span class="huo">&nbsp;|&nbsp;</span><a class="enroll" href="#">注册</a>
</div>
<!--标题栏四个选项，对应其他界面-->
<div class="title_1"><a href="#">社团</a></div>
<div class="title_2"><a href="#">活动</a></div>
<div class="title_3"><a href="#">校内</a></div>
<div class="title_4"><a href="#">兼职</a></div>



<!--社团左边框-->
<div class="lefter" >
	<!--社团头像，中层左上角-->
	<div class="clubpic">
	<img src="img/科协logo.jpg"  style="border:5 solid #F0F8FF" width="170" height="170" >
	<div>
	<h1>东北大学学生<br>科学技术协会<br /><br />
	</div>
	<div class="clubfunction">
    <dl>
    <dt>社团简介</dt><br />
    <dt>社团活动</dt><br />
    <dt>社团成员</dt><br />
    <dt>社团相册</dt><br />
    <dt>联系反馈</dt><br />
    </dl>
    </div>
</div>


<!--内层上方相册-->
<div class="bgpic" top:"240" left:"480">
	<img src="img/demopic.jpg" width="881" height="452" top:"240" left:"480">
</div>

<!--内层动态滚动页-->
<div class="middle">

</div>


<!--网站底部栏-->
<div class="footer">
	<!--<div class="footer_logo"><img src="img/codeispoetry.png">-->
	<!--网页尾部，五个链接仿别的网站，计划书中没有，听取大家意见，进行调整-->
	<div class="top">
	<a href="#" target=_blank>网站地图</a> | 
	<a href="#" target=_blank>网站申明</a> | 
	<a href="#" target=_blank>联系我们</a> |
	<a href="#" target=_blank>使用帮助</a> |
	<a href="#" target=_blank>主编邮箱</a> 
    </div>
    <!--产权说明-->
    <div class="middle">
    主办：东北大学软件学院&nbsp;&nbsp;&nbsp;&nbsp;
    承办：百亿项目组
    </div>
    <!--联系方式-->
    <div class="foot">  
    邮箱：394691285@qq.com　辽ICP备064068804　辽公网安备 71898202708132号
    </div>
    <img src="img/codeispoetry.png">
    </div>
</body>
</html>
