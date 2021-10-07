package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formguru_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Form Input Guru</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .formguru h1{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                background-color: black;\n");
      out.write("                min-height: 30px;\n");
      out.write("                color: white\n");
      out.write("            } \n");
      out.write("            .form{\n");
      out.write("                margin-left: 150px;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"formguru\">\n");
      out.write("            <h1>Form Input Data Guru</h1>\n");
      out.write("        <div class='row'>\n");
      out.write("            <div class='col-8'>\n");
      out.write("        <div class=\"inputkelas\">\n");
      out.write("            <form class=\"form\" action=\"guruServlet\" method=\"GET\">      \n");
      out.write("                <div class=\"form-group\">    \n");
      out.write("                  <label for=\"no_peg\"><b> Nomor Pegawai</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\"  name=\"no_peg\" required>               \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"nama\">Nama</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"nama\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"jenis_kelamin\">Jenis Kelamin</label>  \n");
      out.write("                  <select class=\"form-control\" name=\"jenis_kelamin\">\n");
      out.write("                        <option value=\"laki-laki\">Laki-laki</option>\n");
      out.write("                        <option value=\"Perempuan\">Perempuan</option>\n");
      out.write("                     </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"agama\">Agama</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"agama\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"alamat\">Alamat</label>\n");
      out.write("                  <textarea class=\"form-control\" id=\"alamat\" rows=\"3\" name=\"alamat\"></textarea>\n");
      out.write("                </div>\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                  <label for=\"agama\">Nomor Handphone</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"no_hp\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("           </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("</div>            \n");
      out.write("<!--        <div class=\"inputsiswa\">\n");
      out.write("           <form action=\"guruServlet\" method=\"GET\">\n");
      out.write("               <table>\n");
      out.write("                   <tr>\n");
      out.write("                       <td colspan=\"2\"><h2>Silahkan Input Data Guru</h2></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Nomor Pegawai</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukan nomor pegawai anda\" name=\"no_peg\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Nama</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan nama anda\" name=\"nama\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Jenis Kelamin</h4></td>\n");
      out.write("                    <td id=\"field\"><select name=\"jenis_kelamin\">\n");
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
      out.write("                    <td colspan=\"2\"> <input id=\"btn-inputguru\" type=\"submit\" value=\"SUBMIT\"><input id=\"btn-inputguru\" type=\"reset\" value=\"RESET\"></td>\n");
      out.write("                    </tr>\n");
      out.write("               </table>\n");
      out.write("           </form>\n");
      out.write("       </div>-->\n");
      out.write("       <p align=\"center\"><a class=\"btn_beranda\" href=\"admin.jsp\">Kembali ke Beranda</a></p><br><br>\n");
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
