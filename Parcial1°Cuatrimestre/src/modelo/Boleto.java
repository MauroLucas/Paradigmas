package modelo;

public class Boleto {
	private Butaca butaca;
	private double precio;
	
	public Boleto(Butaca butaca,double precio) {
		this.butaca=butaca;
		this.precio=precio;
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
