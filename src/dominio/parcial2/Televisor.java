package dominio.parcial2;

public class Televisor extends Producto implements Electrodomestico {
	
	public Integer pulgadas;
	public Integer garantia;

	public Televisor(Integer codigo, String descripcion,Integer pulgadas, Integer garantia, String marca,
			Double precio) {
		super(codigo, descripcion, marca, precio);
		this.pulgadas=pulgadas;
		this.garantia=garantia;
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}


	public Integer getPulgadas() {
		return pulgadas;
	}


	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	
	
	
	
	
}
