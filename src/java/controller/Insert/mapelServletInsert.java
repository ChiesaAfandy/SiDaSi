/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Insert;

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
public class mapelServletInsert extends HttpServlet {

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
        
        System.out.println(request.getParameter("id_guru"));
        System.out.println(id_guru);
        System.out.println(nama_mapel);
        
           modelMapel mapel = new modelMapel(0, id_guru, nama_mapel);
           mapelDAO dao = new mapelDAO();
           dao.insertData(mapel);
           
           
           request.setAttribute("data", mapel);
           
           response.sendRedirect("datamapel.jsp");
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
