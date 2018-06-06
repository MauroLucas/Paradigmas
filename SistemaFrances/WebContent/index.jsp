<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema Francés - Cliente</title>
</head>
<body>
<%@ include file="/cabecera.jsp" %>
<FORM method="POST" action="/SistemaFrances/MostrarClienteJSP">
Búsqueda de clientes <BR><BR>
<TABLE border="0">
 <TR>
  <TD>DNI:</TD>
  <TD><INPUT name="dni"></TD>
  </TR>
  <TR>
  <TD>
   <INPUT type="submit" value="Consultar">
   </TD>
   </TR>
</TABLE>
</FORM>
<BR><BR><BR><BR>

<FORM method="POST" action="/SistemaFrances/ListarClientes">
<input type="hidden" name="jstl" value="0"/>
 <TABLE border="0">
  <TR>
   <TD>
    <INPUT type="submit" value="Listar Clientes">
    </TD>
    </TR>
 </TABLE>
</FORM>

<BR> <BR> <BR> <BR>
<FORM method="POST" action="/SistemaFrances/MostrarClienteYPrestamos">
Búsqueda de clientes y prestamos <BR><BR>
<TABLE border="0">
 <TR>
  <TD>DNI:</TD>
  <TD><INPUT name="dni"></TD>
  </TR>
  <TR>
  <TD>
   <INPUT type="submit" value="Consultar">
   </TD>
   </TR>
</TABLE>
</FORM>


<BR> <BR> <BR> <BR>
<FORM method="POST" action="/SistemaFrances/ListarClientes">
 <input type="hidden" name="jstl" value="1" />
  <TABLE border="0">
   <TR>
   <TD>
    <INPUT type="submit" value="Listar Clientes con JSTL">
    </TD>
    </TR>
  </TABLE>
</FORM>
</body>
</html>