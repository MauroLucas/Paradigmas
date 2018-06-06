package datos;

public class Observador {
	
	private int idObservador;
	private String observador;
	private String institucion;
	
	public Observador() {}

	public Observador(String observador, String institucion) {
		super();
		this.observador = observador;
		this.institucion = institucion;
	}
    
	protected void setIdObservador(int idObservador) {
		this.idObservador = idObservador;
	}
	
	public int getIdObservador() {
		return idObservador;
	}

	public String getObservador() {
		return observador;
	}

	public void setObservador(String observador) {
		this.observador = observador;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	@Override
	public String toString() {
		return "Observador [idObservador=" + idObservador + ", observador=" + observador + ", institucion="
				+ institucion + "]";
	}
	
	
	
}
