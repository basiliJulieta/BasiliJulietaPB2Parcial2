package dominio.parcial2;

public class Producto {
	
	private Integer codigo;
	private String descripcion;
	private String marca;
	private Double precio;
	private Integer garantia;
	private String talle;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	
	public Producto(Integer codigo, String descripcion, String marca, Double precio) {
		super();
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public String getTalle() {
		// TODO Auto-generated method stub
		return this.talle;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return this.talle;
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
