package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='container pt-4'>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class='row'>\n");
      out.write("                <div class='col-4'>\n");
      out.write("                     <form action=\"siswaServlet\" method=\"GET\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>NISN</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"nisn\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Nama</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"nama\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Tempat Lahir</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"tempat_lahir\"/>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label>Tanggal Lahir</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"tgl_lahir\"\n");
      out.write("                                   id=\"datepicker\"/>\n");
      out.write("                        </div>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label>Jenis Kelamin</label>\n");
      out.write("                            <select class=\"form-control\" type=\"text\" name=\"jns_kelamin\">\n");
      out.write("                                <option value=\"laki-laki\">Laki-laki</option>\n");
      out.write("                                <option value=\"perempuan\">Perempuan</option>        \n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label>Agama</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"agama\"/>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label>Alamat</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"alamat\"/>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label>Nomor Handphone</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"no_hp\"/>\n");
      out.write("                        </div>                     \n");
      out.write("                         <input id=\"btn-inputsiswa\" type=\"submit\" value=\"SUBMIT\"><input id=\"btn-inputsiswa\" type=\"reset\" value=\"RESET\">\n");
      out.write("                     </form>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $('#datepicker').datepicker({\n");
      out.write("                    weekStart : 1,\n");
      out.write("                    autoclose : true,\n");
      out.write("                    todayHighlight : true,\n");
      out.write("                    format : 'yyyy-mm-dd',\n");
      out.write("                });\n");
      out.write("                $('#datepicker').datepicker('setDate', new Date());\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
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
