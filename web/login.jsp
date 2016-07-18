<%-- 
    Document   : login
    Created on : May 18, 2015, 1:07:33 AM
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
        <link rel="stylesheet" href="style/form.css" type="text/css"/>
    </head>
    <body>
        <div id="menu">
            <a href="index.jsp">Home</a>
            <a href="#">Search Your ID</a>
            <a href="#">Category</a>
            <a href="#">Contact Us</a>
            <a href="#">Admin Login</a>
            <a href="#">User Login</a>
            <a href="#">About</a></div>
        <div id="mainpart">
            <div id="leftbody"></div>
            <div id="centerebody">
                
                <form action="Myservletlogin" method="post">
                    <fieldset>
                        <legend>Registration Form</legend>

                        Email:<input type="text" class="notfloated" name="email"/><br/><br/>
            Password:<input type="password" class="notfloated" name="password"/><br/><br/>
            <%--Email Id:<input type="text" name="userEmail"/><br/><br/>
            Country:
            <select name="userCountry">
            <option>India</option>
            <option>Pakistan</option>
            <option>other</option>
            </select>
            --%>

            <br/><br/>
            <input type="submit" class="floated" name="login" value="LOg IN"/>
            
                    </fieldset>
            
        </form>
            </div>
            <div id="rightbody"></div>
        </div>
        
    </body>
</html>
