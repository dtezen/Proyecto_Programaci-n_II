package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"MobileOptimized\" content=\"width\" />\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("\t<title>Inicio de Sesión</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href='styles/login.css' type=\"text/css\">\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container h-100\">\n");
      out.write("\t\t<div class=\"d-flex justify-content-center h-100\">\n");
      out.write("\t\t\t<div class=\"user_card\">\n");
      out.write("                            \n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t<div class=\"brand_logo_container\">\n");
      out.write("\t\t\t\t\t\t<img src=\"imagen/user.png\" class=\"brand_logo\" alt=\"Logo\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center form_container\">\n");
      out.write("\t\t\t\t\t<form action=\"srvLogin\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group-append\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"txtUsuario\" class=\"form-control input_user\" value=\"\" placeholder=\"Usuario\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group mb-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group-append\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"txtPassword\" class=\"form-control input_pass\" value=\"\" placeholder=\"Contraseña\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"d-flex justify-content-center mt-3 login_container\">\n");
      out.write("\t\t\t\t \t<button type=\"submit\" name=\"btnValidar\" class=\"btn login_btn\">Validar</button>\n");
      out.write("\t\t\t\t   </div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    \n");
      out.write("        ");

            HttpSession sesion = request.getSession();
               
            if (request.getAttribute("respuesta")!= null)
            {
                Boolean encontrado;
                String perfil="";
                encontrado = (Boolean) request.getAttribute("respuesta");
                perfil = (String) request.getAttribute("perfil");
                if(encontrado)
                {
                sesion.setAttribute("usuario", request.getAttribute("usuario"));
                sesion.setAttribute("perfil", request.getAttribute("perfil"));
                response.sendRedirect("menu.jsp");
                }
                else
                {
        
      out.write("\n");
      out.write("                    <script> swal ( \"Credenciales Inválidas.\" ,  \"Si olvidó su contraseña, contacte al administrador.\" ,  \"error\" );</script>\n");
      out.write("        ");

                }
            }

             if (request.getParameter("cerrar")!=null)
             {
              session.invalidate();
             }
        
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
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
