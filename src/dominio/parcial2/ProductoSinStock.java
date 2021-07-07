package dominio.parcial2;

public class ProductoSinStock extends Exception{
	
	public ProductoSinStock(){
		super("No hay Stock");
	}

}
