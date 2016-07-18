/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarvlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zkrony
 */
public class Insert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String district_id = "";
        String thana_id = "";
        String village_id = "";
        PrintWriter out = response.getWriter();
        java.sql.Connection con;
        ResultSet rs;
        SimpleDateFormat sdf;
        java.sql.PreparedStatement ps;
        

        int x = (int) (Math.random() * 999999) + 999999;
        String A = String.valueOf(x);
        String cutString = A.substring(0, 6);
        int F = Integer.valueOf(cutString);
        String asd = "12/05/2015";
        String FirstName = request.getParameter("FName");
        String LastName = request.getParameter("LName");
        int ParentId = Integer.valueOf(request.getParameter("PID"));
        String Date_of_birth = request.getParameter("DOB");
        String Mobile_no = request.getParameter("MNO");
        String Blood_group = request.getParameter("BGroup");
        String District = request.getParameter("District");
        String Thana = request.getParameter("Thana");
        String Village = request.getParameter("Village");
        String Edu_Sattus = request.getParameter("Edu_status");
        String Marital_status = request.getParameter("Maritial_status");
        String Occupation = request.getParameter("Occupation");
        String Sex = request.getParameter("Sex");
        String Religion = request.getParameter("Religion");
        String Image_path = request.getParameter("Image_path");
        String Year = Date_of_birth.split("-")[0];
try {
        
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/population", "root", "");
            ps= con.prepareStatement("select district_id from district where district_name = ?");
            ps.setString(1, District);
            rs = ps.executeQuery();
            while (rs.next()) {
                district_id = rs.getString(1);
        
    }
            ps= con.prepareStatement("select thana_id from district_thana where thana_name = ?");
            ps.setString(1, Thana);
            rs = ps.executeQuery();
            while (rs.next()) {
                thana_id = rs.getString(1);
        
    }
             ps= con.prepareStatement("select village_id from union_village where village_name = ?");
            ps.setString(1, Village);
            rs = ps.executeQuery();
            while (rs.next()) {
                village_id = rs.getString(1);
        
    }
            ps = con.prepareStatement("insert into people(people_id,first_name,last_name,parent_id,date_of_birth,mobile_no,blood_group,district,thana,village,edu_status,maritial_status,occupation,sex,religion,image_path,year)Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Insert</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Insert at " + Year + " " +District+ district_id + thana_id+"  "+village_id+ "  "+F +"</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e2) {
            System.out.println("Error" + e2);
            out.println("<h1>Your regitration is not complete.." + e2 + "</h1>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
