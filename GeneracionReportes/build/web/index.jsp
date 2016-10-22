<%-- 
    Document   : index
    Created on : 23/02/2016, 07:53:10 AM
    Author     : esteban
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%ArrayList<Empleados> em = (ArrayList<Empleados>) session.getAttribute("empleados");%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
    </head>
    <body>


        <!--Barra de navegación-->


        <nav class="navbar navbar-inverse">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="ConsultaEmpleados">INFORMES</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="ConsultaEmpleados">EMPLEADOS</a></li>
                    <li><a href="empleados.jsp">REPORTES</a></li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <h1 class="h1 text-center text-info">TABLA EMPLEADOS</h1>
            <br>
            <br>
            <table class=" table table-responsive">
                <thead>
                <th>NOMBRE</th>
                <th>APELLIDO</th>
                <th>EDAD</th>
                <th>SEXO</th>
                <th>CARGO</th>
                <th>FECHA DE NACIMIENTO</th>
                <th>FECHA DE INGRESO</th>
                <th class="text-center">OPCIONES</th>
                </thead>
                <tbody>
                    <%for (Empleados e : em) {%>
                    <tr>
                        <td> <%= e.getNombre()%> </td>
                        <td> <%= e.getApellido()%> </td>
                        <td> <%= e.getEdad()%> </td>
                        <td> <%= e.getSexo()%> </td>
                        <td> <%= e.getCargo()%> </td>
                        <td> <%= e.getFechaNacimiento()%> </td>
                        <td> <%= e.getFechaIngreso()%> </td>
                        <td>
                           
                        </td>
                    </tr>   
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

