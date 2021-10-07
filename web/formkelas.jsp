<%-- 
    Document   : formkelas
    Created on : 21-Jul-2020, 10:53:58
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Form Input Kelas</title>
        <style>
               .formkelas h1{
                text-align: center;
                margin-bottom: 30px;
                text-transform: capitalize;
                background-color: black;
                min-height: 80px;
                color: white;
                    padding-top:15px;  
            } 
            .form{
                margin-left: 150px;
                margin-right: auto;
            }      
            #btnBeranda{
                display: block;
                margin: 0 auto;
            }
        </style>
    </head>
    <body>
         <div class="formkelas">
            <h1>Form Input Data Guru</h1>
        <div class='row'>
            <div class='col-8'>     
            <form class="form" action="kelasServletInsert" method="GET">      
                <div class="form-group">
                  <label for="kelas"><b>Kelas</label>
                  <input type="text" class="form-control"  name="kelas">               
                </div>
                <div class="form-group">
                  <label for="walikelas">Wali Kelas</label>
                  <input type="text" class="form-control"  name="walikelas">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
           </form>
          </div>
        </div>
    </div>              
         </div>
           <a href="admin.jsp"> <button id="btnBeranda" type="button" class="btn btn-primary">Beranda</button></a><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>
