package modelo;

public class Confirmada extends EstadoBoleto {
	
	public EstadoBoleto dejarDisponible() {
		try {
			throw new Exception("Error,esta butaca ya está confirmada");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public EstadoBoleto reservar(Cliente cliente) {
		try {
			throw new Exception("Error,esta butaca ya está confirmada");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public EstadoBoleto confirmar() {
		try {
			throw new Exception("Error,esta butaca ya está confirmada");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this;
	}

}
