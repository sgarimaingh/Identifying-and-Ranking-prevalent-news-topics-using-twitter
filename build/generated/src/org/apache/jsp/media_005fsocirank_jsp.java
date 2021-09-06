package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class media_005fsocirank_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Identifying and Ranking Prevalent</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <style>\n");
      out.write("            .button {\n");
      out.write("                background-color: #B94A48; /* Green */\n");
      out.write("                border: none;\n");
      out.write("                font-family: fantasy;\n");
      out.write("                color: white;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("        <link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        ");

            long serialVersionUID = -2486285775626564821L;
            String URL_REGEX = "((www\\.[\\s]+)|(https?://[^\\s]+))";
            String CONSECUTIVE_CHARS = "([a-z])\\1{1,}";
            String STARTS_WITH_NUMBER = "[1-9]\\s*(\\w+)";
            String quest = "\\?";

        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("        <div class=\"bgded overlay\" style=\"background-image:url('images/t_bg.jpg');\"> \n");
      out.write("            <div class=\"wrapper row0\">\n");
      out.write("                <div id=\"topbar\" class=\"hoc clear\"> \n");
      out.write("                    <div class=\"fl_left\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fl_right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper row1\">\n");
      out.write("                <header id=\"header\" class=\"hoc clear\"> \n");
      out.write("                    <!-- ################################################################################################ -->\n");
      out.write("                    <div id=\"logo\" class=\"fl_left\">\n");
      out.write("                        <h1><a href=\"index.jsp\">SOCIAL MEDIA AND News MEDIA FOCUS</a></h1><br><br><br><br><br><br>\n");
      out.write("                        <h1><font size=\"60\"><center>News Sent</center></font></h1><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("                    </div>\n");
      out.write("                    <nav id=\"mainav\" class=\"fl_right\">\n");
      out.write("                       \n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <!-- ################################################################################################ -->\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- ################################################################################################ -->\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"wrapper coloured\">\n");
      out.write("            <article class=\"hoc cta clear\"> \n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("\n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("            </article>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper row5\">\n");
      out.write("            <div id=\"copyright\" class=\"hoc clear\"> \n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("                <p class=\"fl_left\">Copyright &copy</p>\n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("        <!-- JAVASCRIPTS -->\n");
      out.write("        <script src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("        <script src=\"layout/scripts/jquery.backtotop.js\"></script>\n");
      out.write("        <script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\n");
      out.write("        <script src=\"layout/scripts/jquery.flexslider-min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
