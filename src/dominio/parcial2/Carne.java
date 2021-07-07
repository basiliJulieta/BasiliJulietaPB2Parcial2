package dominio.parcial2;

public class Carne extends Producto implements Comestible {

	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double kilos;
	
	public Carne(Integer codigo, String descripcion,String fechaDeElaboracion, String fechaDeVencimiento, Double kilos, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaDeElaboracion= fechaDeElaboracion;
		this.fechaDeVencimiento= fechaDeVencimiento;
		this.kilos=kilos;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Double getKilos() {
		return kilos;
	}



	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}


	@Override
	public String getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaDeElaboracion;
	}
	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaDeVencimiento;
	}
	
	

}
