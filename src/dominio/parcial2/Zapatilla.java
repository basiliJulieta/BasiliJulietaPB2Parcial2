package dominio.parcial2;

public class Zapatilla extends Producto implements Indumentaria {
	
	private String talle;
	private String color;
	
	public Zapatilla(Integer codigo, String descripcion,String talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle=talle;
		this.color=color;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getTalle() {
		// TODO Auto-generated method stub
		return this.talle;
	}
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	
}
