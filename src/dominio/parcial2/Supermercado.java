package dominio.parcial2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	
	public Supermercado(String nombre) {
		// Constructor de la clase
		this.nombre=nombre;
	}

	public Boolean ingresarProducto(Producto nuevo) {
		
		return this.productosDisponibles.add(nuevo);
		
		if(!this.productosExistentes.contains(nuevo)) {
			this.productosExistentes.add(nuevo);
		}
		// Ingresa un nuevo producto		
	}

	public Set<Producto> getOfertaDeProductos() {
		return this.productosExistentes;
		// Devuelve el conjunto de productos que se comercializan
	}
	
	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
	}
	
	private Producto productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		
		for(Producto producto : productosExistentes){
			if(producto.getCodigo().equals(codigoDeProducto)){
				return producto;
			}
		}
		
		throw new ProductoInexistente();
		// Verifica si un producto existe
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en función de su número identificatorio
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}
	

}
