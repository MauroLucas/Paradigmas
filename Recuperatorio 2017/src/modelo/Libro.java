package modelo;

public class Libro {
	
	private int idLibro;
	private String isbn;
	private String titulo;
	private String autores;
	private String editorial;
	private double precio;
	public Libro() {};
	public Libro(int idLibro, String isbn, String titulo, String autores, String editorial, double precio)throws Exception {
		super();
		this.idLibro = idLibro;
		this.setIsbn(isbn);
		this.titulo = titulo;
		this.autores = autores;
		this.editorial = editorial;
		this.precio = precio;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn)throws Exception {
		if(this.esValidoISBN(isbn)==false)throw new Exception("ISBN incorrecto");
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean esValidoISBN(String isbn) {
		boolean resultado = false;
		int sumaCifras=0;
		int digitoControl=0;
		if(isbn.length()==13 && Funciones.esCadenaNros(isbn)==true) {
			for(int i=0;i<12;i++) {
				if(Funciones.esPar(i+1)==true) {
					sumaCifras += Integer.parseInt(isbn.substring(i, i+1)) * 3;
				}
				else {
					 sumaCifras += Integer.parseInt(isbn.substring(i, i+1));
				}
			}
			
			while(sumaCifras%10!=0) {
				digitoControl += 1;
				sumaCifras += 1;
			}
			if(digitoControl==Integer.parseInt(isbn.substring(12,13))) {
				resultado = true;
			}
		}
		
	  return resultado;
	}
	
	public String formatear() {
		String resultado = new String();
		resultado = this.isbn.substring(0,3) + "-" + this.isbn.substring(3,5) + "-" + this.isbn.substring(5,10) +"-" + this.isbn.substring(10,12) + "-" + this.isbn.substring(12,13);
		return resultado;
	}
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", isbn=" + isbn + ", titulo=" + titulo + ", autores=" + autores
				+ ", editorial=" + editorial + ", precio=" + precio + "]";
	}
	
	public boolean equals(Libro libro) {
		boolean iguales=false;
		if(libro.getIdLibro()==this.idLibro) {
			iguales=true;
		}
		return iguales;
	}
	
	

}
