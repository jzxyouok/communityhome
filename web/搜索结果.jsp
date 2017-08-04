<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>搜索结果</title>
<script type="text/javascript" src="js/jquery.min.js.下载"></script>
<script type="text/javascript" src="js/jquery.pagination.js.下载"></script>
<script>
	$(document).ready(function() {
	$("#Pagination").pagination("15");
});
</script>
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
		top:0.50em;
		}
	.logo{
		position:absolute;
		left:8.125em;/*130px*/
		top:1.5em;/*12px*/
		}
	.list{
		width:65%;
		height:590px;
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
	.result:hover{
		cursor:pointer;
		box-shadow: 7px 3px 10px 0px;
	}
	i,
	em,
	cite {
    	font-style: normal
	}

	body {
   		 background: #fff;
    	line-height: 1.2
	}

	a,
	a:link {
    	text-decoration: none
	}

	a:active,
	a:hover {
    	text-decoration: none
	}

	a:focus {
  	  outline: none
	}

	.fixed:after {
   	 	content: ".";
   	 	display: block;
    	clear: both;
    	height: 0;
    	visibility: hidden
}

	.pages {
		width:720px;
		margin:200px auto 800px 26%;
}
	.pages #Pagination {
  		float: left;
  		overflow: hidden;
}
	.pages #Pagination .pagination {
  		height: 40px;
  		text-align: right;
  		font-family: \u5b8b\u4f53,Arial;
}
	.pages #Pagination .pagination a,
	.pages #Pagination .pagination span {
 	 float: left;
  	display: inline;
  	padding: 11px 13px;
  	border: 1px solid #e6e6e6;
 	 border-right: none;
 	 background: #f6f6f6;
  	color: #666666;
  	font-family: \u5b8b\u4f53,Arial;
  	font-size: 14px;
  	cursor: pointer;
	}
	.pages #Pagination .pagination .current {
  		background: #ffac59;
  		color: #fff;
}
	.pages #Pagination .pagination .prev,
	.pages #Pagination .pagination .next {
 	 float: left;
  	padding: 11px 13px;
  	border: 1px solid #e6e6e6;
  	background: #f6f6f6;
  	color: #666666;
  	cursor: pointer;
}
	.pages #Pagination .pagination .prev i,
	.pages #Pagination .pagination .next i {
	  display: inline-block;
 	 width: 4px;
 	 height: 11px;
 	 margin-right: 5px;
 	 /*background: url(../images/icon.fw.png) no-repeat;*/
	}
	.pages #Pagination .pagination .prev {
 	 border-right: none;
	}
	.pages #Pagination .pagination .prev i {
  	background-position: -144px -1px;
  	background-position: -144px -4px;
}
.pages #Pagination .pagination .next i {
  background-position: -156px -1px;
  *background-position: -156px -4px;
}
.pages #Pagination .pagination .pagination-break {
  padding: 11px 5px;
  border: none;
  border-left: 1px solid #e6e6e6;
  background: none;
  cursor: default;
}
.pages .searchPage {
  float: left;
  padding: 8px 0;
}
.pages .searchPage .page-sum {
  padding: 11px 13px;
  color: #999999;
  font-family: \u5b8b\u4f53,Arial;
  font-size: 14px;
}
.pages .searchPage .page-go {
  padding: 8px 0;
  color: #999999;
  font-family: \u5b8b\u4f53,Arial;
  font-size: 14px;
  padding: 10px 0\9;
  *padding: 6px 0;
}
.pages .searchPage .page-go input {
  width: 21px;
  height: 20px;
  margin: 0 5px;
  padding-left: 5px;
  border: 1px solid #e4e4e4;
}
.pages .searchPage .page-btn {
  margin: 9px 0 5px 5px;
  padding: 2px 5px;
  background: #ffac59;
  border-radius: 2px;
  color: #ffffff;
  font-family: Arial, 'Microsoft YaHei';
  font-size: 14px;
  text-decoration: none;
}	
	.footer{
		width:100%;
		height:130px;
		background:#5C5C5C;
		position:absolute;
		top:960px;
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
        	<font>根据搜索内容填入适当的表头</font>
        <hr /><hr />
        </div>
        <div class="list_middle">
        	<div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
            <div class="result">
            	<font class="acname">纸张搭桥</font>
                <font class="acdate">星期六</font>
                <font class="acaddress">信息B222</font>
                <font class="acorganization">CSDN</font>
                <hr />
            </div>
        </div>

    </div>
    <div class="pages">
        <div id="Pagination">
        <div class="pagination">
        <a class="current prev"><i></i>上一页</a>
        <a class="current">1</a>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <span class="pagination-break">...</span>
        <a href="#" class="ep">15</a>
        <a href="#" class="next">下一页 <i></i></a>
        </div>
        </div>
        <div class="searchPage">
          <span class="page-sum">共<strong class="allPage">15</strong>页</span>
          <span class="page-go">跳转<input type="text">页</span>
          <a href="javascript:;" class="page-btn">GO</a>
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
