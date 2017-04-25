<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - 注册</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>
<body class="gray-bg">

    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">H+</h1>

            </div>
            <h3>欢迎注册 H+</h3>
            <p>创建一个H+新账户</p>
            <form class="m-t" role="form" action="registerTo" method="post">
                <div class="form-group">
                    <input type="text" name="username" class="form-control" placeholder="请输入用户名" required="">
                </div>
                <div class="form-group">
                    <input type="password" name="password"  id="pwd1" class="form-control" placeholder="请输入密码" required="" onkeyup="validate()">
                </div>
                <div class="form-group">
                    <input type="password" id="pwd2" class="form-control" placeholder="请再次输入密码" required="" onkeyup="validate()">
					<span id="tishi" style="float:right" ></span>
                </div>
                <!-- <div class="form-group text-left">
                    <div class="checkbox i-checks">
                        <label class="no-padding">
                            <input type="checkbox" ><i></i> 我同意注册协议</label>
                    </div>
                </div> -->
                <button type="submit" id="submit" class="btn btn-primary block full-width m-b" >注 册</button>

                <p class="text-muted text-center"><small>已经有账户了？</small><a href="loginPage">点此登录</a>
                </p>

            </form>
        </div>
    </div>

    <!-- 全局js -->
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <!-- iCheck -->
    <script src="js/plugins/iCheck/icheck.min.js"></script>
    <script>
       /*  $(document).ready(function () {
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
			
        }); */
        
		function validate() {
              var pwd1 = document.getElementById("pwd1").value;
              var pwd2 = document.getElementById("pwd2").value;
           // 对比两次输入的密码  密码前后去空格
              if(pwd1 == pwd2 & pwd1.trim() != "") {
                  document.getElementById("tishi").innerHTML="<font color='green'>√</font>";
                  document.getElementById("submit").disabled = false;
              }
              else {
                  document.getElementById("tishi").innerHTML="<font color='red'>两次密码不相同</font>";
                document.getElementById("submit").disabled = true;
              }
          }
    </script>

</body>
</html>