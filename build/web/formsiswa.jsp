<%-- 
    Document   : formsiswa
    Created on : 21 Jul 20, 9:24:40
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Input Siswa</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css" rel="stylesheet"/>
        <style>
            
            .formsiswa h1{
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
    <div class="formsiswa">
      <h1>Form Input Data Siswa</h1>
        <div class='row'>
            <div class='col-8'>
                <form class="form" action="siswaServletInsert" method="GET">
                     <div class="form-group">
                        <label for="nisn"><b>NISN</label>
                        <input type="text" class="form-control"  name="nisn">               
                    </div>
                     <div class="form-group">
                        <label for="nama"><b>Nama</label>
                        <input type="text" class="form-control"  name="nama_siswa">               
                    </div>
                     <div class="form-group">
                        <label for="tempat_lahir"><b>Tempat Lahir</label>
                        <input type="text" class="form-control"  name="tempat_lahir">               
                    </div>
                     <div class="form-group">
                        <label for="tgl_lahir"><b>Tanggal Lahir</label>
                        <input type="date" class="form-control" id="datepicker"  name="tgl_lahir">               
                    </div>
                     <div class="form-group">
                        <label for="jns_kelamin">Jenis Kelamin</label>  
                        <select class="form-control" name="jns_kelamin">
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
       <a href="admin.jsp"> <button id="btnBeranda" type="button" class="btn btn-primary">Beranda</button></a><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
        <script type="text/javascript">
            $('#datepicker').datepicker({
                weekStart : 1,
                autoclose : true,
                todayHighlight : true,
                format : 'yyyy-mm-dd',
            });
            $('#datepicker').datepicker('setDate', new Date());
        </script>
    </body>
</html>
