package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import DAO.kelasDAO;
import model.modelKelas;

public final class datakelas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Data Guru</title>\n");
      out.write("        <style>\n");
      out.write("            .table{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-left: 250px; /* Same as the width of the sidenav */\n");
      out.write("            font-size: 28px; /* Increased text to enable scrolling */\n");
      out.write("            padding: 0px 10px;\n");
      out.write("            width: 80%;\n");
      out.write("            border:  1px solid black;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                font-weight: 800;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
  
            kelasDAO dao = new kelasDAO();
            List<modelKelas> kelas = dao.showAllData();
            request.setAttribute("data", kelas);
        
      out.write("\n");
      out.write("            <div class=\"header\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headeradmin.jsp", out, false);
      out.write("</div> <br><br>\n");
      out.write("            <h2>Tabel Data Kelas</h2> \n");
      out.write("            <table  class=\"table\" >\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"col\">id_kelas</th>\n");
      out.write("                    <th scope=\"col\">Kelas</th>\n");
      out.write("                    <th scope=\"col\">Wali Kelas</th>\n");
      out.write("                    <th scope=\"col\" colspan=\"2\"> Action</th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("               </tr> \n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"i\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getKelas()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getWalikelas()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>                   \n");
      out.write("                    <td><a href=\"formEdit.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId_kelas()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Edit</a></td>\n");
      out.write("                    <td><a href=\"hapus?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId_kelas()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("                 </c:forEach>\n");
      out.write("                </tbody>\n");
      out.write("              </table>        \n");
      out.write("                <p align=\"center\"><a class=\"btn_beranda\" href=\"admin.jsp\">Kembali ke Beranda</a></p><br><br>\n");
      out.write("        <div class=\"footer\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
