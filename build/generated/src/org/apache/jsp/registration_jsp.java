package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/form.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <a href=\"#\">Home</a>\n");
      out.write("            <a href=\"#\">Search Your ID</a>\n");
      out.write("            <a href=\"#\">Category</a>\n");
      out.write("            <a href=\"#\">Contact Us</a>\n");
      out.write("            <a href=\"#\">Admin Login</a>\n");
      out.write("            <a href=\"#\">User Login</a>\n");
      out.write("            <a href=\"#\">About</a></div>\n");
      out.write("        <div id=\"mainpart\">\n");
      out.write("            <div id=\"leftbody\"></div>\n");
      out.write("            <div id=\"centerebody\">\n");
      out.write("                \n");
      out.write("                <form action=\"Myservlet\" method=\"post\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Registration Form</legend>\n");
      out.write("\n");
      out.write("                        Email:<input type=\"text\" class=\"notfloated\" name=\"email\"/><br/><br/>\n");
      out.write("            Password:<input type=\"password\" class=\"notfloated\" name=\"password\"/><br/><br/>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            <br/><br/>\n");
      out.write("            <input type=\"submit\" class=\"floated\" name=\"register\" value=\"register\"/>\n");
      out.write("            <button class=\"floated\" onclick=\"location.href='login.jsp'\">Login</button\n");
      out.write("                    </fieldset>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"rightbody\"></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
