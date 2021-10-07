/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.edit;

import DAO.mapelDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.modelMapel;

/**
 *
 * @author user
 */
public class mapelServletEdit extends HttpServlet {

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
        int id_guru  = Integer.parseInt(request.getParameter("id_guru"));
        String nama_mapel  = request.getParameter("nama_mapel");
        int id_mapel  = Integer.parseInt(request.getParameter("id_mapel"));
        
        System.out.println(request.getParameter("id_guru"));
        System.out.println(id_guru);
        System.out.println(nama_mapel);
        
           modelMapel mapel = new modelMapel(id_mapel, id_guru, nama_mapel);
           mapelDAO dao = new mapelDAO();
           dao.editData(mapel);
           
           
           request.setAttribute("data", mapel);
           
           RequestDispatcher dp = request.getRequestDispatcher("datamapel.jsp");
	dp.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
   
