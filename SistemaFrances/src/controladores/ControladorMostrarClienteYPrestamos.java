package controladores;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.ClienteABM;
import datos.Cliente;
public class ControladorMostrarClienteYPrestamos extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		procesarPeticion(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		procesarPeticion(request, response);
	}
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html);charser=UTF-8");
		try {
			int dni = Integer.parseInt(request.getParameter("dni"));
			ClienteABM clienteabm = new ClienteABM();
			Cliente cliente=clienteabm.traerClientePrestamosYCuotas((dni));
			request.setAttribute("cliente", cliente);
			request.getRequestDispatcher("/vistaclienteyprestamos.jsp").forward(request, response);
		}catch(Exception e) {
			response.sendError(500, "EL DNI Ingresado no existe en la base de datos");
		}

}
}
