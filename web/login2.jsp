<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2017/7/23
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <title>无标题文档</title>
    <link rel="stylesheet" href="css/login2.css">
</head>
<body>
<script>

    function IsDigit(cCheck) {
        return (('0' <= cCheck) && (cCheck <= '9'));
    }

    function IsAlpha(cCheck) {
        return ((('a' <= cCheck) && (cCheck <= 'z')) || (('A' <= cCheck) && (cCheck <= 'Z')));
    }

    function IsValid() {
        var struserName = reg.UserName.value;
        for (nIndex = 0; nIndex < struserName.length; nIndex++) {
            cCheck = struserName.charAt(nIndex);
            if (!(IsDigit(cCheck) || IsAlpha(cCheck))) {
                return false;
            }
        }
        return true;
    }
    function IsPValid() {
        var password = document.getElementById('password').value;
        if (!(/^[a-zA-Z]\w{5,17}$/.test(password))) {
            return false;
        }
        return true;
    }
    function checkvalue1(obj) {
        var oTip = document.getElementById("tip1");
        if (!IsValid()) {
            oTip.innerHTML = "用户名只能使用字母和数字"
        }
        else {
            oTip.innerHTML = "";
        }
    }
    function checkvalue2(obj) {
        var oTip = document.getElementById("tip2");
        if (!IsPValid()) {
            oTip.innerHTML = "请填入以字母开头的6-18位密码"
        }
        else {
            oTip.innerHTML = "";
        }
    }
    function updateImg(){
        $("#CreateCheckCode").attr("src", $("#CreateCheckCode").attr("src") + "1");
        
    }
    function show() {
//        显示验证码
        document.getElementById("CreateCheckCode").src = "servlet/CodeServlet?refresh"+Math.random();
        return false;
    }
    //此处使用ajax进行验证
    function docheck() {
    
     if (reg.checkCode.value == "") {
         alert("请输入验证码");
         return false;
     }
     else  {
     	//用ajax验证的好处是，如果用户账号和密码都输入正确，
     	//而验证码不正确时，就不需要在重新输入了
     	//而用form验证用户输入的就会被刷新掉
     	//可以避免用户反复输入密码和账户
         var xmlhttp=new XMLHttpRequest();
         xmlhttp.onreadystatechange=function()
         {
             if (xmlhttp.readyState==4 && xmlhttp.status==200)
             {

                 if(xmlhttp.responseText=="codeFail"){
                     alert("验证码不正确,请重新输入");
                 }else if(xmlhttp.responseText=="passwordFail"){
                     alert("账号不正确,请重新输入");
                 }else if(xmlhttp.responseText=="fail"){
                     alert("你的验证信息有误");
                 }else if(xmlhttp.responseText=="pass"){
                     //成功
                     window.open("index", "_parent")

                 }else{
                     alert("服务器出现未知故障");
                 }
             }else{

             }
         }
         var code= document.forms["reg"]["checkCode"].value;
         var name= document.forms["reg"]["UserName"].value;
         var password = document.forms["reg"]["UserPassword"].value
         xmlhttp.open("POST","LoginServlet",true);
         xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
         xmlhttp.send("code="+code+"&name="+name+"&password="+password);
        }
		
   }
</script>
<!--<img style="position:absolute;left:0px;top:0px;width:100%; height: 100%; z-Index:-1;" src="image/u=1813756995,3204776939&fm=214&gp=0.jpg" />-->
<div class="main">
    <h1 align="center">用户登录</h1><br>
    <div align="center">
        <form name="reg" action="javascript:docheck()" >
            <input type="text" name="UserName" placeholder=" 用户名" onclick="checkvalue1(this)"
                   onkeyup="checkvalue1(this)" autocomplete="off">
            <div id="tip1" class="Tip"></div>
            <br>
            <input type="password" name="UserPassword" id="password" placeholder=" 密码" onclick="checkvalue2(this)"
                   onkeyup="checkvalue2(this)" autocomplete="off"><div id="tip2" class="Tip"></div>
            <br>
            <input name="checkCode" placeholder="验证码" type="text" id="checkCode" title="验证码不区分大小写" size="4"
                   maxlength="4" autocomplete="off"/>
            <p>
            <img src="servlet/CodeServlet" onclick="show()" id="CreateCheckCode"  style="width: 15%;"/>
            </p>
            <a href="" onclick="return show();">换一个</a>
            <p>
                <input type="submit" name="sub" value="登录">
            </p>
     
        </form>
    </div>
</div>
</body>
</html>

