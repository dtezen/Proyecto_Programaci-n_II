<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!DOCTYPE html>
<meta charset="UTF-8">
<meta name="MobileOptimized" content="width" />
<html>
    
<head>
	<title>Inicio de Sesión</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
        <link rel="stylesheet" href='styles/login.css' type="text/css">
</head>

<body>
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
                            
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<img src="imagen/user.png" class="brand_logo" alt="Logo">
					</div>
				</div>
				<div class="d-flex justify-content-center form_container">
					<form action="srvLogin" method="POST">
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" name="txtUsuario" class="form-control input_user" value="" placeholder="Usuario">
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="txtPassword" class="form-control input_pass" value="" placeholder="Contraseña">
						</div>
							<div class="d-flex justify-content-center mt-3 login_container">
				 	<button type="submit" name="btnValidar" class="btn login_btn">Validar</button>
				   </div>
					</form>
				</div>
			</div>
		</div>
	</div>
    
        <%
            if (request.getAttribute("respuesta")!= null)
            {
                Boolean encontrado;
                String perfil="";
                encontrado = (Boolean) request.getAttribute("respuesta");
                perfil = (String) request.getAttribute("perfil");
                if(encontrado)
                {
        %>
         <script>alert("Acceso Correcto "+"<%=perfil%>");</script>
        <%
                }
                else
                {
        %>
                 <script>alert("Credenciales Incorrectas.");</script>
        <%
                }
            }
        %>
    
</body>
</html>