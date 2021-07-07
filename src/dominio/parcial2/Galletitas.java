package dominio.parcial2;

public class Galletitas extends Producto implements Comestible{
	
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	
	public Galletitas(Integer codigo, String descripcion,String fechaDeElaboracion, String fechaDeVencimiento, String marca,
			Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaDeElaboracion= fechaDeElaboracion;
		this.fechaDeVencimiento= fechaDeVencimiento;
		// TODO Auto-generated constructor stub
	}
	

	public String getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaDeElaboracion;
	}

	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaDeVencimiento;
	}
	

	

}
