<%-- 
    Document   : datasiswa
    Created on : 21 Jul 20, 10:09:49
    Author     : user
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.siswaDAO"%>
<%@page import="model.modelSiswa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Data Siswa</title>
        <style>
            #btnBeranda{
               display: block;
                margin: 0 auto;
            }
        </style>
    </head>
    <body>   
        <%  
            siswaDAO dao = new siswaDAO();
            List<modelSiswa> siswa = dao.showAllData();
            request.setAttribute("data", siswa);
        %>
   
        <h3 align="center">Data Siswa</h3>
         <table  class="table " >
                <thead>
                  <tr>
                    <th scope="col">NISN</th>
                    <th scope="col">Nama Siswa</th>
                    <th scope="col">Tempat Lahir</th>
                    <th scope="col">Tanggal lahir</th>
                    <th scope="col">Jenis Kelamin</th>
                    <th scope="col">Agama</th>
                    <th scope="col">Alamat</th>
                    <th scope="col">Nomor Handphone</th>
                    <th scope="col"colspan="2">Actions</th>       
                  </tr>
                </thead>
                <tbody>            
                <c:forEach items="${data}" var="i">
                <tr>
                    <td>${i.getNisn()}</td>
                    <td>${i.getNama_siswa()}</td>
                    <td>${i.getTempat_lahir()}</td>
                    <td>${i.getTgl_lahir()}</td>
                    <td>${i.getJns_kelamin()}</td>
                    <td>${i.getAgama()}</td>
                    <td>${i.getAlamat()}</td>
                    <td>${i.getNo_hp()}</td>
                    <td><a href="formEditSiswa.jsp?id_siswa=${i.getId_siswa()}">Edit</a></td>
                    <td><a href="siswaServletDelete?id_siswa=${i.getId_siswa()}">Delete</a></td>
                </tr>
                 </c:forEach>
                </tbody>
              </table>
            <a href="admin.jsp"> <button id="btnBeranda" type="button" class="btn btn-primary">Beranda</button></a><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
             </div>
    </body>
</html>
