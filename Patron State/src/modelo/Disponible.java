package modelo;

public class Disponible extends EstadoBoleto {
	
	public EstadoBoleto dejarDisponible() {
		try {
			throw new Exception("Error,esta butaca ya est� disponible");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public EstadoBoleto reservar(Cliente cliente) {
		Reservada ocupada = new Reservada();
		ocupada.setCliente(cliente);
		return ocupada;
	}
	
	public EstadoBoleto confirmar() {
		try {
			throw new Exception("Error, no tiene una butaca seleccionada");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this;
	}

}
