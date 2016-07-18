<%-- 
    Document   : login
    Created on : Mar 29, 2015, 8:00:26 PM
    Author     : Zkrony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <meta charset="UTF-8">


        <title>Sign Up</title>


        <link rel="stylesheet" href="css/normalize.css">

        <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="css/style.css">




    </head>

    <body>

        <div class="logmod">
            <div class="logmod__wrapper">
                <span class="logmod__close">Close</span>
                <div class="logmod__container">
                    <ul class="logmod__tabs">
                        <li data-tabtar="lgm-2"><a href="#">Login</a></li>
                        <li data-tabtar="lgm-1"><a href="#">Sign Up</a></li>
                    </ul>
                    <div class="logmod__tab-wrapper">
                        <div class="logmod__tab lgm-1">
                            <div class="logmod__heading">
                                <span class="logmod__heading-subtitle">Enter your personal details <strong>to create an acount</strong></span>
                            </div>
                            <div class="logmod__form">
                                <form accept-charset="utf-8" action="Myservlet" method="post" class="simform">
                                    <div class="sminputs">
                                        <div class="input full">
                                            <label class="string optional" for="user-name">Email*</label>
                                            <input class="string optional" maxlength="255" id="user-email" name="email" placeholder="Email" type="email" size="50" />
                                        </div>
                                    </div>
                                    <div class="sminputs">
                                        <div class="input string optional">
                                            <label class="string optional" for="user-pw">Password *</label>
                                            <input class="string optional" maxlength="255" id="user-pw" name="password" placeholder="Password" type="text" size="50" />
                                        </div>
                                        <div class="input string optional">
                                            <label class="string optional" for="user-pw-repeat">Repeat password *</label>
                                            <input class="string optional" maxlength="255" id="user-pw-repeat" name="password_repeat" placeholder="Repeat password" type="text" size="50" />
                                        </div>
                                    </div>
                                    <div class="simform__actions">
                                        <input class="sumbit" type="sumbit" value="submit" />
                                        <span class="simform__actions-sidetext">By creating an account you agree to our <a class="special" href="#" target="_blank" role="link">Terms & Privacy</a></span>
                                    </div> 
                                </form>
                            </div> 

                        </div>
                        <div class="logmod__tab lgm-2">
                            <div class="logmod__heading">
                                <span class="logmod__heading-subtitle">Enter your email and password <strong>to sign in</strong></span>
                            </div> 
                            <div class="logmod__form">
                                <form accept-charset="utf-8" action="#" class="simform">
                                    <div class="sminputs">
                                        <div class="input full">
                                            <label class="string optional" for="user-name">Email*</label>
                                            <input class="string optional" maxlength="255" id="user-email" placeholder="Email" type="email" size="50" />
                                        </div>
                                    </div>
                                    <div class="sminputs">
                                        <div class="input full">
                                            <label class="string optional" for="user-pw">Password *</label>
                                            <input class="string optional" maxlength="255" id="user-pw" placeholder="Password" type="password" size="50" />
                                            <span class="hide-password">Show</span>
                                        </div>
                                    </div>
                                    <div class="simform__actions">
                                        <input class="sumbit" name="commit" type="sumbit" value="Log In" />
                                        <span class="simform__actions-sidetext"><a class="special" role="link" href="#">Forgot your password?<br>Click here</a></span>
                                    </div> 
                                </form>
                            </div> 

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>


        <script src="js/index.js"></script>




    </body>
</html>
