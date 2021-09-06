package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import Mysql.DbConnection;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public final class Pre_005fProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>SociRank: Identifying and Ranking Prevalent</title>\n");
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
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fl_right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("<!--                            <li><a href=\"user.jsp\">User Login</a></li>\n");
      out.write("                            <li><a href=\"admin.jsp\">Admin Login</a></li>-->\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper row1\">\n");
      out.write("                <header id=\"header\" class=\"hoc clear\"> \n");
      out.write("                    <!-- ################################################################################################ -->\n");
      out.write("                    <div id=\"logo\" class=\"fl_left\">\n");
      out.write("                        <h1><a href=\"index.html\">TWITTER</a></h1>\n");
      out.write("                    </div>\n");
      out.write("                    <nav id=\"mainav\" class=\"fl_right\">\n");
      out.write("                        <!--        <ul class=\"clear\">\n");
      out.write("                                  <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                                  <li><a class=\"drop\" href=\"#\">Pages</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                      <li><a href=\"pages/gallery.html\">Gallery</a></li>\n");
      out.write("                                      <li><a href=\"pages/full-width.html\">Full Width</a></li>\n");
      out.write("                                      <li><a href=\"pages/sidebar-left.html\">Sidebar Left</a></li>\n");
      out.write("                                      <li><a href=\"pages/sidebar-right.html\">Sidebar Right</a></li>\n");
      out.write("                                      <li><a href=\"pages/basic-grid.html\">Basic Grid</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                  </li>\n");
      out.write("                                  <li><a class=\"drop\" href=\"#\">Dropdown</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                      <li><a href=\"#\">Level 2</a></li>\n");
      out.write("                                      <li><a class=\"drop\" href=\"#\">Level 2 + Drop</a>\n");
      out.write("                                        <ul>\n");
      out.write("                                          <li><a href=\"#\">Level 3</a></li>\n");
      out.write("                                          <li><a href=\"#\">Level 3</a></li>\n");
      out.write("                                          <li><a href=\"#\">Level 3</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                      </li>\n");
      out.write("                                      <li><a href=\"#\">Level 2</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                  </li>\n");
      out.write("                                  <li><a href=\"#\">Link Text</a></li>\n");
      out.write("                                  <li><a href=\"#\">Link Text</a></li>\n");
      out.write("                                </ul>-->\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <!-- ################################################################################################ -->\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"pageintro\" class=\"hoc clear\"> \n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("                <div class=\"flexslider basicslider\">\n");
      out.write("                    <ul class=\"slides\">\n");
      out.write("                        <li>\n");
      out.write("                            <article>\n");
      out.write("                                <h3 style=\"font-size: 32px\"><br><br>SociRank: Identifying and Ranking Prevalent News Topics Using Social Media Factors<br></h3>\n");
      out.write("\n");
      out.write("                                <footer>\n");
      out.write("                                    <form class=\"group\" method=\"post\" action=\"#\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <legend>Newsletter:</legend>\n");
      out.write("                                            <!--                  <input type=\"email\" value=\"\" placeholder=\"Email Here&hellip;\">\n");
      out.write("                                                              <button class=\"fa fa-sign-in\" type=\"submit\" title=\"Submit\"><em>Submit</em></button>-->\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </form>\n");
      out.write("                                </footer>\n");
      out.write("                            </article>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("            </div>\n");
      out.write("            <!-- ################################################################################################ -->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper row3\">\n");
      out.write("            <main class=\"hoc container clear\"> \n");
      out.write("                <!-- main body -->\n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("                <div class=\"center btmspace-80\">\n");
      out.write("                    <h3 class=\"heading\">Pre-Processed Data Tweet's </h3>\n");
      out.write("                    ");


                        ConfigurationBuilder cf = new ConfigurationBuilder();
                        cf.setDebugEnabled(true)
                                .setOAuthConsumerKey("aV8lanFby7bTEMl2JXfJPiuB7")
                                .setOAuthConsumerSecret("3Di9ULBEzWt1PJUtCgvUnU7vXvvVE74cdxrNA7pfVeF1sTSSty")
                                .setOAuthAccessToken("759307560369303553-X1kMf7u6BapUEMqQIQRMaR9fCuXgoyd")
                                .setOAuthAccessTokenSecret("awCfmbazBXRyk1ddMF7sUaCSD1XkR4cYc6T7QsAncpC2g");

                        TwitterFactory tf = new TwitterFactory(cf.build());
                        twitter4j.Twitter twitter = tf.getInstance();
                        java.util.List<Status> status = twitter.getHomeTimeline();

                    
      out.write("\n");
      out.write("                    <!-- / Main body -->\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>S.No</th>\n");
      out.write("                            <th>User ID</th>\n");
      out.write("                            <th>Profile Images</th>\n");
      out.write("                            <th>User Name</th>\n");
      out.write("                            <th>Post</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            for (Status st : status) {

                                String tweet = st.getText().replace("'", " ");
                                tweet = tweet.replaceAll(URL_REGEX, "");
                                tweet = tweet.replaceAll("@([^\\s]+)", "");
                                tweet = tweet.replaceAll(CONSECUTIVE_CHARS, "$1");
                                tweet = tweet.replaceAll(STARTS_WITH_NUMBER, "");
                                tweet = tweet.replaceAll("&", "&");
                                tweet = tweet.replaceAll(quest, "");
                                System.out.println("Replce Tweets *-* : " + tweet);
                            }
                            Connection con = DbConnection.getConnection();
                            Statement stt = con.createStatement();
                            try {
                                ResultSet rs = stt.executeQuery("select * from tweets");
                                while (rs.next()) {
                                    String uid = rs.getString("post");
                                    String post = uid.replace("?", "");
                                    System.out.println("User ID :----- " + uid);
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"color: black\">");
      out.print(rs.getString("id"));
      out.write("</td>\n");
      out.write("                            <td style=\"color: black\">");
      out.print(rs.getString("uid"));
      out.write("</td>\n");
      out.write("                            <td><img src=\"");
      out.print(rs.getString("img"));
      out.write("\" width=\"50\" height=\"50\" /></td>\n");
      out.write("                            <td style=\"color: darkblue\">");
      out.print(rs.getString("uname"));
      out.write("</td>\n");
      out.write("                            <td style=\"color: blueviolet\">");
      out.print(post);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }

                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <input type=\"Submit\" value=\"Key Term Graph Construction\" class=\"button\" >\n");
      out.write("                    <!-- / End body -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
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
      out.write("                <p class=\"fl_left\">Copyright &copy; 2016Jp</p>\n");
      out.write("                <!-- ################################################################################################ -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ################################################################################################ -->\n");
      out.write("        <!-- ################################################################################################ -->\n");
      out.write("        <!-- ################################################################################################ -->\n");
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
