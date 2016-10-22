<%-- 
    Document   : empleados
    Created on : 23/02/2016, 08:00:12 AM
    Author     : esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="ConsultaEmpleados">INFORMES</a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="ConsultaEmpleados">EMPLEADOS</a></li>
                    <li class="active"><a href="empleados.jsp">REPORTES</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <form action="Reporte" method="POST">
                <div class="form-group">
                Nombre:&nbsp;<input class="form-control" type="text" placeholder="Nombre" name="Name"><br/>
                Apellido:&nbsp;<input class="form-control" type="text" placeholder="Apellido" name="LastName"><br/>
                </div>
                <div class="form-group">
                Rango de edad:&nbsp;<input class="form-control-static" type="number" placeholder="Edad" name="RangAge1">
                &nbsp;<input class="form-control-static" type="number" placeholder="Edad" name="RangAge2"><br/>
                Cargo:&nbsp;
                <select name="Cargo">
                    <option value="" selected="selected">- selecciona -</option>
                    <option value="windows">JefeBodega</option>
                    <option value="mac">Administrador</option>
                    <option value="linux">Secretaria</option>
                    <option value="otro">Otro</option>
                </select><br/>
                </div>
                <div class="form-group">
                Rango de Fecha de Nacimiento:&nbsp;<input type="date" name="DateNac1">&nbsp;<input type="date" name="DateNac2"><br/>
                Rango de Fecha de Ingreso: &nbsp;<input type="date" name="DateIng1"> &nbsp;<input type="date" name="DateIng2">
                </div>
                
                <input type="submit" name="buscar" value="Reporte PDF">
            </form>   
        </div>
    </body>
</html>
