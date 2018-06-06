<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="datos.Cliente" %>
    <%@page import="datos.Prestamo" %>
    <%@page import="datos.Cuota" %>
<%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema Francés</title>
</head>
<body>
<%@ include file="/cabecera.jsp" %>
 <%Cliente cliente=(Cliente)request.getAttribute("cliente"); %> 
 <BR>
   Apellido: <%=cliente.getApellido() %> <BR>
   Nombre : <%=cliente.getNombre() %> <BR>
   DNI : <%=cliente.getDni() %> <BR>
   ID : <%=cliente.getIdCliente() %><BR>
   
 <%   for(Prestamo p : cliente.getPrestamos()){%>
     Id Prestamo: <%= p.getIdPrestamo()%>  
          <% for (Cuota c : p.getCuotas()){  %>
          Numero cuota : <%=c.getNroCuota() %><BR>
          Monto : <%=c.getCuota() %><BR>
        <%  } %>                            
         
         <BR>
  <% } %>
   <BR>

<A href="/SistemaFrances/index.jsp">Volver..</A>
</body>
</html>