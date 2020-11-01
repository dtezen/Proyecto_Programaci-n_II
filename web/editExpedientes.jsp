<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="MobileOptimized" content="width" />
        <title>Editar Expediente</title>
        <link rel="stylesheet" href="https://bootswatch.com/4/materia/bootstrap.min.css">
        <link rel="stylesheet" href='styles/tables.css' type="text/css">
    </head>
    <body>
        <center>
            <div>
                <h3> Actualizar Expediente </h3>
        </div>
            <div>
                <form action="srvExpedientes" method="POST">
                    ID:
                    <input type="text" name="txtid" value="${persona.getId()}"><br>
                    TIPO DE EXPEDIENTE:
                    <input type="text" name="txtpuesto" value="${persona.getTipo()}"><br>
                    FLUJO:
                    <input type="text" name="txtnombre" value="${persona.getFlujo()}"><br>
                    DEPENDENCIA:
                    <input type="text" name="txtdireccion" value="${persona.getDependencia()}"><br>
                    FECHA:
                    <input type="text" name="txttelefono" value="${persona.getFecha()}"><br>
                    ESTADO:
                    <input type="text" name="txtemail" value="${persona.getEstado()}"><br><br>
                    <input type="submit" name="action" value="Actualizar">
                </form>
            </div>
        </center>
    </body>
</html>
