package dominio.parcial2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private HashSet<Producto> productosExistentes; // Listado de productos que se comercializan
	private ArrayList<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private HashMap<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas;
	private Integer cantidadDeUnidades;// Identificador del número de venta
	
	public Supermercado(String nombre) {
		// Constructor de la clase
		this.nombre=nombre;
		this.productosExistentes = (HashSet<Producto>) new HashSet<Producto>();
		this.productosDisponibles = new ArrayList<Producto>();
		this.ventasRealizadas = new HashMap<Integer, Venta>();
		
		
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
		Integer cantidadDeUnidades = 0;
		for(Producto producto: productosDisponibles){
			if(producto.getCodigo().equals(codigo)){
				cantidadDeUnidades++;
			}
			return cantidadDeUnidades;
			// Devuelve la cantidad de unidades de un producto determinado
		}
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
		
		return this.ventasRealizadas.get(nueroDeVenta);
		// Devuelve una venta en función de su número identificatorio
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		
		productoExiste(codigoDeProducto);
		getStock(codigoDeProducto);
		this.ventasRealizadas.put(numeroDeVenta,codigoDeProducto);
				
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}
	

}
