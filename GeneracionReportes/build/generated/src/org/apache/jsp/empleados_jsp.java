package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class empleados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Empleados</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"ConsultaEmpleados\">INFORMES</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"ConsultaEmpleados\">EMPLEADOS</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"empleados.jsp\">REPORTES</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"Reporte\" method=\"POST\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                Nombre:&nbsp;<input class=\"form-control\" type=\"text\" placeholder=\"Nombre\" name=\"Name\"><br/>\n");
      out.write("                Apellido:&nbsp;<input class=\"form-control\" type=\"text\" placeholder=\"Apellido\" name=\"LastName\"><br/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                Rango de edad:&nbsp;<input class=\"form-control-static\" type=\"number\" placeholder=\"Edad\" name=\"RangAge1\">\n");
      out.write("                &nbsp;<input class=\"form-control-static\" type=\"number\" placeholder=\"Edad\" name=\"RangAge2\"><br/>\n");
      out.write("                Cargo:&nbsp;\n");
      out.write("                <select name=\"Cargo\">\n");
      out.write("                    <option value=\"\" selected=\"selected\">- selecciona -</option>\n");
      out.write("                    <option value=\"windows\">JefeBodega</option>\n");
      out.write("                    <option value=\"mac\">Administrador</option>\n");
      out.write("                    <option value=\"linux\">Secretaria</option>\n");
      out.write("                    <option value=\"otro\">Otro</option>\n");
      out.write("                </select><br/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                Rango de Fecha de Nacimiento:&nbsp;<input type=\"date\" name=\"DateNac1\">&nbsp;<input type=\"date\" name=\"DateNac2\"><br/>\n");
      out.write("                Rango de Fecha de Ingreso: &nbsp;<input type=\"date\" name=\"DateIng1\"> &nbsp;<input type=\"date\" name=\"DateIng2\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" name=\"buscar\" value=\"Reporte PDF\">\n");
      out.write("            </form>   \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
