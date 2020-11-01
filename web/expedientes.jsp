<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="MobileOptimized" content="width" />
        <title>Expedientes</title>
    <link rel="stylesheet" href="https://bootswatch.com/4/materia/bootstrap.min.css">
    <link rel="stylesheet" href='styles/tables.css' type="text/css">
    </head>
    <body>
        <center>
            <div>
                <h3>Expedientes</h3>
                <form action="srvExpedientes" method="POST">
                    <input type="submit" name="action" value="Listar">
                    <input type="submit" name="action" value="Nuevo">
                </form>
            </div>
            <div>
                <table border="1">
                    <thead>
                        <th>ID</th>
                        <th>Tipo de Expediente</th>
                        <th>Flujo</th>
                        <th>Dependencia</th>
                        <th>Fecha</th>
                        <th>Estado del Expediente</th>
                        <th>Acciones</th>
                    </thead>
                    <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getId()}</td>
                            <td>${dato.getTipo()}</td>
                            <td>${dato.getFlujo()}</td>
                            <td>${dato.getDependencia()}</td>
                            <td>${dato.getFecha()}</td>
                            <td>${dato.getEstado()}</td>
                            <td>
                                <form action="srvExpedientes" method="POST">
                                    <input type="hidden" name="id" value="${dato.getId()}">
                                    <input type="submit" name="action" value="Editar">
                                    <input type="submit" name="action" value="Delete">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </center>
    <form action="menu.jsp">
    <center><input type="submit" name="action" value="Inicio"></center>
    </form>
    </body>
</html>
