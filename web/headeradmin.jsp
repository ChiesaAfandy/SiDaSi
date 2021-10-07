<%-- 
    Document   : headeradmin
    Created on : 21 Jul 20, 21:16:39
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>

.sidenav {
  height: 100%;
  width: 270px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: black;
  overflow-x: hidden;
  padding-top: 20px;
}

.sidenav a {
  padding: 6px 8px 6px 16px;
  margin-bottom: 15px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  text-align: center;
  
}

.sidenav a:hover {
  color: #f1f1f1;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
    </head>
    <body>
         <!-- Header Section -->s
         <div class="sidenav">
            <a href="admin.jsp">Home</a>
            <a href="formsiswa.jsp">Input Siswa</a>
            <a href="datasiswa.jsp">Data Siswa</a>
            <a href="formguru.jsp">Input Guru</a>
            <a href="dataguru.jsp">Data Guru</a>
            <a href="formkelas.jsp">Input Kelas</a>
            <a href="datakelas.jsp">Data Kelas</a>
            <a href="formmapel.jsp">Input Mata Pelajaran</a>
            <a href="datamapel.jsp">Data Mata Pelajaran</a>
            <a href="index.jsp">Logout</a>
          </div>     
    </body>
</html>
