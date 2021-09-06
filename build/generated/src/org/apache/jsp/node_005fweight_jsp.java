package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.*;
import graph.algo.Edge;
import graph.algo.Graph;
import graph.algo.Node;
import graph.algo.Nodewight;
import graph.algo.ShortestPath;
import graph.algo.GraphSimple;
import graph.algo.PublicPosts;
import graph.algo.Vertex;
import Mysql.DbConnection;
import java.util.*;

public final class node_005fweight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/socirank", "root", "root");
    ArrayList<String> list1 = new ArrayList<String>();
    Statement st = con.createStatement();
    Connection con1 = DbConnection.getConnection();
    Statement st1 = con1.createStatement();
    Statement st2 = con.createStatement();
    ResultSet rs1 = st1.executeQuery("select * from tweets");
    while (rs1.next()) {
        String str = rs1.getString("uid");
        Nodewight node = new Nodewight();
        node.getNode();
        String nodeweighting = node.getNodeWeight(str);
        st2.executeUpdate("update tweets set nodeweighting='" + nodeweighting + "' where uid='" + str + "'");
//        list1.add(rs1.getString("post"));
    }
    response.sendRedirect("graph_cluster.jsp");

    for (String s : list1) {
        System.out.println(s);
        ResultSet rs2 = st.executeQuery("select * from political");
        while (rs2.next()) {
            String val1 = rs2.getString("words");
            System.out.println("value checking is :" + val1);
            if (s.indexOf(val1) >= 0) {
                System.out.println(s + "checking1" + val1);
                st2.executeUpdate("update tweets set df='1' where post='" + s + "'");
            }
        }
    }


    ResultSet rs2 = st.executeQuery("select * from political");
    while (rs1.next()) {
        String words = rs1.getString("post");
        System.out.println("Post ---------- : " + words);
        while (rs2.next()) {
            String val1 = rs2.getString("words");
            System.out.println("value checking is :" + val1);
            if (words.indexOf(val1) >= 0) {
                System.out.println(words + "checking1" + val1);
                st2.executeUpdate("update tweets set df='1' where post='" + words + "'");
            }
        }
    }


      out.write('\n');
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
