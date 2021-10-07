/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.edit;

import DAO.guruDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.modelGuru;

/**
 *
 * @author user
 */
public class guruServletEdit extends HttpServlet {



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
        
        guruDAO dao = new guruDAO();
        
        String no_peg = request.getParameter("no_peg");
     String nama = request.getParameter("nama");
     String jenis_kelamin = request.getParameter("jenis_kelamin");
     String agama = request.getParameter("agama");
     String alamat = request.getParameter("alamat");
     String no_hp = request.getParameter("no_hp");
     int id_guru  = Integer.parseInt(request.getParameter("id_guru"));
    
        System.out.println(request.getParameter("nama"));
        System.out.println(no_peg);
        System.out.println(nama);
        System.out.println(jenis_kelamin);
        System.out.println(agama);
        System.out.println(alamat);
        System.out.println(no_hp);
     
     modelGuru guru = new modelGuru(id_guru, no_peg, nama, jenis_kelamin, agama, alamat, no_hp);
    dao.editData(guru);
     
     request.setAttribute("data", guru);
    
     RequestDispatcher dp = request.getRequestDispatcher("dataguru.jsp");
     dp.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
