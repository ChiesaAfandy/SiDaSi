<%-- 
    Document   : index
    Created on : Jul 19, 2020, 1:34:50 PM
    Author     : Aan Furqan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <title>SIDASI</title>
            <style>
         skills{
             margin: 0;
             padding: 0;
             background-color: whitesmoke;      
         }
        .skills .content-box{
            display: flex;
            justify-content: center;     
            margin-top: 10px;
            
        }
    
        .content-box .box{
            width: 280px;
            padding: 40px;
            min-height: 150px;
            box-sizing: border-box;
            border-radius: 20px;
            margin: 40px;
            background: black;
            color: white;
            text-align: center;
            box-shadow: 0 5px 15px rgba(0,0,0,0.9);
        }
        .content-box .box:hover{
            background: white;
            color: white;
            transition: all .5s ease;
        }

        .content-box .box .content{
            position: relative;
        }

        .box .content h3{
            font-weight: 700;
            text-transform: uppercase;
            font-size: 25px;
            text-decoration: none;
            color: white;
        }
        .content-box .box:hover h3{
            color: black;
        }
        a{
            text-decoration: none;
        }
        .footer{
            margin-top: 180px;
        }
    </style>

    </head>
    <body>
        <%@include file="headerindex.jsp" %>
        <section class="skills" id="user">
        <div class="section-title">
            <div class="content-box">
                <a class="login_guru" href="loginguru.jsp"><div class="box">
                    <div class="content">
                        <h3>Guru</h3>           
                    </div>
                </div></a> 
                <a class="login_admin" href="loginadmin.jsp"><div class="box">
                    <div class="content">
                        <h3> Admin </h3>
                    </div>
                </div></a>
            </div>
        </div>
            </div>
        </section>
        <div class="footer">
        <%@include file="footer.jsp" %>
        </body>
</html>
