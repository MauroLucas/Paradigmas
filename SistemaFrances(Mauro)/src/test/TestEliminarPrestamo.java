package test;
import negocio.PrestamoABM;
public class TestEliminarPrestamo {

	public static void main(String[] args) {
		PrestamoABM abm = new PrestamoABM();
		abm.eliminar(abm.traerPrestamo((long)8));

	}

}
