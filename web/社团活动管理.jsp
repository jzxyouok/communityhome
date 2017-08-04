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
		width:65%;
		height:600px;
		position:absolute;
		left:16%;
		top:150px;
		border-top:inset;
		border-right:outset;
		border-left:groove;
		border-bottom:outset;
		overflow:hidden;
	}
	.list_top{
		font-size:20px;
		width:100%;
		line-height:38px;
		background-image:url(img/48-120P5144933-50.jpg);
	}
	.acname{
		position:relative;
		left:12%;
		line-height:40px;
	}
	.acdate{
		position:relative;
		line-height:40px;
		left:27%;
		}
	.acaddress{
		position:relative;
		line-height:40px;
		left:42%;
		}
	.acorganization{
		position:relative;
		line-height:40px;
		left:57%;
		}
	.activity:hover{
		cursor:pointer;
		box-shadow: 7px 3px 10px 0px;
	}
		
	.button button{
		position:relative;
		cursor:pointer;
		background-color:#0C0;
		width:90px;
		height:30px;
		border-radius:5px;
		left:38%;
		top:80px;
	}
	.button button:hover{
		background-color:#6C0;
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
    	<div class="list_top">
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	<font class="name">活动名称</font>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
            <font class="date">活动日期</font>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
            <font class="address">活动地点</font>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
            <font class="organization">承办社团</font>
        <hr /><hr />
        </div>
        <div class="list_middle">
        	<div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="activity">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
        </div>
        <div class="button">
        	<button style="font-size:16px">添加</button>
            <button style="font-size:16px">删除</button>
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
