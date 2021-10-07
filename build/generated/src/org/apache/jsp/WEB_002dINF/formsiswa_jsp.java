package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formsiswa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"header\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("</div>\n");
      out.write("       <div class=\"inputsiswa\">\n");
      out.write("           <form action=\"\" method=\"get\">\n");
      out.write("               <table>\n");
      out.write("                   <tr>\n");
      out.write("                       <td colspan=\"2\"><h2>Silahkan Input Data Siswa</h2></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Nisn</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan nisn anda\" name=\"nisn\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Tempat Lahir</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan tempat lahir anda\" name=\"tempat_lahir\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Tanggal Lahir</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"date\" placeholder=\"Masukkan tanggal lahir anda\" name=\"tempat_lahir\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Jenis Kelamin</h4></td>\n");
      out.write("                    <td id=\"field\"><select name=\"jenis-kelamin\">\n");
      out.write("                            <option value=\"Laki-laki\"> Laki-laki</option>\n");
      out.write("                            <option value=\"Perempuan\"> Perempuan</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Agama</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan agama anda\" name=\"agama\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>alamat</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan alamat anda\" name=\"alamat\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Nomor Handphone</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan nomor handphone anda\" name=\"no_hp\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td colspan=\"2\"> <input id=\"btn-inputsiswa\" type=\"submit\" value=\"PESAN\"><input id=\"btn-inputsiswa\" type=\"reset\" value=\"RESET\"></td>\n");
      out.write("                    </tr>\n");
      out.write("               </table>\n");
      out.write("           </form>\n");
      out.write("       </div>\n");
      out.write("       <p align=\"center\"><a class=\"btn_beranda\" href=\"index.jsp\">Kembali ke Beranda</a></p><br><br>\n");
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
