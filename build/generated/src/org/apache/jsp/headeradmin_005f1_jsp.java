package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headeradmin_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: \"lato\", sans-serif;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .sidenav{\n");
      out.write("                height: 100%;\n");
      out.write("                width: 200px;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 1;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                background-color: black;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                padding-top: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .sidenav a{\n");
      out.write("                padding: 6px 8px 6px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 25px;\n");
      out.write("                color: #818181;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .sidenav a:hover{\n");
      out.write("                color: #flflfl;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .main{\n");
      out.write("                margin-left: 200px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 0px 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            @media screen and (max-height: 450px){\n");
      out.write("                .sidenav{padding-top: 150px}\n");
      out.write("                .sidenav a{font-size: 18px}\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Header Section -->\n");
      out.write("    <header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"brand-name\">\n");
      out.write("                <a href=\"#\" class=\"logo\">SiDaSi</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar\">\n");
      out.write("                        <ul>\n");
      out.write("                        <li><a href=\"#home\">Home</a></li>\n");
      out.write("                        <li><a href=\"#guru\">Guru</a></li>\n");
      out.write("                        <li><a href=\"#guru\">Data Guru</a></li>\n");
      out.write("                        <li><a href=\"formsiswa.jsp\">Siswa</a></li>\n");
      out.write("                        <li><a href=\"datasiswa.jsp\">Data Siswa</a></li>\n");
      out.write("                        <li><a href=\"#kelas\">Kelas</a></li>\n");
      out.write("                        <li><a href=\"#bidangstudy\">Bidang Study</a></li>\n");
      out.write("                        <li><a href=\"#logout\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- End Header Section -->\n");
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
