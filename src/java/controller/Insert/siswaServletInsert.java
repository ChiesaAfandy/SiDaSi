/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Insert;

import DAO.siswaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.modelSiswa;

/**
 *
 * @author Chiesaafandy
 */
public class siswaServletInsert extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        
           String nisn  = request.getParameter("nisn");
           String nama_siswa  = request.getParameter("nama_siswa");
           String tempat_lahir  = request.getParameter("tempat_lahir");
           String tgl_lahir   =request.getParameter("tgl_lahir");
           String jns_kelamin  = request.getParameter("jns_kelamin");
           String agama = request.getParameter("agama");
           String alamat = request.getParameter("alamat");
           String no_hp   = request.getParameter("no_hp");
           
           System.out.println(request.getParameter("nama_siswa"));
           System.out.println(nisn);
           System.out.println(nama_siswa);
           System.out.println(tempat_lahir);
           System.out.println(tgl_lahir);
           System.out.println(jns_kelamin);
           System.out.println(agama);
           System.out.println(alamat);
           System.out.println(no_hp);
           
           
           modelSiswa siswa = new modelSiswa (0, nisn, nama_siswa, tempat_lahir, tgl_lahir, jns_kelamin, agama, alamat, no_hp);
           siswaDAO dao = new siswaDAO();
           dao.insertData(siswa);
           
           
           request.setAttribute("data", siswa);
           
           response.sendRedirect("datasiswa.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}