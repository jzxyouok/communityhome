<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>注册社团</title>
    <script>
        function checkEmail() {
            var email = document.getElementById('email').value;
            if (!(/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/.test(email))) {
                return false;
            }
            return true;
        }
        function checkvalue1(obj) {
            var oTip = document.getElementById("tip1");
            if (obj.value == "") {
                oTip.innerHTML = "请填写用户名";
            }
            else {
                oTip.innerHTML = "";
            }
        }
        function checkvalue2(obj) {
            var oTip = document.getElementById("tip2");
            if (obj.value == "") {
                oTip.innerHTML = "请填写社团简介";
            }
            else {
                oTip.innerHTML = "";
            }
        }
        function checkvalue3(obj) {
            var oTip = document.getElementById("tip3");
            if (obj.value == "") {
                oTip.innerHTML = "请填写社团类型";
            }
            else {
                oTip.innerHTML = "";
            }
        }
        function checkvalue4(obj) {
            var oTip = document.getElementById("tip4");
            if (obj.value == "") {
                oTip.innerHTML = "请填写大学";
            }
            else {
                oTip.innerHTML = "";
            }
        }
        function checkvalue5(obj) {
            var oTip = document.getElementById("tip5");
            if (obj.value == "") {
                oTip.innerHTML = "请填写邮箱";
            }
            else if (!checkPhone()) {
                oTip.innerHTML="请填写正确的邮箱格式"
            }
            else {
                oTip.innerHTML = "";
            }
        }

        function docheck() {
            if (reg.UserName.value == "") {
                alert("请填写社团名称");
                return false;
            }
            else if (reg.University.value == "") {
                alert("请填写大学");
                return false;
            }
            else if (reg.Email.value == "") {
                alert("请填写邮箱");
                return false;
            }
            else if (!checkEmail()) {
                alert("请填写正确的邮箱格式");
                return false;
            }
            else if(reg.Introduce.value==""){
                alert("请填写社团简介");
                return false;
            }
            else if(reg.Type.value==""){
                alert("请填写社团类型");
                return false;
            }
            else {
                return true;
            }
        }
        function previewImage(file,imgNum)
        {
            var MAXWIDTH  = 100;
            var MAXHEIGHT = 100;
            var div = document.getElementById('preview'+imgNum);
            if (file.files && file.files[0])
            {
                div.innerHTML ='<img id=imghead'+imgNum+'>';
                var img = document.getElementById('imghead'+imgNum+'');
                img.onload = function(){
                    var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
                    img.width  =  rect.width;
                    img.height =  rect.height+44;
//         img.style.marginLeft = rect.left+'px';
                    img.style.marginTop = rect.top+'px';
                }
                var reader = new FileReader();
                reader.onload = function(evt){img.src = evt.target.result;}
                reader.readAsDataURL(file.files[0]);
            }
            else //
            {
                var sFilter='filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
                file.select();
                var src = document.selection.createRange().text;
                div.innerHTML = '<img id=imghead'+imgNum+'>';
                var img = document.getElementById('imghead2');
                img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
                var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
                status =('rect:'+rect.top+','+rect.left+','+rect.width+','+rect.height);
                div.innerHTML = "<div id=divhead"+imgNum+" style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;"+sFilter+src+"\"'></div>";
            }
        }
        function clacImgZoomParam( maxWidth, maxHeight, width, height ){
            var param = {top:0, left:0, width:width, height:height};
            if( width>maxWidth || height>maxHeight )
            {
                rateWidth = width / maxWidth;
                rateHeight = height / maxHeight;

                if( rateWidth > rateHeight )
                {
                    param.width =  maxWidth;
                    param.height = Math.round(height / rateWidth);
                }else
                {
                    param.width = Math.round(width / rateHeight);
                    param.height = maxHeight;
                }
            }
            param.left = Math.round((maxWidth - param.width) / 2);
            param.top = Math.round((maxHeight - param.height) / 2);
            return param;
        }
    </script>
    <style>
        * {
            margin: 0%;
            padding: 0%;
        }

        html, body {
            min-height: 1000px;
            height: 100%;
        }
        body {
            background-image:url(img/48-120P5144933-50.jpg);
        }
        #remote {
            background-color: white;
            border: outset;
            width: 35%;
            height: 88%;
            overflow: hidden;
            display: block;
            margin-top: 5%;
            margin-left: auto;
            margin-right: auto;

        }
        .main {
            margin-top: 10%;
        }
        form input[type="text"],form input[type="password"]{
            padding: 5px;
            outline: none;
            width: 50%;
            margin-bottom: 2%;
            height: 40px;
            border: 1px solid black;
            border-radius: 6px;
            font-size: 20px;
        }
        form input[type="text"]:focus,form input[type="password"]:focus
        {
            outline: 1px solid blue;
            -moz-outline-radius: 6px;
        }
        form input[type="radio"]{
            margin-bottom: 2%;
        }
        .Tip{
            font-style: italic;
            color: #366aff;
        }
        form input[type="submit"] {
            width: 54%;
            height: 50px;
            margin-top: 7px;
            color: #fff;
            font-size: 18px;
            font-weight: bold;
            border: 1px solid rgba(0, 0, 0, .49);
            background-color: #3cda8a;
            border-radius: 6px;

        }
        input[type="submit"]:hover {
            background-color: #44e9a0;
            margin-top: 10px;
            cursor: pointer;/*光标变为一只手*/
        }
        #imghead5{
            position:relative;
            top:5px;
        }
    </style>
</head>
<body>
<div id="remote">
    <div class="main">
        <h1 align="center">社团注册</h1><br>
        <div align="center">
            <form name="reg" action="UploadPicture" method="post" target="_parent" onSubmit="return docheck()">
                <input type="text" name="UserName" placeholder=" 社团名称" onclick="checkvalue1(this)" onkeyup="checkvalue1(this)"><div id="tip1" class="Tip"></div><br>
                <input type="text" name="University" placeholder=" 大学" onclick="checkvalue4(this)" onkeyup="checkvalue4(this)"><div id="tip4" class="Tip"></div><br>
                <input type="text" name="Email" id="email" placeholder=" 邮箱" onclick="checkvalue5(this)" onkeyup="checkvalue5(this)"><div id="tip5" class="Tip"></div><br>
                <input type="text" name="Introduce" placeholder=" 社团简介" onclick="checkvalue2(this)" onkeyup="checkvalue2(this)"><div id="tip2" class="Tip"></div><br>
                <input type="text" name="Type" placeholder=" 社团类型" onclick="checkvalue3(this)" onkeyup="checkvalue3(this)"><div id="tip3" class="Tip"></div><br>
                <div class="picture">
                    <input style="margin-top:5px;" id="img" name="img"
                           onchange="previewImage(this,5)" type="file"/>
                    <div id="preview5" style="margin-left:150px; clear:both; padding-top:-15px;">
                        <img src="" alt="" id="imghead5" width="83" height="83" />
                    </div>
                </div>
                <br/>
                <p>
                    <input type="submit" name="sub" value="提交审核">
                </p>
            </form>
            <br/><br/>
            <p>百亿项目组出品</p>
        </div>
    </div>
</div>
</body>
</html>