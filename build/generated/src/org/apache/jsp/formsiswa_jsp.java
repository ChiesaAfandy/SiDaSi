package org.apache.jsp;

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
      out.write("        <title>Form Input Siswa</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"formkelas\">\n");
      out.write("      <h1>Form Input Data Guru</h1>\n");
      out.write("        <div class='row'>\n");
      out.write("            <div class='col-8'>\n");
      out.write("                <form action=\"siswaServlet\" method=\"GET\">\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                  <label for=\"nisn\"><b>NISN</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\"  name=\"nisn\">               \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("       <div class=\"inputsiswa\">\n");
      out.write("           <form action=\"siswaServlet\" method=\"GET\">\n");
      out.write("               <table>\n");
      out.write("                   <tr>\n");
      out.write("                       <td colspan=\"2\"><h2>Silahkan Input Data Siswa</h2></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Nisn</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan nisn anda\" name=\"nisn\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Nama</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan nama anda\" name=\"nama_siswa\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Tempat Lahir</h4></td>\n");
      out.write("                    <td id=\"field\"><input type=\"text\" placeholder=\"Masukkan tempat lahir anda\" name=\"tempat_lahir\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Tanggal Lahir</h4></td>\n");
      out.write("                    <td id=\"field\"><input id=\"datepicker\" type=\"text\" placeholder=\"Masukkan tanggal lahir anda\" name=\"tgl_lahir\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                    <td id=\"label\"><h4>Jenis Kelamin</h4></td>\n");
      out.write("                    <td id=\"field\"><select name=\"jns_kelamin\">\n");
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
      out.write("                    <td colspan=\"2\"> <input id=\"btn-inputsiswa\" type=\"submit\" value=\"SUBMIT\"><input id=\"btn-inputsiswa\" type=\"reset\" value=\"RESET\"></td>\n");
      out.write("                    </tr>\n");
      out.write("               </table>\n");
      out.write("           </form>\n");
      out.write("       </div>\n");
      out.write("       <p align=\"center\"><a class=\"btn_beranda\" href=\"admin.jsp\">Kembali ke Beranda</a></p><br><br>\n");
      out.write("        <div class=\"footer\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("</div>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $('#datepicker').datepicker({\n");
      out.write("                weekStart : 1,\n");
      out.write("                autoclose : true,\n");
      out.write("                todayHighlight : true,\n");
      out.write("                format : 'yyyy-mm-dd',\n");
      out.write("            });\n");
      out.write("            $('#datepicker').datepicker('setDate', new Date());\n");
      out.write("        </script>\n");
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
