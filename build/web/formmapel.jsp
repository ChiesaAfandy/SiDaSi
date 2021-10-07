<%-- 
    Document   : formpelajaran
    Created on : 21-Jul-2020, 11:19:08
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
        <title>Form Input Mata Pelajaran</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
                .formpelajaran h1{
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
            label{
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div class="formpelajaran">
            <%  
            guruDAO dao = new guruDAO();
            List<modelGuru> guru = dao.showAllData();
            request.setAttribute("data", guru);
            %>
            <h1>Form Input Data Mata Pelajaran</h1>
            
            <div class='row'>
                <div class='col-8'>
                    <form class="form" action="mapelServletInsert" method="GET">
                        <div class="form-group">
                        <label for="guru">ID Guru</label>
                        <select class="form-control" name="id_guru">
                        <c:forEach items="${data}" var="c">
                        <option value="${c.getId_guru()}">${c.getNama()}</option>
                        </c:forEach>
                        </select>          
                        </div>
                        <div class="form-group">
                        <label for="siswa"> Mata Pelajaran </label>
                        <input type="text" class="form-control"  name="nama_mapel" maxlength="20">               
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