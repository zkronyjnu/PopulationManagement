package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <a href=\"#\">Home</a>\n");
      out.write("            <a href=\"#\">Search Your ID</a>\n");
      out.write("            <a href=\"#\">Category</a>\n");
      out.write("            <a href=\"#\">Contact Us</a>\n");
      out.write("            <a href=\"index.jsp\">Log out</a>\n");
      out.write("            \n");
      out.write("        <div id=\"mainpart\">\n");
      out.write("            <div id=\"leftbody\"></div>\n");
      out.write("            <div id=\"centerebody\">\n");
      out.write("                <img src=\"/content/images/aasd.JPG\" alt=\"Bangladesh\" usemap=\"#Map\">\n");
      out.write("\n");
      out.write("                <map name=\"Map\" id=\"Map\">\n");
      out.write("                    <area alt=\"\" title=\"\" href=\"otherpages/dhaka.jsp\" shape=\"circle\" coords=\"222,306,14\" />\n");
      out.write("                    \n");
      out.write("                    <area alt=\"\" title=\"\" href=\"otherpages/syllhet.jsp\" shape=\"circle\" coords=\"365,194,7\" />\n");
      out.write("                    <area alt=\"\" title=\"\" href=\"otherpages/khulna.jsp\" shape=\"circle\" coords=\"134,402,12\" />\n");
      out.write("                    <area alt=\"\" title=\"\" href=\"otherpages/chitagong.jsp\" shape=\"circle\" coords=\"366,447,11\" />\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </map>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"rightbody\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">&copy;zkrony</div>\n");
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
