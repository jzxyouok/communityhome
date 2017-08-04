<%@ page import="action.Email" %><%--
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
    <link rel="stylesheet" href="css/register2.css">
    <%
        String emailcode = Email.randomCode();
    %>
</head>
<body>

<script src="js/jquery-3.2.1.min.js"></script>
<script>
    var wait = 60;
    function time(o) {
        if (wait == 0) {
            o.removeAttribute("disabled");
            o.value = "获取验证码";
            wait = 60;
        } else {
            o.setAttribute("disabled", true);
            o.value = "重新发送(" + wait + ")";
            wait--;
            setTimeout(function () {
                    time(o)
                },
                1000)
        }
    }
    function send() {
            $.ajax({
                type: "post",
                url: "servlet/SendEmail",
                data: {
                    email: $("#email").val()
                },
                dataType: "json",
                success: function () {
                },
                error: function () {

                }
            });
    }
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
    function IsUValid() {
        var username = document.getElementById('username').value;
        if (!(username.length<=10&&username.length>=4)) {
            return false;
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

    function chkEmail(str) {
        return str.search(/[\w\-]{1,}@[\w\-]{1,}\.[\w\-]{1,}/) == 0 ? true : false;
    }
    function checkvalue1(obj) {
        var oTip = document.getElementById("tip1");
        if (!(IsValid()&&IsUValid())) {
            oTip.innerHTML = "用户名请使用4-10位字母和数字"
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
    function checkvalue3(obj) {
        var oTip = document.getElementById("tip3");
        if (obj.value != reg.UserPassword.value) {
            oTip.innerHTML = "两次密码不一致";
        }
        else {
            oTip.innerHTML = "";
        }
    }
    function checkvalue4(obj) {
        var oTip = document.getElementById("tip4");
        if (!chkEmail(obj.value)) {
            oTip.innerHTML = "请填写有效的邮箱地址"
        }
        else {
            oTip.innerHTML = "";
        }
    }
    //验证注册规范
    function docheck() {
        if (reg.UserName.value == "") {
            alert("请填写用户名");
            return false;
        }
        else if (!(IsValid()&&IsUValid())) {
            alert("用户名请使用4-10位字母和数字");
            return false;
        }
        else if (reg.UserPassword.value == "") {
            alert("请填写密码");
            return false;
        }
        else if (!IsPValid()) {
            alert("请填入以字母开头的6-18位密码");
            return false;
        }
        else if (reg.UserPassword.value != reg.CUserPassword.value) {
            alert("两次密码不一致");
            return false;
        }
        else if (reg.University.value == "") {
            alert("请填写大学");
            return false;
        }
        else if (reg.Email.value == "") {
            alert("请填写邮箱地址");
            return false;
        }
        else if (!chkEmail(reg.Email.value)) {
            alert("请填写有效的邮箱地址");
            return false;
        }
        if (reg.checkCode.value == "") {
            alert("请输入验证码");
            return false;
        } else {
            var xmlhttp = new XMLHttpRequest();

            xmlhttp.onreadystatechange=function()
            {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
                {
                    if (xmlhttp.responseText == "code error"){
                        alert("验证码不正确,请重新输入");
                    }else if (xmlhttp.responseText == "user exist"){
                        alert("用户名已存在");
                    }else if (xmlhttp.responseText == "email exist"){
                        alert("该邮箱已被注册");
                    }else if (xmlhttp.responseText == "done"){
                        window.open("index", "_parent")
                    }else{
                        alert("服务器出现未知故障");
                    }
                }
            }

            var username= document.forms["reg"]["UserName"].value;
            var password = document.forms["reg"]["UserPassword"].value;
            var email = document.forms["reg"]["Email"].value;
            var university = document.forms["reg"]["University"].value;
            var code = document.forms["reg"]["checkCode"].value;
            var emailcode = <%=emailcode%>;

            xmlhttp.open("POST","RegisterServlet",true);
            xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
            xmlhttp.send("username=" + username + "&password=" + password + "&email=" + email
            + "&university=" + university + "&code=" + code + "&emailcode=" + emailcode);
        }
    }
</script>
<div class="main">
    <h1 align="center">用户注册</h1><br>
    <div align="center">
        <form name="reg" action="javascript:docheck()">
            <input type="text" name="UserName"id="username" placeholder=" 用户名(昵称)" onkeydown="checkvalue1(this)" onkeyup="checkvalue1(this)"
                   autocomplete="off">
            <div id="tip1" class="Tip"></div>
            <br>
            <input type="password" name="UserPassword" id="password" placeholder=" 密码" onkeydown="checkvalue2(this)"
                   onkeyup="checkvalue2(this)" autocomplete="off">
            <div id="tip2" class="Tip"></div>
            <br>
            <input type="password" name="CUserPassword" placeholder=" 确认密码" onkeydown="checkvalue3(this)"
                   onkeyup="checkvalue3(this)" autocomplete="off">
            <div id="tip3" class="Tip"></div>
            <br>
            <input type="text" name="University" placeholder=" 大学" autocomplete="off">
            <div class="Tip"></div>
            <br>
            <input type="text" name="Email" id="email" placeholder="邮箱" onkeydown="checkvalue4(this)"
                   onkeyup="checkvalue4(this)" autocomplete="off">
            <div id="tip4" class="Tip"></div>
            <br>
            <input name="checkCode" placeholder="邮箱验证码" type="text" id="checkCode" title="验证码不区分大小写" size="4"
                   maxlength="4" autocomplete="off"/><br>

            <p>
                <input type="button" id="btn" onclick="if (reg.UserName.value == '') {
                alert('请填写用户名');
                return false;
                }
                else if (!(IsValid()&&IsUValid())) {
                alert('用户名请使用4-10位字母和数字');
                return false;
                }
                else if (reg.UserPassword.value == '') {
                alert('请填写密码');
                return false;
                }
                else if (!IsPValid()) {
                alert('请填入以字母开头的6-18位密码');
                return false;
                }
                else if (reg.UserPassword.value != reg.CUserPassword.value) {
                alert('两次密码不一致');
                return false;
                }
                else if (reg.University.value == '') {
                alert('请填写大学');
                return false;
                }
                else if (reg.Email.value == '') {
                alert('请填写邮箱地址');
                return false;
                }
                else if (!chkEmail(reg.Email.value)) {
                alert('请填写有效的邮箱地址');
                return false;
                };send();time(this)" value="获取验证码"/>
                <input type="submit" name="sub" value="注册">
            </p>
            <br>
        </form>
    </div>
</div>
</body>
</html>

