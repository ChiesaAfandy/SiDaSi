<%-- 
    Document   : loginguru
    Created on : Jul 19, 2020, 4:25:04 PM
    Author     : Aan Furqan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIDASI | Login</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            body {
            margin: 0;
            padding: 0;
            background-color: whitesmoke;
            height: 100vh;
          }
          #login .container #login-row #login-column #login-box {
            margin-top: 100px;
            margin-bottom: 300px;
            max-width: 600px;
            height: 320px;
            border: 1px solid #9C9C9C;
            background-color: #EAEAEA;
          }
          #login .container #login-row #login-column #login-box #login-form {
            padding: 20px;   
          }
          #login .container #login-row #login-column #login-box #login-form #register-link {
            margin-top: -85px;
}
        </style>
    </head>   
    <body>
        <div id="login">
        <h3 class="text-center text-black pt-5">Login Guru</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="guru.jsp" method="post">
                            <h3 class="text-center ">Login</h3>
                            <div class="form-group">
                                <label for="username" ">Username:</label><br>
                                <input type="text" name="username" id="username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" >Password:</label><br>
                                <input type="password" name="password" id="password" class="form-control">
                            </div>
                               <button type="submit" class="btn btn-primary">Submit</button>
                            </div>             
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
