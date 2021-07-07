package dominio.parcial2;

public class Venta {
	
	private Integer numero;
	private Integer dni;
	private String nombre;
	private Double importe;
	public Venta(Integer dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getImporte() {
		// TODO Auto-generated method stub
		return this.importe;
	}
	
	
	

}
