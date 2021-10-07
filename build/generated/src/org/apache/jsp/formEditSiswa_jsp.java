package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.modelSiswa;
import DAO.siswaDAO;

public final class formEditSiswa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Form Input Siswa</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("           .formsiswa h1{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                background-color: black;\n");
      out.write("                min-height: 80px;\n");
      out.write("                color: white\n");
      out.write("            } \n");
      out.write("            .form{\n");
      out.write("                margin-left: 150px;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }      \n");
      out.write("            #btnBeranda{\n");
      out.write("                margin-left: 45%;\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            siswaDAO dao = new siswaDAO();
            String id_siswa = request.getParameter("id_siswa");
            modelSiswa data = dao.getDataById(Integer.parseInt(id_siswa));
         
      out.write("\n");
      out.write("         \n");
      out.write("    <div class=\"formsiswa\">\n");
      out.write("      <h1>Form Input Data Guru</h1>\n");
      out.write("        <div class='row'>\n");
      out.write("            <div class='col-8'>\n");
      out.write("                <form class=\"form\" action=\"ubah\" method=\"GET\">\n");
      out.write("                    <input type=\"hidden\" name=\"id_siswa\" value=\"");
      out.print(data.getId_siswa());
      out.write("\"/>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"nisn\"><b>NISN</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print(data.getNisn());
      out.write("\"  name=\"nisn\"  >               \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"nama\"><b>Nama</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print( data.getNama_siswa());
      out.write("\"   name=\"nama\">               \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"tempat_lahir\"><b>Tempat Lahir</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print( data.getTempat_lahir());
      out.write("\"  name=\"tempat_lahir\">               \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"tgl_lahir\"><b>Tanggal Lahir</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"datepicker\" value=\"");
      out.print( data.getTgl_lahir());
      out.write("\" name=\"tgl_lahir\">               \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"jns_kelamin\">Jenis Kelamin</label>  \n");
      out.write("                        <select class=\"form-control\" name=\"jns_kelamin\">\n");
      out.write("                            <option value=\"");
      out.print( data.getJns_kelamin());
      out.write("\"> ");
      out.print( data.getJns_kelamin());
      out.write(" </option>\n");
      out.write("                            <option value=\"laki-laki\">Laki-laki</option>\n");
      out.write("                            <option value=\"Perempuan\">Perempuan</option>\n");
      out.write("                     </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                  <label for=\"agama\">Agama</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" value=\"");
      out.print( data.getAgama());
      out.write("\" name=\"agama\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"alamat\">Alamat</label>\n");
      out.write("                  <textarea class=\"form-control\" id=\"alamat\" rows=\"3\" value=\"");
      out.print( data.getAlamat());
      out.write("\" name=\"alamat\"></textarea>\n");
      out.write("                </div>\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                  <label for=\"agama\">Nomor Handphone</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" value=\"");
      out.print(data.getNo_hp());
      out.write("\" name=\"no_hp\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>           \n");
      out.write("       <a href=\"admin.jsp\"> <button id=\"btnBeranda\" type=\"button\" class=\"btn btn-primary\">Beranda</button></a><br><br>\n");
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
