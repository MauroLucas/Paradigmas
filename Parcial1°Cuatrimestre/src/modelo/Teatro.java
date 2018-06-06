package modelo;

public class Teatro {
	
	private String lugar;
	private int cantidadFilas;
	private int cantidadColumnas;
	private Butaca butacas[][];
	public Teatro(String lugar, int cantidadFilas, int cantidadColumnas) {
		super();
		this.lugar = lugar;
		this.cantidadFilas = cantidadFilas;
		this.cantidadColumnas = cantidadColumnas;
		this.butacas = new Butaca[this.cantidadFilas][this.cantidadColumnas];
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getCantidadFilas() {
		return cantidadFilas;
	}
	public void setCantidadFilas(int cantidadFilas) {
		this.cantidadFilas = cantidadFilas;
	}
	public int getCantidadColumnas() {
		return cantidadColumnas;
	}
	public void setCantidadColumnas(int cantidadColumnas) {
		this.cantidadColumnas = cantidadColumnas;
	}
	public Butaca[][] getButacas() {
		return butacas;
	}
	
	public Butaca traerButaca(int fila,int columna) {
		return butacas[fila][columna];
	}
	public void setButacas() {
		for(int i=0;i<cantidadFilas;i++) {
			for(int j=0;j<cantidadColumnas;j++) {
				butacas[i][j] = new Butaca(i,j);
			}
		}
	}
	
	

}
