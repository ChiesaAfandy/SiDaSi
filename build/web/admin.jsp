<%-- 
    Document   : homeadmin
    Created on : 23 Jul 20, 17:35:30
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIDASI | Admin</title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,400;0,500;0,700;0,900;1,300;1,500;1,700&display=swap');
  
            #content{
                margin-left: 300px;
                margin-top: 30px;
                height: 100%;
                font-size: 20px; 
                padding: 0px 10px;
                margin-bottom: 50px;    
            }
            html, body {
                margin: 0;
                padding: 0;
/*                height: 100%;*/
            }
            body {
                font-size: 0; 
                font-family: 'Roboto', sans-serif;
                overflow-x: hidden;
                background-color: whitesmoke;
                
            }
            body * {
                font-size: 1rem;  
            }
            
            h1,h3,h4{
                text-align: center;
            }
            p{
                text-align: justify;
            }
            .bodi{
                 font-family: 'Roboto', sans-serif;
            }
            #sidebar{
                overflow-x: hidden;
                overflow-y: scroll;
            }
            .home .judul-content h1{
                font-weight: 500;
                font-size: xx-large;
            }
            
            .text h3{
                font-size: x-large;
            }
            .text h4{
                font-size: larger;
            }
           </style>
    </head>
    <body class="bodi">
        <div id="sidebar"><%@include file="headeradmin.jsp" %></div>
        
         <div id="content">
    <section class="home" id="home">
        <div class="container">
            <div class="judul-content">
                <h1>SIDASI</h1>
            </div>
            <div class="text">
                <h3>Selamat Datang</h3>
                <h4>Sistem Informasi Data Siswa</h4>
                <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                    Vestibulum quis erat turpis. Maecenas sit amet velit pulvinar, ultricies risus vitae, 
                    rutrum lacus. Proin faucibus ante et risus mattis, vel tempor lacus mollis. Quisque semper
                    vulputate elit, nec scelerisque augue venenatis non. Vivamus pulvinar placerat nibh, 
                    in consectetur diam laoreet eu. Fusce facilisis cursus mauris et efficitur. Proin 
                    sagittis velit nunc, eu fermentum neque congue ac. Nullam vitae purus eget magna 
                    ornare iaculis et sit amet diam.
                </p>
<!--                <p> Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
                    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                    when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
                    It has survived not only five centuries, but also the leap into electronic typesetting,
                    remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets 
                    containing Lorem Ipsum passages, and more recently with desktop publishing software like 
                    Aldus PageMaker including versions of Lorem Ipsum. 
                </p>
                <p> Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
                    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                    when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
                    It has survived not only five centuries, but also the leap into electronic typesetting,
                    remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets 
                    containing Lorem Ipsum passages, and more recently with desktop publishing software like 
                    Aldus PageMaker including versions of Lorem Ipsum. 
                </p>
                <p> Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
                    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                    when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
                    It has survived not only five centuries, but also the leap into electronic typesetting,
                    remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets 
                    containing Lorem Ipsum passages, and more recently with desktop publishing software like 
                    Aldus PageMaker including versions of Lorem Ipsum. 
                </p>-->
            </div>
        </div>
    </section>          
    </div>
    <div class="footer"><%@include file="footer.jsp" %></div>
    </body>
</html>
