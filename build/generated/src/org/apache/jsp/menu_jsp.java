package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    HttpSession sesion = request.getSession();
     if (sesion.getAttribute("usuario")==null)
     {
     response.sendRedirect("login.jsp");
     }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar navbar navbar-dark bg-dark\">\n");
      out.write("          <nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("         <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("        <img src=\"imagen/user.png\" width=\"30\" height=\"30\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" \n");
      out.write("          aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"menu.jsp\">Inicio </a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Empleado\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"empleado.jsp\">Nuevo</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"upEmpleado.jsp\">Modificacion</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"srvListaEmpleado\">Eliminacion</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">....</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      ");

          if (sesion.getAttribute("perfil").equals("Administrador"))
          {
      
      out.write("\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            Usuario\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Nuevo</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Modificacion</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Eliminacion</a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">...</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      ");

          }
      
      out.write("\n");
      out.write("       <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("\n");
      out.write("          Reportes\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("          <a class=\"dropdown-item\" href=\"reportes.jsp\">Empleados</a>\n");
      out.write("\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">..</a>\n");
      out.write("\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">..</a>\n");
      out.write("\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">...</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("      <form class=\"form-inline my-2 my-lg-0\" method=\"POST\">\n");
      out.write("       <a href=\"login.jsp?cerrar=true\" button type=\"button\" class=\"btn btn-outline-success\">Close</a>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("         <script src=\"js/jquery-3.3.1.slim.min.js\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
