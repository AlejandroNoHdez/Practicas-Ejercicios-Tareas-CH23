package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.models.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service
public class ProductoService
{
	// Creo el objeto de la clase ProductoRepository
	private final ProductoRepository productoRepository;

	// Cablear con el autowired
	@Autowired

	public ProductoService(ProductoRepository productorepository)
	{
		this.productoRepository = productorepository;
	}

	// Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la base de datos. Si el producto existe, no deberia actualizar la Base de datos porque seria un objeto duplicado.

	public void crearProducto(Producto prod)
	{ // objeto del tipo producto
		Optional<Producto> productoBuscado = productoRepository.findByNombre(prod.getNombre());
		if (productoBuscado.isPresent())
		{
			throw new IllegalStateException("El producto con el nombre " + "[" + prod.getNombre() + "] ya existe.");
		}
		else
		{
			productoRepository.save(prod);
		} // else //if
	}// addProducto

	// Read (leer una lista de productos)
	public List<Producto> leerProductos()
	{
		return productoRepository.findAll();
	}

	// Read (leer un producto con un id especifico)
	public Producto leerProducto(Long prodId)
	{
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe."));
	}// getProducto

	// Update para actualizar un producto
	public void actualizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, Double precio)
	{
		// si el producto existe...
		if (productoRepository.existsById(prodId))
		{
			// entonces lo modifico
			Producto productoABuscar = productoRepository.getById(prodId);// ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
			if (nombre != null)
				productoABuscar.setNombre(nombre);
			if (descripcion != null)
				productoABuscar.setDescripcion(descripcion);
			if (precio != null)
				productoABuscar.setPrecio(precio);
			if (URL_Imagen != null)
				productoABuscar.setURL_Imagen(URL_Imagen);
			// Cuando termino de editar el objeto...
			productoRepository.save(productoABuscar);
		}
		else
		{
			System.out.println("El producto a buscar con el id: " + prodId + " no existe");
		}
	}

	// Delete
	public void borrarProducto(Long prodId)
	{
		if (productoRepository.existsById(prodId))
		{
			productoRepository.deleteById(prodId);
		}
	}
}
