<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
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

<title>社团之家</title>

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
	     left:70.42%;/*950px;*/
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
		 outline:none;
 	}
	#search_box #go {
   	 	 float: right;
    	 margin: 3px 4px 0 0;
	}
	.NEU{
		position:absolute;
		left:1.48%;/*20px;*/
		}
	.logo{
		position:absolute;
		left:9.64%;/*130px;*/
		top:12px;
		}
	.dz{
		position:relative;
		left:87.47%;/*1180px;*/
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
		left:11.71%;/*158px;*/
		top:90px;
		}
	.title_2{
		position:absolute;
		left:15.64%;/*211px;*/
		top:90px;
		}
	.title_3{
		position:absolute;
		left:19.57%;/*264px;*/
		top:90px;
		}
	.title_4{
		position:absolute;
		left:23.5%;/*317px;*/
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
	.list{
		position:relative;
		left:3.33%;/*45px;*/
		top:120px;
		background:#CCC;
		width:150px;
		height:430px;
		z-index:1;
		background-color:#CCC; opacity:0.8;
		}
	.lists{
		position:relative;
		top:15%;
		left:25%;/*35px;*/	
	}
	.list_1 a:hover{
		color:green;
		}
	.list_2 a:hover{
		color:green;
		}
	.list_3 a:hover{
		color:green;
		}
	.list_4 a:hover{
		color:green;
		}
	.list_5 a:hover{
		color:green;
		}
	.list_6 a:hover{
		color:green;
		}
	.list_7 a:hover{
		color:green;
		}
	.list_8 a:hover{
		color:green;
		}
		
	#container {
		width:100%;
		position:relative;
		top:-345px;
		z-index:0;
	}
	#slides .next,#slides .prev {
		position:absolute;
		top:217px;
		left:16.98%;/*229px;*/
		width:24px;
		height:43px;
		display:block;
		z-index:101;
	}
	#slides .next {
		left:70.65%;/*980px;*/
	}
	.slides_container {
		width:100%;
		height:500px;
		overflow:hidden;
	}
	.pagination {
		margin:26px auto 0;
		width:100px;
		position:absolute;
		top:450px;
		left:44.48%;/*600px;*/
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
	.person{
		width:280px;
		height:380px;
		background-color:#CCC; opacity:0.8;
		position:absolute;
		left:74.5%;/*1040px;*/
		top:60px;
		z-index:1001;	
		}
	.person_photo{
		position:relative;
		left:36%;/*100px;	*/
		top:7%;
		width:93px;
		height:93px;
		border-radius:50%;
	}
	.person_photo img{
		width:83px;
		height:83px;
		border-radius:50%;
	}
	.register{
		width:160px;
		height:36px;
		background-color:#090;
		position:relative;
		left:21%;/*65px;*/
		top:55px;
		line-height:36px;
		}
	.registers .register:hover{
		background-color:#0F0;
		}
	.from{
		position:relative;
		top:75px;
		left:0%;/*95px;*/
		}
	.sum{
		position:absolute;
		top:545px;/*545px;*/
		left:3.5%;
		}
	.hot_1 a img{
		height:50px;
		width:180px;
		position:absolute;
		left:17.8%;/*240px;*/	
		top:530px;
	}
	.hot_1 a img:hover{
		transform:scale(1.1);
		}
	.hot_2 a img{
		height:50px;
		width:180px;
		position:absolute;
		left:33.62%;/*440px;*/	
		top:530px;
	}
	.hot_2 a img:hover{
			transform:scale(1.1);
		}
	.hot_3 a img{
		height:50px;
		width:180px;
		position:absolute;
		left:48.9%;/*635px;*/	
		top:530px;
	}
	.hot_3 a img:hover{
			transform:scale(1.1);
		}
	.hot_4 a img{
		height:50px;
		width:180px;
		position:absolute;
		left:64.5%;/*835px;*/	
		top:530px;
	}
	.hot_4 a img:hover{
			transform:scale(1.1);
		}
	.hot_5 a img{
		height:50px;
		width:180px;
		position:absolute;
		left:80.84%;/*1050px;*/
		top:530px;	
	}
	.hot_5 a img:hover{
			transform:scale(1.1);
		}
	.recommend{
		background-color:#EAEAEA;
		width:100%;
		height:400px;
		position:absolute;
		top:620px;
		z-index:-1;
		}
	.recommend font{
		position:absolute;
		top:15px;	
		left:3.34%;/*45px;*/
	}
	.recommend_1{
		width:236px;
		height:280px;
		position:absolute;
		left:3.71%;/*50px;*/
		top:70px;
		background:#FFF; 
		overflow: hidden;  
		}
	.recommend_1:hover{   
		box-shadow: 2px 4px 6px #666;
		cursor: pointer;
	}
	.recommend_1 a img{
		width:236px;
		height:135px; 
		position:absolute;
		left:0px;
		top:0px;
		transition: all 0.6s; 
		}
	.recommend_1 a img:hover{
		 transform: scale(1.1);
		 }
	.name_1{
		position:relative;
		top:150px;
		left:3.74%;/*10px;*/
	}
	.word_1 a{
		position:relative;
		top:165px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.words_1 a{
		position:relative;
		top:171px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.recommend_2{
		width:236px;
		height:280px;
		position:absolute;
		left:22.61%;/*305px;*/
		top:70px;
		background:#FFF; 
		overflow: hidden;  
		}
	.recommend_2:hover{   
		box-shadow: 2px 4px 6px #666;
		cursor: pointer;
	}
	.recommend_2 a img{
		width:236px;
		height:135px; 
		position:absolute;
		left:0px;
		top:0px;
		transition: all 0.6s; 
		}
	.recommend_2 a img:hover{
		 transform: scale(1.1);
		 }
	.name_2{
		position:relative;
		top:150px;
		left:3.47%;
	}
	.word_2 a{
		position:relative;
		top:165px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.words_2 a{
		position:relative;
		top:171px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.recommend_3{
		width:236px;
		height:280px;
		position:absolute;
		left:41.51%;/*560px;*/
		top:70px;
		background:#FFF; 
		overflow: hidden;  
		}
	.recommend_3:hover{   
		box-shadow: 2px 4px 6px #666;
		cursor: pointer;
	}
	.recommend_3 a img{
		width:236px;
		height:135px; 
		position:absolute;
		left:0px;
		top:0px;
		transition: all 0.6s; 
		}
	.recommend_3 a img:hover{
		 transform: scale(1.1);
		 }
	.name_3{
		position:relative;
		top:150px;
		left:3.47%;
	}
	.word_3 a{
		position:relative;
		top:165px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.words_3 a{
		position:relative;
		top:171px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.recommend_4{
		width:236px;
		height:280px;
		position:absolute;
		left:60.42%;
		top:70px;
		background:#FFF; 
		overflow: hidden;  
		}
	.recommend_4:hover{   
		box-shadow: 2px 4px 6px #666;
		cursor: pointer;
	}
	.recommend_4 a img{
		width:236px;
		height:135px; 
		position:absolute;
		left:0px;
		top:0px;
		transition: all 0.6s; 
		}
	.recommend_4 a img:hover{
		 transform: scale(1.1);
		 }
	.name_4{
		position:relative;
		top:150px;
		left:3.47%;
	}
	.word_4 a{
		position:relative;
		top:165px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.words_4 a{
		position:relative;
		top:171px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.recommend_5{
		width:236px;
		height:280px;
		position:absolute;
		left:79.32%;/*1070px;*/
		top:70px;
		background:#FFF; 
		overflow: hidden;  
		}
	.recommend_5:hover{   
		box-shadow: 2px 4px 6px #666;
		cursor: pointer;
	}
	.recommend_5 a img{
		width:236px;
		height:135px; 
		position:absolute;
		left:0px;
		top:0px;
		transition: all 0.6s; 
		}
	.recommend_5 a img:hover{
		 transform: scale(1.1);
		 }
	.name_5{
		position:relative;
		top:150px;
		left:3.47%;
	}
	.word_5 a{
		position:relative;
		top:165px;
		left:3.47%;
		color:#666;
		font-size:15px;
		}
	.words_5 a{
		position:relative;
		top:171px;
		left:3.47%;
		color:#666;
		font-size:15px;
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
		left:43.8%;/*590px;*/
		background-color:#666666;
		}
	.top{
		position:absolute;
		left:36.32%;/*490px;*/
		top:10px;
		}
	.top a{
		color:#FFF;
		font-size:16px;
		}
	.middle{
		position:absolute;
		top:40px;
		left:39.29%;/*530px;*/
		color:#FFF;
		font-size:14px;
		}
	.foot{
		position:absolute;
		top:70px;
		left:30.39%;/*410px;*/
		color:white;
		font-size:14px;
	}
	
</style>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"55432",secure:"55437"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/Community Maven Webapp/src/main/webapp/WEB-INF/jsp/homepage.jsp">
<div class="NEU" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/Community Maven Webapp/src/main/webapp/WEB-INF/jsp/homepage.jsp">
	<img src="img/58ee3d6d55fbb2fbfc64180b4d4a20a44623dc58.png" width="120" height="113">
</div>
<div class="logo">
	<img src="img/150017160818052.png">
</div>
<!--搜索栏-->
<div id="search_box">
    <form id="search_form" method="post" action="SearchServlet">
        <input type="text" name="searchtext" id="s" value="搜索从这里开始…" class="swap_value" />
        <input type="image" src="img/btn_search_box.gif" width="27" height="24" id="go" alt="Search" 				         title="Search" />
    </form>
</div>
<div class="dz">
<!--登录、注册-->
<a class="enter" href="${loginURL }">${login}<a><span class="huo">&nbsp;|&nbsp;</span><a class="enroll" href="${registerURL }">${register}</a>
</div>
<!--标题栏四个选项，对应其他界面-->
<div class="title_1"><a href="#">社团</a></div>
<div class="title_2"><a href="#">活动</a></div>
<div class="title_3"><a href="#">校内</a></div>
<div class="title_4"><a href="#">兼职</a></div>
<!--左侧七个栏目，对应其他界面-->
<div class="list">
	<ul class="lists">
    	<li class="list_1"><a href="#">体育活动</a></li>
       	<li>&nbsp;</li>
        <li class="list_2"><a href="#">科技竞赛</a></li>
        <li>&nbsp;</li>
        <li class="list_3"><a href="#">学长辅学</a></li>
        <li>&nbsp;</li>
        <li class="list_4"><a href="#">体育活动</a></li>
        <li>&nbsp;</li>
        <li class="list_5"><a href="#">英语竞赛</a></li>
        <li>&nbsp;</li>
        <li class="list_6"><a href="#">社团招新</a></li>
        <li>&nbsp;</li>
        <li class="list_7"><a href="#">兼职工作</a></li>
        <li>&nbsp;</li>
        <li class="list_8"><a href="#">社团联合</a></li>
    </ul>
</div>
	<!--轮播器，每个图片加其他链接页面-->
    <div id="container">
    	<div id="example">
        	<div id="slides">
            <div class="slides_container">
            <div class="slider_1"><a href="#">
            <img src="img/lunbo (3).jpg" width="100%" height="500">
            </a></div>
 			<div class="slider_2"><a href="#">
            <img src="img/lunbo (2).jpg" width="100%" height="500">
            </a></div>
		    <div class="slider_3"><a href="#">
            <img src="img/lunbo (3).jpg" width="100%" height="500">
            </a></div>
            <div class="slider_4"><a href="#">
            <img src="img/lunbo (4).jpg" width="100%" height="500">
            </a></div>
			<div class="slider_5"><a href="#">
            <img src="img/lunbo (5).jpg" width="100%" height="500">
            </a></div>
			<div class="slider_6"><a href="#">
            <img src="img/lunbo (6).jpg" width="100%" height="500">
            </a></div>
			<div class="slider_7"><a href="#">
            <img src="img/lunbo (7).jpg" width="100%" height="500">
            </a></div>
            </div>
            <a href="#" class="prev">
                <img src="img/arrow-prev.png" width="24" height="43" alt="Arrow Prev"></a>
			<a href="#" class="next">
                <img src="img/arrow-next.png" width="24" height="43" alt="Arrow Next"></a>
         <!--   <ul class="pagination">
               	<li class=""><a href="#0">1</a></li>
                <li class="current"><a href="#1">2</a></li>
                <li class=""><a href="#2">3</a></li
                ><li class=""><a href="#3">4</a></li>
                <li class=""><a href="#4">5</a></li>
                <li class=""><a href="#5">6</a></li>
                <li class=""><a href="#6">7</a></li>
            </ul>-->
		</div>
	</div>
    <div class="person">
    <br/>
    	<div align="center">
        <font style="font-family:'幼圆'" size="+3" color="#000000">社团之家</font>
        <!--右侧栏目登录，名字不同但链接同上一个登录页面-->
        <p style="font-size:15px">${welcome }</p></div>
    	<div class="person_photo"><img src="${userPicture }" width="83" height="83"></div>
        <a class="registers" href="${buttonURL }">
        <div class="register" style="color:#FFF" align="center">${buttonValue }</div></a>
        <div class="from" align="center" style="font-size:14px">百亿项目组出品</div>
    </div>
    <div class="organization">
    	<!--全部社团页面-->
    	<div class="sum"><a href="#"><font color="green" style="font-family:'Microsoft YaHei UI'">
        全部137个社团</font></a></div>
        <!--五个热门社团主页链接-->
        <div class="hot_1">
        <a href="#"><img src="img/0E1CA0462AD847E2F1ECE099FB9F658D.png"></a></div>
        <div class="hot_2">
        <a href="#"><img src="img/5CC1B174CC3720F04AD96049ABCAC33D.png"></a></div>
        <div class="hot_3">
        <a href="#"><img src="img/AEE98EB739A46AB06C02307E236069C7.png"></a></div>
        <div class="hot_4"><a href="#"><img src="img/E0B01352DE274FFEB5D1D8AC87865E8D.png"></a></div>
        <div class="hot_5"><a href="#">
        <img src="img/4660A53B645D7E5D09860BE200E2BC02.png"></a></div>
    </div>
    <div class="recommend">
    	<font size="+3" face="隶书">推荐社团</font>
        <!--五个推荐社团主页链接-->
        <div class="recommend_1">
        	<a href="#?id=${ recommend_1.id}"><img src="${ recommend_1.picture}"></a>
            <div class="name_1"><a href="#">${ recommend_1.name}</a></div>
            <div class="word_1"><a href="#">社团简介：</a></div>
            <div class="words_1"><a href="#">${ recommend_1.introduce}
            </a></div>
        </div>
        <div class="recommend_2">
       		<a href="#?id=${ recommend_2.id}"><img src="${ recommend_2.picture}"></a>
            <div class="name_2"><a href="#">${ recommend_2.name}</a></div>
            <div class="word_2"><a href="#">社团简介：</a></div>
            <div class="words_2"><a href="#">${ recommend_2.introduce}
            </a></div>
        </div>
        <div class="recommend_3">
        	<a href="#?id=${ recommend_3.id}"><img src="${ recommend_3.picture}"></a>
            <div class="name_2"><a href="#">${ recommend_3.name}</a></div>
            <div class="word_2"><a href="#">社团简介：</a></div>
            <div class="words_2"><a href="#">${ recommend_3.introduce}
            </a></div>
        </div>
        <div class="recommend_4">
        	<a href="#?id=${ recommend_4.id}"><img src="${ recommend_4.picture}"></a>
            <div class="name_2"><a href="#">${ recommend_4.name}</a></div>
            <div class="word_2"><a href="#">社团简介：</a></div>
            <div class="words_2"><a href="#">${ recommend_4.introduce}
            </a></div>
        </div>
        <div class="recommend_5">
        	<a href="#?id=${ recommend_5.id}"><img src="${ recommend_5.picture}"></a>
            <div class="name_2"><a href="#">${ recommend_5.name}</a></div>
            <div class="word_2"><a href="#">社团简介：</a></div>
            <div class="words_2"><a href="#">${ recommend_5.introduce}
            </a></div>
        </div>
    </div>
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
         <div class="middle">
           主办：东北大学软件学院&nbsp;&nbsp;&nbsp;&nbsp;
           承办：百亿项目组
         </div>
         <div class="foot">  
           邮箱：394691285@qq.com　辽ICP备064068804　辽公网安备 71898202708132号
      	</div>
       	<img src="img/codeispoetry.png">
    </div>
</body>
</html>
