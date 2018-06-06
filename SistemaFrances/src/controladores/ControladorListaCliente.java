package controladores;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.ClienteABM;
import datos.Cliente;
public class ControladorListaCliente extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		procesarPeticion(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		procesarPeticion(request, response);
	}
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	int jstl = Integer.parseInt(request.getParameter("jstl"));
	try {
		ClienteABM clienteabm = new ClienteABM();
		List<Cliente> clientes = clienteabm.traerCliente();
		request.setAttribute("clientes", clientes);
		if(jstl==0) {
			request.getRequestDispatcher("/vistaclientes.jsp").forward(request,response);
		}else {
			request.getRequestDispatcher("/vistaclientesjstl.jsp").forward(request, response);
		}
	
		
	}catch(Exception e) {
		response.sendError(500,"Hubo un problema al traer el listado de clientes");
	}
  }

}
