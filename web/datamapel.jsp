<%-- 
    Document   : datamapel
    Created on : 21-Jul-2020, 11:19:18
    Author     : Darell
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.mapelDAO"%>
<%@page import="model.modelMapel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Mata Pelajaran</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
            #btnBeranda{
                display: block;
                margin: 0 auto;
            }
        </style>
    </head>
    <body>
         <%  
            mapelDAO dao = new mapelDAO();
            List<modelMapel> mapel = dao.showAllData();
            request.setAttribute("data", mapel);
        %>
            <h3 align="center">Data Mata Pelajaran</h3>
            <table class="table" >
                <thead>
                <tr>
                    <th scope="col">ID Guru</th>
                    <th scope="col">Nama Mapel</th>
                    <th scope="col" colspan="2">Action</th>
                </tr>
                </thead>
                <tbody>
                  <c:forEach items="${data}" var="i">
                <tr>
                    <td>${i.getId_guru()}</td>
                    <td>${i.getNama_mapel()}</td> 
                    <td><a href="formEditMapel.jsp?id_mapel=${i.getId_mapel()}">Edit</a></td>
                    <td><a href="mapelServletDelete?id_mapel=${i.getId_mapel()}">Delete</a></td>
                </tr>
                  </c:forEach>
                </tbody>
     
            </table>
                <a href="admin.jsp"> <button id="btnBeranda" type="button" class="btn btn-primary">Beranda</button></a><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>
