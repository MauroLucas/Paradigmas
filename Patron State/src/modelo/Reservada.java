package modelo;

public class Reservada extends EstadoBoleto {
	
	public EstadoBoleto dejarDisponible() {
		return new Disponible();
	}
	
	public EstadoBoleto reservar(Cliente cliente) {
		try {
			throw new Exception("Error, esta butaca ya está reservada");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public EstadoBoleto confirmar() {
		return new Confirmada();
	}

}
