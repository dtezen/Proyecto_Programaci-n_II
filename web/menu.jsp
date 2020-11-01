<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<%
    HttpSession sesion = request.getSession();
     if (sesion.getAttribute("usuario")==null)
     {
     response.sendRedirect("login.jsp");
     }
%>


<!DOCTYPE html>
<meta name="MobileOptimized" content="width" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Principal</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href='styles/tables.css' type="text/css">
        
    </head>
    
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Gestión de Expedientes</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <%
                if (sesion.getAttribute("perfil").equals("Administrador"))
                {
            %>
            <li class="nav-item">
              <a class="nav-link" href="empleados.jsp">Empleados</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="empresa.jsp">Empresas</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="uadmin.jsp">Unidades Administrativas</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="dependencias.jsp">Dependencias</a>
            </li>
            <%
                }
                if ((sesion.getAttribute("perfil").equals("Administrador")) || (sesion.getAttribute("perfil").equals("Consulta")) )
                {
            %>
            <li class="nav-item">
              <a class="nav-link" href="expedientes.jsp">Expedientes</a>
            </li>
            <%
                }
            %>
            <li class="nav-item">
              <a class="nav-link" href="#">Reportería</a>
            </li>
          </ul>
          <form class="form-inline my-2 my-lg-0" method="POST">
            <a href="login.jsp?cerrar=true" button type="button" class="btn btn-outline-success">Cerrar Sesión</a>
          </form>
        </div>
        </nav>
            
            <center>
                <h1>¡Bienvenido!</h1>
                <img src="imagen/user.png" class="brand_logo" alt="Logo">
            </center>
    </body>
</html>

