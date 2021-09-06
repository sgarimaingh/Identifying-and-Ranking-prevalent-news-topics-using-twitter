<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Mysql.DbConnection"%>
<%@page import="twitter4j.Status" %>
<%@page import="twitter4j.TwitterException" %>
<%@page import="twitter4j.TwitterFactory" %>
<%@page import="twitter4j.conf.ConfigurationBuilder" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Identifying and Ranking Prevalent news</title>
        <meta charset="utf-8">
        <style>
            .button {
                background-color: #B94A48; /* Green */
                border: none;
                font-family: fantasy;
                color: white;
                padding: 5px 10px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
            }
        </style>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <%
            long serialVersionUID = -2486285775626564821L;
            String URL_REGEX = "((www\\.[\\s]+)|(https?://[^\\s]+))";
            String CONSECUTIVE_CHARS = "([a-z])\\1{1,}";
            String STARTS_WITH_NUMBER = "[1-9]\\s*(\\w+)";
            String quest = "\\?";

        %>
    </head>
    <body id="top">
        <div class="bgded overlay" style="background-image:url('images/t_bg.jpg');"> 
            <div class="wrapper row0">
                <div id="topbar" class="hoc clear"> 
                    <div class="fl_left">
                    </div>
                    <div class="fl_right">
                        <ul>
                            <li><a href="uhome.jsp">User Home</a></li>
                            <li><a id="myBtn" href="twe.jsp">Compose Tweet</a></li>
                            <li><a href="time_line.jsp">Time Line</a></li>
                            <li><a href="socirank.jsp">Ranked News Topics</a></li>
                            <li><a href="my_tweets.jsp">My Tweet's</a></li>
                            <li><a href="index.jsp">Logout</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="wrapper row1">
                <header id="header" class="hoc clear"> 
                    <!-- ################################################################################################ -->
                    <div id="logo" class="fl_left">
                        <h1><a href="#">TWEET'S GET FROM TWITTER</a></h1>
                    </div>
                    <nav id="mainav" class="fl_right">
                        <!--        <ul class="clear">
                                  <li class="active"><a href="index.html">Home</a></li>
                                  <li><a class="drop" href="#">Pages</a>
                                    <ul>
                                      <li><a href="pages/gallery.html">Gallery</a></li>
                                      <li><a href="pages/full-width.html">Full Width</a></li>
                                      <li><a href="pages/sidebar-left.html">Sidebar Left</a></li>
                                      <li><a href="pages/sidebar-right.html">Sidebar Right</a></li>
                                      <li><a href="pages/basic-grid.html">Basic Grid</a></li>
                                    </ul>
                                  </li>
                                  <li><a class="drop" href="#">Dropdown</a>
                                    <ul>
                                      <li><a href="#">Level 2</a></li>
                                      <li><a class="drop" href="#">Level 2 + Drop</a>
                                        <ul>
                                          <li><a href="#">Level 3</a></li>
                                          <li><a href="#">Level 3</a></li>
                                          <li><a href="#">Level 3</a></li>
                                        </ul>
                                      </li>
                                      <li><a href="#">Level 2</a></li>
                                    </ul>
                                  </li>
                                  <li><a href="#">Link Text</a></li>
                                  <li><a href="#">Link Text</a></li>
                                </ul>-->
                    </nav>

                    <!-- ################################################################################################ -->
                </header>
            </div>
            <div id="pageintro" class="hoc clear"> 
                <!-- ################################################################################################ -->
                <div class="flexslider basicslider">
                    <ul class="slides">
                        <li>
                            <article>
                                <h3 style="font-size: 32px"><br><br>Identifying and Ranking Prevalent News Topics Using Social Media(Twitter)<br></h3>

                                <footer>
                                    <form class="group" method="post" action="#">
                                        <fieldset>
                                            <legend>Newsletter:</legend>
                                            <!--                  <input type="email" value="" placeholder="Email Here&hellip;">
                                                              <button class="fa fa-sign-in" type="submit" title="Submit"><em>Submit</em></button>-->
                                        </fieldset>
                                    </form>
                                </footer>
                            </article>
                        </li>
                    </ul>
                </div>
                <!-- ################################################################################################ -->
            </div>
            <!-- ################################################################################################ -->
        </div>
        <div class="wrapper row3">
            <main class="hoc container clear"> 
                <!-- main body -->
                <!-- ################################################################################################ -->
                <div class="center btmspace-80">
                    <h3 class="heading">Tweet's get from Twitter</h3>
                    <%

                        ConfigurationBuilder cf = new ConfigurationBuilder();
                        cf.setDebugEnabled(true)
                                .setOAuthConsumerKey("vYZZuM1PzJrWtAUQwYPJn2F6h")
                                .setOAuthConsumerSecret("oqtgDLM5RCpr7aYZtJCtf1PxCjp4VwrW4wcxVrFvMgl14jj7UB")
                                .setOAuthAccessToken("1100662553301184512-Ul1XvUCpf9NI2lFv7loM2wwaJ3u6Tl")
                                .setOAuthAccessTokenSecret("dZYqXdjlDzgyHaezOXbRWgZPHwGafXacVu6a2KsTuIhEM");

                        TwitterFactory tf = new TwitterFactory(cf.build());
                        twitter4j.Twitter twitter = tf.getInstance();
                        java.util.List<Status> status = twitter.getHomeTimeline();

                    %>
                    <!-- / Main body -->
                    <table>
                        <tr>
                            <th>User ID</th>
                            <th>Screen Name</th>
                            <th>Profile Images</th>
                            <th>User Name</th>
                            <th>Post</th>
                        </tr>
                        <%
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
                                System.out.println("Replce Tweets *-* : " + tweet);
                                

                        %>
                        <tr>
                            <td style="color: black"><%=st.getId()%></td>
                            <td style="color: black"><%=st.getUser().getScreenName()%></td>
                            <td><img src="<%=st.getUser().getBiggerProfileImageURL()%>" width="50" height="50" /></td>
                            <td style="color: darkblue"><%=st.getUser().getName()%></td>
                            <td style="color: blueviolet"><%=st.getText()%></td>
                        </tr>
                        <%}%>
                    </table>
                    <!--<a href="Pre_Process.jsp"><input type="Submit" value="Pre-Processing" class="button" ></a>-->
                    <!-- / End body -->
                </div>
                <!-- ################################################################################################ -->
                <div class="clear"></div>
            </main>
        </div>


        <div class="wrapper coloured">
            <article class="hoc cta clear"> 
                <!-- ################################################################################################ -->

                <!-- ################################################################################################ -->
            </article>
        </div>

        <div class="wrapper row5">
            <div id="copyright" class="hoc clear"> 
                <!-- ################################################################################################ -->
                <p class="fl_left">Copyright &copy; 2019</p>
                <!-- ################################################################################################ -->
            </div>
        </div>
        <!-- ################################################################################################ -->
        <!-- ################################################################################################ -->
        <!-- ################################################################################################ -->
        <a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
        <!-- JAVASCRIPTS -->
        <script src="layout/scripts/jquery.min.js"></script>
        <script src="layout/scripts/jquery.backtotop.js"></script>
        <script src="layout/scripts/jquery.mobilemenu.js"></script>
        <script src="layout/scripts/jquery.flexslider-min.js"></script>
    </body>
</html>