<%-- 
    Document   : datakelas
    Created on : 21-Jul-2020, 10:54:06
    Author     : Darell
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.kelasDAO"%>
<%@page import="model.modelKelas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Guru</title>
        <style>
            #btnBeranda{
               display: block;
                margin: 0 auto;
            }
            h2{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <%  
            kelasDAO dao = new kelasDAO();
            List<modelKelas> kelas = dao.showAllData();
            request.setAttribute("data", kelas);
        %>
        <h2>Tabel Data Kelas</h2> 
            <table  class="table" style="text-align: center;">
                <thead>
                  <tr>                  
                    <th scope="col">Kelas</th>
                    <th scope="col">Wali Kelas</th>
                    <th scope="col" colspan="2"> Action</th>
                  </tr>
                </thead>
                <tbody>
               </tr> 
                <c:forEach items="${data}" var="i">
                <tr>
                    <td>${i.getKelas()}</td>
                    <td>${i.getWalikelas()}</td>                   
                    <td><a href="formEditKelas.jsp?id_kelas=${i.getId_kelas()}">Edit</a></td>
                    <td><a href="kelasServletDelete?id_kelas=${i.getId_kelas()}">Delete</a></td>
                </tr>
                 </c:forEach>
                </tbody>
              </table>        
                <a href="admin.jsp"> <button id="btnBeranda" type="button" class="btn btn-primary">Beranda</button></a><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>
