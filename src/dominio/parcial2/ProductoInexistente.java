package dominio.parcial2;

public class ProductoInexistente extends Exception {
	
	public ProductoInexistente(){
		super("El producto no existe");
	}
}
