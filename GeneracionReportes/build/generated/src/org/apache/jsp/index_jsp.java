package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.Empleados;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
ArrayList<Empleados> em = (ArrayList<Empleados>) session.getAttribute("empleados");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Barra de navegación-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"ConsultaEmpleados\">INFORMES</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"ConsultaEmpleados\">EMPLEADOS</a></li>\n");
      out.write("                    <li><a href=\"empleados.jsp\">REPORTES</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"h1 text-center text-info\">TABLA EMPLEADOS</h1>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table class=\" table table-responsive\">\n");
      out.write("                <thead>\n");
      out.write("                <th>NOMBRE</th>\n");
      out.write("                <th>APELLIDO</th>\n");
      out.write("                <th>EDAD</th>\n");
      out.write("                <th>SEXO</th>\n");
      out.write("                <th>CARGO</th>\n");
      out.write("                <th>FECHA DE NACIMIENTO</th>\n");
      out.write("                <th>FECHA DE INGRESO</th>\n");
      out.write("                <th class=\"text-center\">OPCIONES</th>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (Empleados e : em) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ");
      out.print( e.getNombre());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getApellido());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getEdad());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getSexo());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getCargo());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getFechaNacimiento());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getFechaIngreso());
      out.write(" </td>\n");
      out.write("                        <td>\n");
      out.write("                           \n");
      out.write("                        </td>\n");
      out.write("                    </tr>   \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
