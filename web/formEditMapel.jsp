<%-- 
    Document   : formpelajaran
    Created on : 21-Jul-2020, 11:19:08
    Author     : Darell
--%>

<%@page import="model.modelMapel"%>
<%@page import="DAO.mapelDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Input Mata Pelajaran</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
                .formpelajaran h1{
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
            mapelDAO dao = new mapelDAO();
            String id_mapel = request.getParameter("id_mapel");
            modelMapel data = dao.getDataById(Integer.parseInt(id_mapel));
         %>
         
        <div class="formpelajaran">
            <h1>Form Input Data Mata Pelajaran</h1>
            <div class='row'>
                <div class='col-8'>
                    <form class="form" action="mapelServletEdit" method="GET">
                         <input type="hidden" name="id_mapel" value="<%=id_mapel%>"/>
                        <div class="form-group">
                        <label for="guru"><b> Guru</label>
                        <input type="text" class="form-control" value="<%=data.getId_guru()%>" name="id_guru">               
                        </div>
                        <div class="form-group">
                        <label for="siswa"><b> Mata Pelajaran </label>
                        <input type="text" class="form-control" value="<%=data.getNama_mapel()%>" name="nama_mapel">               
                        </div>
                         <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>  
            </div>
        </div>
     <a href="admin.jsp"> <button id="btnBeranda" type="button" class="btn btn-primary">Beranda</button></a><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>
<!--       