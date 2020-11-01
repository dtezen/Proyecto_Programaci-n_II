<%-- 
    Document   : addUser
    Created on : Oct 31, 2020, 7:39:01 PM
    Author     : Dennys Tezén
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="MobileOptimized" content="width" />
        <title>Agregar Empresa</title>
        <link rel="stylesheet" href="https://bootswatch.com/4/materia/bootstrap.min.css">
        <link rel="stylesheet" href='styles/tables.css' type="text/css">
    </head>
    <body>
        <center>
            <div>
                <h3> Agregar Empresa </h3>
            </div>
            <div>
                <form action="srvEmpresa" method="POST">
                    ID:
                    <input type="text" name="txtid"><br>
                    NOMBRE:
                    <input type="text" name="txtnombre"><br>
                    DIRECCION:
                    <input type="text" name="txtdireccion"><br>
                    TELEFONO:
                    <input type="text" name="txttelefono"><br>
                    EMAIL:
                    <input type="email" name="txtemail"><br><br>
                    <input type="submit" name="action" value="Guardar">
                </form>
            </div>
        </center>
    </body>
</html>
