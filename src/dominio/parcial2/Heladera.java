package dominio.parcial2;

public class Heladera extends Producto implements Electrodomestico {
	
	private Boolean isNoFrost;
	private Integer garantia;
	
	public Heladera(Integer codigo, String descripcion,Boolean isNoFrost,Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.isNoFrost=isNoFrost;
	}

	public Boolean isNoFrost() {
		return isNoFrost;
	}

	public void setIsNoFrost(Boolean isNoFrost) {
		this.isNoFrost = isNoFrost;
	}
	
	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}
	
	
	
	

	
}
