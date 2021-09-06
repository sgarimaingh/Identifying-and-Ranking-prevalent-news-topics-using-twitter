package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import Mysql.DbConnection;
import twitter4j.Status;
import graph.algo.Graph;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public final class pocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

    long serialVersionUID = -2486285775626564821L;
    String URL_REGEX = "((www\\.[\\s]+)|(https?://[^\\s]+))";
    String CONSECUTIVE_CHARS = "([a-z])\\1{1,}";
    String STARTS_WITH_NUMBER = "[1-9]\\s*(\\w+)";
    String quest = "\\?";

    ConfigurationBuilder cf = new ConfigurationBuilder();
    cf.setDebugEnabled(true)
            .setOAuthConsumerKey("aV8lanFby7bTEMl2JXfJPiuB7")
            .setOAuthConsumerSecret("3Di9ULBEzWt1PJUtCgvUnU7vXvvVE74cdxrNA7pfVeF1sTSSty")
            .setOAuthAccessToken("759307560369303553-X1kMf7u6BapUEMqQIQRMaR9fCuXgoyd")
            .setOAuthAccessTokenSecret("awCfmbazBXRyk1ddMF7sUaCSD1XkR4cYc6T7QsAncpC2g");

    TwitterFactory tf = new TwitterFactory(cf.build());
    twitter4j.Twitter twitter = tf.getInstance();
    java.util.List<Status> status = twitter.getHomeTimeline();


    for (Status st : status) {
        Connection con = DbConnection.getConnection();
        Statement stt = con.createStatement();
        String tweet = st.getText().replace("'", " ");
        tweet = tweet.replaceAll(URL_REGEX, "");
        tweet = tweet.replaceAll("@([^\\s]+)", "");
        tweet = tweet.replaceAll(CONSECUTIVE_CHARS, "$1");
        tweet = tweet.replaceAll(STARTS_WITH_NUMBER, "");
        tweet = tweet.replaceAll("&", "&");
        tweet = tweet.replaceAll(quest, "");
        System.out.println("Replce Tweets *..-..* : " + tweet);
        Connection con1 = DbConnection.getConnection();
        Statement st1 = con1.createStatement();
        try {
            ResultSet rs = st1.executeQuery("select * from political");
            while (rs.next()) {
                String val1 = rs.getString("words");
                if (tweet.indexOf(val1) >= 0) {
                    stt.executeUpdate("insert into tweets (uid, img, uname, post, df) values ('" + st.getId() + "', '" + st.getUser().getBiggerProfileImageURL() + "', '" + st.getUser().getName() + "', '" + tweet + "', '1')");
                } else {
                    stt.executeUpdate("insert into tweets (uid, img, uname, post, df) values ('" + st.getId() + "', '" + st.getUser().getBiggerProfileImageURL() + "', '" + st.getUser().getName() + "', '" + tweet + "', '0')");
                }
            }
        } catch (Exception ex) {
            response.sendRedirect("Pre_Process.jsp");
        }
        
    }

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
