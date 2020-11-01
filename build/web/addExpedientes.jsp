<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="MobileOptimized" content="width" />
        <title>Agregar Expediente</title>
        <link rel="stylesheet" href="https://bootswatch.com/4/materia/bootstrap.min.css">
        <link rel="stylesheet" href='styles/tables.css' type="text/css">
    </head>
    <body>
        <center>
            <div>
                <h3> Agregar Expediente </h3>
            </div>
            <div>
                <form action="srvExpedientes" method="POST">
                    ID:
                    <input type="text" name="txtid"><br>
                    TIPO DE EXPEDIENTE:
                    <input type="text" name="txttipo"><br>
                    FLUJO
                    <input type="text" name="txtflujo"><br>
                    DEPENDENCIA:
                    <input type="text" name="txtdependencia"><br>
                    FECHA:
                    <input type="text" name="txtfecha"><br>
                    ESTADO:
                    <input type="text" name="txtestado"><br><br>
                    <input type="submit" name="action" value="Guardar">
                </form>
            </div>
        </center>
    </body>
</html>
