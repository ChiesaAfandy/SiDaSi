<%-- 
    Document   : formeeditguru
    Created on : 21-Jul-2020, 10:24:08
    Author     : user
--%>

<%@page import="model.modelGuru"%>
<%@page import="DAO.guruDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Edit Guru</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
            
            .formguru h1{
                text-align: center;
                margin-bottom: 30px;
                text-transform: capitalize;
                background-color: black;
                min-height: 80px;
                color: white
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
          <%
            guruDAO dao = new guruDAO();
            String id_guru = request.getParameter("id_guru");
            modelGuru data = dao.getDataById(Integer.parseInt(id_guru));
         %>
        <div class="formguru">
            <h1>Form Input Data Guru</h1>
        <div class='row'>
            <div class='col-8'>  
            <form class="form" action="guruServletEdit" method="GET">      
                <input type="hidden" name="id_guru" value="<%=id_guru%>"/>
                <div class="form-group">    
                  <label for="no_peg"><b> Nomor Pegawai</label>
                  <input type="text" class="form-control" value="<%=data.getNo_peg()%>" name="no_peg" >               
                </div>
                <div class="form-group">
                  <label for="nama">Nama</label>
                  <input type="text" class="form-control" value="<%=data.getNama()%>" name="nama">
                </div>
                <div class="form-group">
                  <label for="jenis_kelamin">Jenis Kelamin</label>  
                  <select class="form-control" name="jenis_kelamin">
                        <option value="<%= data.getJenis_kelamin()%>"> <%= data.getJenis_kelamin()%> </option>
                        <option value="laki-laki">Laki-laki</option>
                        <option value="Perempuan">Perempuan</option>
                     </select>
                </div>
                <div class="form-group">
                  <label for="agama">Agama</label>
                  <input type="text" class="form-control" value="<%=data.getAgama()%>" name="agama">
                </div>
                <div class="form-group">
                  <label for="alamat">Alamat</label>
                  <textarea class="form-control" id="alamat" rows="3" value="<%=data.getAlamat()%>" name="alamat"><%=data.getAlamat()%></textarea>
                </div>
               <div class="form-group">
                  <label for="agama">Nomor Handphone</label>
                  <input type="text" class="form-control" value="<%=data.getNo_hp()%>" name="no_hp">
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
