package datos;

public class ObjetoCeleste {
	
	private int idObjetoCeleste;
    private String objetoCeleste;
    private String tipo;
    private String clase;
    private float magnitud;
    private String constelacion;
    private float ascensionRecta;
    private float declinacion;
	
    public ObjetoCeleste() {}
    
    
    protected void setIdObjetoCeleste(int idObjetoCeleste) {
    	this.idObjetoCeleste = idObjetoCeleste;
    }
    
    public int getIdObjetoCeleste() {
    	return idObjetoCeleste;
    }
    
    public String getObjetoCeleste() {
		return objetoCeleste;
	}
	public void setObjetoCeleste(String objetoCeleste) {
		this.objetoCeleste = objetoCeleste;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public float getMagnitud() {
		return magnitud;
	}
	public void setMagnitud(float magnitud) {
		this.magnitud = magnitud;
	}
	public String getConstelacion() {
		return constelacion;
	}
	public void setConstelacion(String constelacion) {
		this.constelacion = constelacion;
	}
	public float getAscensionRecta() {
		return ascensionRecta;
	}
	public void setAscensionRecta(float ascensionRecta) {
		this.ascensionRecta = ascensionRecta;
	}
	public float getDeclinacion() {
		return declinacion;
	}
	public void setDeclinacion(float declinacion) {
		this.declinacion = declinacion;
	}
	
	public float calcularDeltaAr(ObjetoCeleste objetoCeleste) {
		return Math.abs(this.ascensionRecta-objetoCeleste.getAscensionRecta());
	}
	
	public float calcularDeltaDec(ObjetoCeleste objetoCeleste) {
		return Math.abs(this.declinacion-objetoCeleste.getDeclinacion());
	}
	



	@Override
	public String toString() {
		return "ObjetoCeleste [idObjetoCeleste=" + idObjetoCeleste + ", objetoCeleste=" + objetoCeleste + ", tipo="
				+ tipo + ", clase=" + clase + ", magnitud=" + magnitud + ", constelacion=" + constelacion
				+ ", ascensionRecta=" + ascensionRecta + ", declinacion=" + declinacion + "]";
	}
	
	
    
    
}
