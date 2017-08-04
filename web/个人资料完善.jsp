<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>个人资料</title>
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
        oTip.innerHTML = "请填写真实姓名";
    }
    else {
        oTip.innerHTML = "";
    }
}
function checkvalue2(obj) {
    var oTip = document.getElementById("tip2");
    if (obj.value == "") {
        oTip.innerHTML = "请填写学号";
    }
    else {
        oTip.innerHTML = "";
    }
}
function checkvalue3(obj) {
    var oTip = document.getElementById("tip3");
    if (obj.value == "") {
        oTip.innerHTML = "请填写兴趣爱好";
    }
    else {
        oTip.innerHTML = "";
    }
}
function checkvalue4(obj) {
    var oTip = document.getElementById("tip4");
    if (obj.value == "") {
        oTip.innerHTML = "请填写专业";
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
        alert("请填写真实姓名");
        return false;
    }
    else if (reg.University.value == "") {
        alert("请填写专业");
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
		alert("请填写学号");
		return false;
	}
	else if(reg.Type.value==""){
		alert("请填写兴趣爱好");
		return false;
	}
    else {
        return true;
    }
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
    height: 75%;
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
	</style>
</head>
<body>
<div id="remote">
<div class="main">
    <h1 align="center">个人资料</h1><br>
    <div align="center">
        <form name="reg" action="#" method="post" target="_parent" onSubmit="return docheck()">
            <input type="text" name="UserName" placeholder=" 真实姓名" onclick="checkvalue1(this)" onkeyup="checkvalue1(this)"><div id="tip1" class="Tip"></div><br>
            <input type="text" name="University" placeholder=" 专业" onclick="checkvalue4(this)" onkeyup="checkvalue4(this)"><div id="tip4" class="Tip"></div><br>
            <input type="text" name="Introduce" placeholder=" 学号" onclick="checkvalue2(this)" onkeyup="checkvalue2(this)"><div id="tip2" class="Tip"></div><br>
            <input type="text" name="Email" id="email" placeholder=" 邮箱" onclick="checkvalue5(this)" onkeyup="checkvalue5(this)"><div id="tip5" class="Tip"></div><br>
            <input type="text" name="Type" placeholder=" 兴趣爱好" onclick="checkvalue3(this)" onkeyup="checkvalue3(this)"><div id="tip3" class="Tip"></div><br>
            
            <p>
                <input type="submit" name="sub" value="点击保存">
            </p>
        </form>
          <br/><br/>
        <p>百亿项目组出品</p>
    </div>
</div>
</div>
</body>
</html>