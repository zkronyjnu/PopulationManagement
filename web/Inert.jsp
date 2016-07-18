<%-- 
    Document   : Inert
    Created on : Apr 27, 2015, 9:21:39 PM
    Author     : Zkrony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style/style2.css" type="text/css"/>
        <link rel="stylesheet" href="style/form.css" type="text/css"/>
    </head>
    <body>
        <div id="menu">
            <a href="#">Home</a>
            <a href="#">Search Your ID</a>
            <a href="#">Category</a>
            <a href="#">Contact Us</a>
            <a href="#">Admin Login</a>
            <a href="#">User Login</a>
            <a href="#">About</a></div>
        <div id="mainpart">
            <div id="leftbody"></div>
            <div id="centerebody">

                <form action="Insert" method="post">
                    <fieldset>
                        <legend>Inert Form</legend>
                        First Name:<input type="text" name="FName"/><br/><br/>
                        Lat Name:<input type="text" name="LName"/><br/><br/>
                        Parent ID:<input type="text" name="PID"/><br/><br/>
                        Date of Birth:<input type="date" name="DOB"/><br/><br/>
                        Mobile NO:<input type="" name="MNO"/><br/><br/>
                        Blood Group:<input type="text" name="BGroup"/><br/><br/>
                        District:<select name="District">
                            <option value="Dhaka">Dhaka</option>
                            <option value="jessore">Jessore</option>
                            
                            <option value="khulna">Khulna</option>
                            <option value="Dhaka">Rajshahi</option>
                            
                            <option value="rangpur">Rangpur</option>
                            <option value="barisal">Barisal</option>
                            
                            <option value="sylhet">Sylhet</option>
                            <option value="chittagang">Chitagang</option>
                            
                            <option value="Dhaka">A</option>
                            <option value="Dhaka">B</option>
                            
                            </select><br/><br/>
                        Thana:<input type="text" name="Thana"/><br/><br/>
                        Village:<input type="text" name="Village"/><br/><br/>
                        Edu_status:<input type="text" name="Edu_statu"/><br/><br/>
                        Marital_status:<input type="text" name="Maritial_status"/><br/><br/>
                        Occupation:<input type="text" name="Occupation"/><br/><br/>
                        Sex:<input type="text" name="Sex"/><br/><br/>
                        Religion:<input type="text" name="Religion"/><br/><br/>
                        Image_path:<input type="text" name="Image_path"/><br/><br/>


                        <input type="submit" value="Insert"/>
                    </fieldset>
                </form>
            </div>
            <div id="rightbody"></div>
        </div>
<div id="footer">&copy;zkrony</div>
    </body>
</html>
