package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/history.css\">-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("       \n");
      out.write("        <div class=\"container rounded mt-5 bg-white p-md-5\">\n");
      out.write("    <div class=\"h2 font-weight-bold\">Meetings</div>\n");
      out.write("    <div class=\"table-responsive\">\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">Name</th>\n");
      out.write("                    <th scope=\"col\">Date</th>\n");
      out.write("                    <th scope=\"col\">Time</th>\n");
      out.write("                    <th scope=\"col\">View</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <form action=\"MainController\">\n");
      out.write("                <tr class=\"bg-blue\">\n");
      out.write("                    <td class=\"pt-2\"> \n");
      out.write("<!--                        <img src=\"https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500\" class=\"rounded-circle\" alt=\"\">-->\n");
      out.write("                        <div class=\"pl-lg-5 pl-md-3 pl-1 name\">Emilia Kollette</div>\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"pt-3 mt-1\">25 Sep 2020</td>\n");
      out.write("                    <td class=\"pt-3\">11:00 AM</td>\n");
      out.write("                    \n");
      out.write("                    <td class=\"pt-3\"><button  type=\"submit\" class=\"fa fa-ellipsis-v btn\" name=\"btAction\" value=\"view detail\"></button></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr id=\"spacing-row\">\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>   \n");
      out.write("            </form>    \n");
      out.write("                            \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
