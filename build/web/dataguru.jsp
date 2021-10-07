<%-- 
    Document   : dataguru
    Created on : 21-Jul-2020, 10:32:24
    Author     : Darell
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.guruDAO"%>
<%@page import="model.modelGuru"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Guru</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
            #btnBeranda{
                display: block;
                margin: 0 auto;
            }
        </style>
    </head>
    <body>
        <div class="main">
            <%  
            guruDAO dao = new guruDAO();
            List<modelGuru> guru = dao.showAllData();
            request.setAttribute("data", guru);
            %>
            <h3 align="center">Tabel Data Guru</h3>
            <table class="table" >
                <thead>
                <tr>
                    <th scope="col">Nomor Pegawai</th>
                    <th scope="col">Nama</th>
                    <th scope="col">Jenis Kelamin</th>
                    <th scope="col">Agama</th>
                    <th scope="col">Alamat</th>
                    <th scope="col">Nomor Handphone</th>
                    <th colspan="2" scope="col">Action</th>
                </tr>
                </thead>
                 <tbody>            
                </tr> <c:forEach items="${data}" var="i">
                <tr>
                    <td>${i.getNo_peg()}</td>
                    <td>${i.getNama()}</td>
                    <td>${i.getJenis_kelamin()}</td>
                    <td>${i.getAgama()}</td>
                    <td>${i.getAlamat()}</td>
                    <td>${i.getNo_hp()}</td>
                    <td><a href="formEditGuru.jsp?id_guru=${i.getId_guru()}">Edit</a></td>
                    <td><a href="guruServletDelete?id_guru=${i.getId_guru()}">Delete</a></td>
                    
                </tr>
                 </c:forEach>
                </tbody>
            </table>
                <a href="admin.jsp"> <button id="btnBeranda" type="button" class="btn btn-primary">Beranda</button></a><br><br>
                <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
        </div>
    </body>
</html>
