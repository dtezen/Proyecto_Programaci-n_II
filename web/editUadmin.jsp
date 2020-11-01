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
        <title>Modificar Unidad Administrativa</title>
        <link rel="stylesheet" href="https://bootswatch.com/4/materia/bootstrap.min.css">
        <link rel="stylesheet" href='styles/tables.css' type="text/css">
    </head>
    <body>
        <center>
            <div>
                <h3> Modificar Unidad Administrativa </h3>
            </div>
            <div>
                <form action="srvUadmin" method="POST">
                    ID:
                    <input type="text" name="txtid" value="${persona.getId()}"><br>
                    EMPRESA:
                    <input type="text" name="txtempresa" value="${persona.getEmpresa()}"><br>
                    UNIDAD ADMINISTRATIVA:
                    <input type="text" name="txtnombre" value="${persona.getNom()}"><br>
                    DESCRIPCIÓN:
                    <input type="text" name="txtdescripcion" value="${persona.getDescripcion()}"><br>
                    TELEFONO:
                    <input type="text" name="txttelefono" value="${persona.getTel()}"><br>
                    EMAIL:
                    <input type="email" name="txtemail" value="${persona.getEmail()}"><br><br>
                    <input type="submit" name="action" value="Actualizar">
                </form>
            </div>
        </center>
    </body>
</html>
