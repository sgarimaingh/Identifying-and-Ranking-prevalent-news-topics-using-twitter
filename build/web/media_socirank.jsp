<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Identifying and Ranking Prevalent</title>
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
                            <li><a href="index.jsp">Logout</a></li>

                        </ul>
                    </div>
                </div>
            </div>
            <div class="wrapper row1">
                <header id="header" class="hoc clear"> 
                    <!-- ################################################################################################ -->
                    <div id="logo" class="fl_left">
                        <h1><a href="index.jsp">SOCIAL MEDIA AND News MEDIA FOCUS</a></h1><br><br><br><br><br><br><br><br><br>
                        <h1><font size="60"><center>News Sent</center></font></h1><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                    </div>
                    <nav id="mainav" class="fl_right">
                       
                    </nav>

                    <!-- ################################################################################################ -->
                </header>
            </div>
            
            <!-- ################################################################################################ -->
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
                <p class="fl_left">Copyright &copy</p>
                <!-- ################################################################################################ -->
            </div>
        </div>
       
        <a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
        <!-- JAVASCRIPTS -->
        <script src="layout/scripts/jquery.min.js"></script>
        <script src="layout/scripts/jquery.backtotop.js"></script>
        <script src="layout/scripts/jquery.mobilemenu.js"></script>
        <script src="layout/scripts/jquery.flexslider-min.js"></script>
    </body>
</html>