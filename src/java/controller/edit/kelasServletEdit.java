/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.edit;

import DAO.kelasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.modelKelas;

/**
 *
 * @author user
 */
public class kelasServletEdit extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
        
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String kelas  = request.getParameter("kelas");
        String walikelas  = request.getParameter("walikelas");
        int id_kelas  = Integer.parseInt(request.getParameter("id_kelas"));
        
        
        System.out.println(request.getParameter("kelas"));
        System.out.println(kelas);
        System.out.println(walikelas);
        
           modelKelas modelkelas = new modelKelas (id_kelas, kelas, walikelas);
           kelasDAO dao = new kelasDAO();
           dao.editData(modelkelas);
           
           
           request.setAttribute("data", modelkelas);
           
           RequestDispatcher dp = request.getRequestDispatcher("datakelas.jsp");
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
