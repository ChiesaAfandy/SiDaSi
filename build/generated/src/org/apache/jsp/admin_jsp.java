package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/headeradmin.jsp");
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
      out.write("        <title>SIDASI | Admin</title>\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,400;0,500;0,700;0,900;1,300;1,500;1,700&display=swap');\n");
      out.write("  \n");
      out.write("            #content{\n");
      out.write("                margin-left: 300px;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                height: 100%;\n");
      out.write("                font-size: 20px; \n");
      out.write("                padding: 0px 10px;\n");
      out.write("                margin-bottom: 50px;    \n");
      out.write("            }\n");
      out.write("            html, body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("/*                height: 100%;*/\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font-size: 0; \n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            body * {\n");
      out.write("                font-size: 1rem;  \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h1,h3,h4{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                text-align: justify;\n");
      out.write("            }\n");
      out.write("            .bodi{\n");
      out.write("                 font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            #sidebar{\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                overflow-y: scroll;\n");
      out.write("            }\n");
      out.write("            .home .judul-content h1{\n");
      out.write("                font-weight: 500;\n");
      out.write("                font-size: xxx-large;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .text h3{\n");
      out.write("                font-size: x-large;\n");
      out.write("            }\n");
      out.write("            .text h4{\n");
      out.write("                font-size: larger;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bodi\">\n");
      out.write("        <div id=\"sidebar\">");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write(".sidenav {\n");
      out.write("  height: 100%;\n");
      out.write("  width: 270px;\n");
      out.write("  position: fixed;\n");
      out.write("  z-index: 1;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  background-color: black;\n");
      out.write("  overflow-x: hidden;\n");
      out.write("  padding-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a {\n");
      out.write("  padding: 6px 8px 6px 16px;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 25px;\n");
      out.write("  color: #818181;\n");
      out.write("  display: block;\n");
      out.write("  text-align: center;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a:hover {\n");
      out.write("  color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("  .sidenav {padding-top: 15px;}\n");
      out.write("  .sidenav a {font-size: 18px;}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Header Section -->s\n");
      out.write("         <div class=\"sidenav\">\n");
      out.write("            <a href=\"admin.jsp\">Home</a>\n");
      out.write("            <a href=\"formsiswa.jsp\">Input Siswa</a>\n");
      out.write("            <a href=\"datasiswa.jsp\">Data Siswa</a>\n");
      out.write("            <a href=\"formguru.jsp\">Input Guru</a>\n");
      out.write("            <a href=\"dataguru.jsp\">Data Guru</a>\n");
      out.write("            <a href=\"formkelas.jsp\">Input Kelas</a>\n");
      out.write("            <a href=\"datakelas.jsp\">Data Kelas</a>\n");
      out.write("            <a href=\"formmapel.jsp\">Input Mata Pelajaran</a>\n");
      out.write("            <a href=\"datamapel.jsp\">Data Mata Pelajaran</a>\n");
      out.write("            <a href=\"index.jsp\">Logout</a>\n");
      out.write("          </div>     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("         <div id=\"content\">\n");
      out.write("    <section class=\"home\" id=\"home\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"judul-content\">\n");
      out.write("                <h1>SIDASI</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text\">\n");
      out.write("                <h3>Selamat Datang</h3>\n");
      out.write("                <h4>Sistem Informasi Data Siswa</h4>\n");
      out.write("                <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n");
      out.write("                    Vestibulum quis erat turpis. Maecenas sit amet velit pulvinar, ultricies risus vitae, \n");
      out.write("                    rutrum lacus. Proin faucibus ante et risus mattis, vel tempor lacus mollis. Quisque semper\n");
      out.write("                    vulputate elit, nec scelerisque augue venenatis non. Vivamus pulvinar placerat nibh, \n");
      out.write("                    in consectetur diam laoreet eu. Fusce facilisis cursus mauris et efficitur. Proin \n");
      out.write("                    sagittis velit nunc, eu fermentum neque congue ac. Nullam vitae purus eget magna \n");
      out.write("                    ornare iaculis et sit amet diam.\n");
      out.write("                </p>\n");
      out.write("<!--                <p> Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n");
      out.write("                    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n");
      out.write("                    when an unknown printer took a galley of type and scrambled it to make a type specimen book. \n");
      out.write("                    It has survived not only five centuries, but also the leap into electronic typesetting,\n");
      out.write("                    remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets \n");
      out.write("                    containing Lorem Ipsum passages, and more recently with desktop publishing software like \n");
      out.write("                    Aldus PageMaker including versions of Lorem Ipsum. \n");
      out.write("                </p>\n");
      out.write("                <p> Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n");
      out.write("                    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n");
      out.write("                    when an unknown printer took a galley of type and scrambled it to make a type specimen book. \n");
      out.write("                    It has survived not only five centuries, but also the leap into electronic typesetting,\n");
      out.write("                    remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets \n");
      out.write("                    containing Lorem Ipsum passages, and more recently with desktop publishing software like \n");
      out.write("                    Aldus PageMaker including versions of Lorem Ipsum. \n");
      out.write("                </p>\n");
      out.write("                <p> Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n");
      out.write("                    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n");
      out.write("                    when an unknown printer took a galley of type and scrambled it to make a type specimen book. \n");
      out.write("                    It has survived not only five centuries, but also the leap into electronic typesetting,\n");
      out.write("                    remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets \n");
      out.write("                    containing Lorem Ipsum passages, and more recently with desktop publishing software like \n");
      out.write("                    Aldus PageMaker including versions of Lorem Ipsum. \n");
      out.write("                </p>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>          \n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer\">");
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
      out.write("            position: fixed;\n");
      out.write("            left: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: black;\n");
      out.write("            color: white;\n");
      out.write("            text-align: right;\n");
      out.write("            font-weight: normal;\n");
      out.write("            font-size: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("                <p> SiDaSi \n");
      out.write("                <a href=\"\"></a> &COPY; 2019</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
