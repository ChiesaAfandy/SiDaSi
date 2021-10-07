package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/headerindex.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("        <title>SIDASI</title>\n");
      out.write("            <style>\n");
      out.write("         skills{\n");
      out.write("             margin: 0;\n");
      out.write("             padding: 0;\n");
      out.write("             background-color: whitesmoke;      \n");
      out.write("         }\n");
      out.write("        .skills .content-box{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;     \n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("        .content-box .box{\n");
      out.write("            width: 280px;\n");
      out.write("            padding: 40px;\n");
      out.write("            min-height: 150px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            margin: 40px;\n");
      out.write("            background: black;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            box-shadow: 0 5px 15px rgba(0,0,0,0.9);\n");
      out.write("            background-color: red;\n");
      out.write("        }\n");
      out.write("        .content-box .box:hover{\n");
      out.write("            background: white;\n");
      out.write("            color: white;\n");
      out.write("            transition: all .5s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content-box .box .content{\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .box .content h3{\n");
      out.write("            font-weight: 700;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            font-size: 25px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .box .content h3:hover{\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        .footer{\n");
      out.write("            margin-top: 180px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header style=\"text-align: center; color: black; margin: 0; padding: 0;\">\n");
      out.write("            <h2 class=\"text-center text-black pt-5\">Selamat Datang di SIDASI</h2>\n");
      out.write("            <h3 >Sistem Informasi Data Siswa</h3>\n");
      out.write("            <br>\n");
      out.write("            <BR>\n");
      out.write("            <h2>SILAHKAN LOGIN</h2>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <section class=\"skills\" id=\"user\">\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("            <div class=\"content-box\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <a class=\"login_guru\" href=\"loginguru.jsp\"><h3>Guru</h3></a>            \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <a class=\"login_admin\" href=\"loginadmin.jsp\"><h3> Admin </h3></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            footer {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 3px;\n");
      out.write("            background-color: black;\n");
      out.write("            color: white;\n");
      out.write("            width: 100%\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("                <p> SiDaSi<br>\n");
      out.write("                <a href=\"\"></a> &COPY; 2019</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("        </body>\n");
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
