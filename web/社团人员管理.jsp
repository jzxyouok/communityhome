<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>社团人员管理</title>
<style>
	*{
		margin:0px;
		padding:0px;	
	}
	a{
		text-decoration:none;
		color:#000;
		font-family:"Microsoft YaHei UI";
		font-size:16px;/*18px*/
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
	.NEU{
		position:absolute;
		left:1.25em;/*20px*/
		}
	.logo{
		position:absolute;
		left:8.125em;/*130px*/
		top:1.5em;/*12px*/
		}
	.list{
		width:24%;
		height:600px;
		position:absolute;
		top:130px;
		left:1.55em;
		border-right:outset;
		border-right-color:#CCC;
		border-left:groove;
		border-bottom:outset;
	}
	.person img{
		position:relative;
		width:50px;
		height:50px;
		left:9%;
	}
	.name{
		position:relative;
		left:20%;
		top:-14px
	}
	.organization{
		position:relative;
		left:34%;
		top:-14px;
	}	
	.name:hover{
		color:#0C0;
	}
	.organization:hover{
		color:#0C0;
	}
	.person img:hover{
		cursor:pointer;
	}
	.person:hover{
		cursor:pointer;
		box-shadow: 5px 3px 15px 1px;
	}
	
	.button button{
		position:relative;
		cursor:pointer;
		background-color:#0C0;
		width:90px;
		height:30px;
		border-radius:5px;
		left:20%;
		top:50px;
	}
	.button button:hover{
		background-color:#6C0;
	}
	.information{
		width:65%;
		height:600px;
		position:absolute;
		left:30%;
		top:130px;
		border-top:inset;
		border-right:outset;
		border-left:groove;
		border-bottom:outset;
		overflow:hidden;
	}
	#information_1,#information_2,#information_3,
	#information_4,#information_5,#information_6
	#information_7,#information_8{
		width:100%;
		height:100%;
	}
	.footer{
		width:100%;
		height:130px;
		background:#5C5C5C;
		position:absolute;
		top:900px;
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
</head>

<body>
	<div class="NEU">
		<img src="img/58ee3d6d55fbb2fbfc64180b4d4a20a44623dc58.png" width="120" height="113">
	</div>
	<div class="logo">
		<img src="img/150017160818052.png">
	</div>
    <div class="list">
    	<hr />
        <div class="list_top" style="line-height:40px">
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	<font size="4px">头像</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	<font size="4px">用户名</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <font size="4px">社团名</font>
  			<hr />
            <hr />
        </div>
        <div class="list_middle">
        	<a class="mao" href="#information_1"><div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">富润峰</font>
                <font class="organization" style="top:-14px">CSDN</font>
            </div></a>
            <hr />
            <a class="mao" href="#information_2"><div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">黄宇航</font>
                <font class="organization" >CSDN</font>
            </div></a>
            <hr />
            <a class="mao" href="#information_3"><div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">许瑞文</font>
                <font class="organization" >CSDN</font>
            </div></a>
            <hr />
           <a class="mao" href="#information_4"> <div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">罗世杰</font>
                <font class="organization" >CSDN</font>
            </div></a>
            <hr />
            <a class="mao" href="#information_5"><div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">吴洪发</font>
                <font class="organization" >CSDN</font>
            </div></a>
            <hr />
            <a class="mao" href="#information_6"><div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">苗华林</font>
                <font class="organization" >CSDN</font>
            </div></a>
            <hr />
             <a class="mao" href="#information_7"><div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">赵宇轩</font>
                <font class="organization" >CSDN</font>
            </div></a>
            <hr />
             <a class="mao" href="#information_8"><div class="person">
            	<img src="img/49E89BEA3F1B3F1AC788F5F94C4A457F.png" />
                <font class="name">李雨泽	</font>
                <font class="organization" >CSDN</font>
            </div></a>
            <hr />
        </div>
        <div class="button">
        	<button style="font-size:16px">添加</button>
            <button style="font-size:16px">删除</button>
        </div>
    </div>
    <div class="information">
    	<div id="information_1" style="height:100%"><a name="information_1">1</div>
        <div id="information_2" style="height:100%"><a name="information_2">2</div>
        <div id="information_3" style="height:100%"><a name="information_3">3</div>
        <div id="information_4" style="height:100%"><a name="information_4">4</div>
        <div id="information_5" style="height:100%"><a name="information_5">5</div>
        <div id="information_6" style="height:100%"><a name="information_6">6</div>
        <div id="information_7" style="height:100%"><a name="information_7">7</div>
        <div id="information_8" style="height:100%"><a name="information_8">8</div>
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
