package modelo;

public class Boleto {
	
	private Butaca butaca;
	private EstadoBoleto estado;
	
	public Boleto(Butaca butaca) {
		this.butaca = butaca;
		this.estado = new Disponible();
	}
	
	public void cancelarCompra() {
		this.setEstado(this.getEstado().dejarDisponible());
	}
	
	public void reservarButaca(Cliente cliente) {
		this.setEstado(this.getEstado().reservar(cliente));
	}
	
	public void confirmar() {
		this.setEstado(this.getEstado().confirmar());
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	public EstadoBoleto getEstado() {
		return estado;
	}

	public void setEstado(EstadoBoleto estado) {
		this.estado = estado;
	}
	
	

}
