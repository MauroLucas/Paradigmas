package modelo;

public class Butaca {
	
	private int fila;
	private int columna;
	public Butaca(int fila, int columna) {
		super();
		this.fila = fila;
		this.columna = columna;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	public boolean equals(Butaca butaca) {
		boolean igual=false;
		if(butaca.getColumna()==this.columna && butaca.getFila()==this.fila) {
			igual=true;
		}
		return igual;
	}
	
	
}
