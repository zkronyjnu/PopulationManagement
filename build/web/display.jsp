<%-- 
    Document   : display
    Created on : Mar 30, 2015, 12:15:52 AM
    Author     : Zkrony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%><%--java.sql imported--%>
<% Class.forName("com.mysql.jdbc.Driver");%><%--//method forName call--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style1.css" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %> 
        <div id="container">
        
        <%!
            public class Actor {

                String URL = "jdbc:mysql://localhost:3306/population";
                String USERNAME = "root";
                String PASSWORD = "";
                Connection connection = null;
                PreparedStatement selectActors = null;
                ResultSet resultSet = null;

                public Actor() {
                    try {
                        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                        selectActors = connection.prepareStatement("SELECT * from people");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                public ResultSet getActors() {
                    try {
                        resultSet = selectActors.executeQuery();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return resultSet;
                }
            }
        %>
        <%
        Actor actor = new Actor();
        ResultSet actors = actor.getActors();
        %>
        <table border="1" class="center">
            <tbody>
                <tr>
                    <td>People ID</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Parent ID</td>
                    <td>Birthday</td>
                    <td>Mobile Number</td>
                    <td>Blood Group</td>
                    <td>Country</td>
                    <td>District</td>
                    <td>Thana</td>
                    <td>Village</td>
                    
                </tr>
                <% while (actors.next()){%>
                <tr>
                    <td><%= actors.getInt("people_id")%></td>
                    <td><%= actors.getString("first_name")%></td>
                    <td><%=actors.getString("last_name")%></td>
                    <td><%= actors.getString("parent_id")%></td>
                    <td><%=actors.getString("date_of_birth")%></td>
                    <td><%= actors.getString("mobile_no")%></td>
                    <td><%=actors.getString("blood_group")%></td>
                    <td><%= actors.getString("country")%></td>
                    <td><%=actors.getString("district")%></td>
                    <td><%= actors.getString("thana")%></td>
                    <td><%=actors.getString("village")%></td>
                    
                </tr>
                <%}%>
            </tbody>
        </table>
        </div>
    </body>
</html>
