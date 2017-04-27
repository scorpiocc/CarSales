<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title> - 登录</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    
    <link rel="shortcut icon" href="css/favicon.ico"> 
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>
<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">Car</h1>

            </div>
            <h3>欢迎使用 hAdmin</h3>

            <form class="m-t" role="form" action='${pageContext.request.contextPath}/newLogin' method='POST'>
                <div class="form-group">
                    <input type="text" name="username" class="form-control" placeholder="用户名" required="">
                </div>
                <div class="form-group">
                    <input type="password" name="password" class="form-control" placeholder="密码" required="">
                </div>
                <div style="float:left"> <input id="remember-me" name="remember-me" type="checkbox" checked="checked" />&nbsp&nbsp&nbsp自动登陆</div>
				 <br/>  <br/>
                <button type="submit" name="submit" class="btn btn-primary block full-width m-b">登 录</button>

            </form>
        </div>
    </div>

    <!-- 全局js -->
   <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script> 

</body>
</html>