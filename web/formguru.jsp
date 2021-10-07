<%-- 
    Document   : formguru
    Created on : 21-Jul-2020, 10:24:08
    Author     : Darell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Input Guru</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
            
            .formguru h1{
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
        <div class="formguru">
            <h1>Form Input Data Guru</h1>
        <div class='row'>
            <div class='col-8'>
        <div class="inputkelas">
            <form class="form" action="guruServletInsert" method="GET">      
                <div class="form-group">    
                  <label for="no_peg"><b> Nomor Pegawai</label>
                  <input type="text" class="form-control"  name="no_peg" required>               
                </div>
                <div class="form-group">
                  <label for="nama">Nama</label>
                  <input type="text" class="form-control" name="nama">
                </div>
                <div class="form-group">
                  <label for="jenis_kelamin">Jenis Kelamin</label>  
                  <select class="form-control" name="jenis_kelamin">
                        <option value="laki-laki">Laki-laki</option>
                        <option value="Perempuan">Perempuan</option>
                     </select>
                </div>
                <div class="form-group">
                  <label for="agama">Agama</label>
                  <input type="text" class="form-control" name="agama">
                </div>
                <div class="form-group">
                  <label for="alamat">Alamat</label>
                  <textarea class="form-control" id="alamat" rows="3" name="alamat"></textarea>
                </div>
               <div class="form-group">
                  <label for="agama">Nomor Handphone</label>
                  <input type="text" class="form-control" name="no_hp">
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
