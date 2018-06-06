package modelo;

public class Contribuyente extends Persona {
	
	private boolean esExcento;

	public Contribuyente(int idPersona, String apellido, String nombres, int dni, boolean excento) {
		super(idPersona, apellido, nombres, dni);
		this.esExcento = excento;
	}

	public boolean isEsExcento() {
		return esExcento;
	}

	public void setEsExcento(boolean esExcento) {
		this.esExcento = esExcento;
	}

	@Override
	public String toString() {
		return "Contribuyente [esExcento=" + this.esExcento + " " + super.toString() + "]";
	}

	

	

	
	

}
