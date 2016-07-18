<%-- 
    Document   : index
    Created on : Mar 29, 2015, 11:34:54 PM
    Author     : Zkrony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style1.css" type="text/css"/>
    </head>
    <body>
        <div id="menu">
            <a href="index.jsp">Home</a>
            <a href="#">Search Your ID</a>
            <a href="#">Category</a>
            <a href="#">Contact Us</a>
            <a href="registration.jsp">Login / Signup</a>
            <a href="#">About</a></div>
        <div id="mainpart">
            <div id="leftbody"></div>
            <div id="centerebody">
                <img src="/content/images/aasd.JPG" alt="Bangladesh" usemap="#Map">

                <map name="Map" id="Map">
                    <area alt="" title="" href="otherpages/dhaka.jsp" shape="circle" coords="222,306,14" />
                    
                    <area alt="" title="" href="otherpages/syllhet.jsp" shape="circle" coords="365,194,7" />
                    <area alt="" title="" href="otherpages/khulna.jsp" shape="circle" coords="134,402,12" />
                    <area alt="" title="" href="otherpages/chitagong.jsp" shape="circle" coords="366,447,11" />
                    
                    
                </map>
            </div>
            <div id="rightbody"></div>
        </div>
        <div id="footer">&copy;zkrony</div>
    </body>
</html>

