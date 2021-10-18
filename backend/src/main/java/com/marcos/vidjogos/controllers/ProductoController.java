package com.marcos.vidjogos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marcos.vidjogos.entity.models.Producto;
import com.marcos.vidjogos.entity.services.IProductoService;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class ProductoController {

	@Autowired
	IProductoService productoService;
	
	@GetMapping("/producto")
	public List<Producto> getAllLibros(){
		return productoService.getAll();				
	}	
	
	@GetMapping("/producto/{id}")
	public Producto getOne(@PathVariable(value = "id") long id) {
		Optional<Producto> b = productoService.getOne(id);
		if(b.isPresent()) {
			System.out.println("Se ha obtenido con éxito el Producto con ID: "+id);
			return b.get();
		};
		
		return null;
	}
	
	@PostMapping("/producto")
	public void add(Producto producto) {
		System.out.println(producto.getName());
		productoService.add(producto);
	}
	
	@PostMapping(value="/producto", consumes="application/json")
	void addUsingJson(@RequestBody String productoString) {
		ObjectMapper om = new ObjectMapper();
		try {
			Producto producto = om.readValue(productoString, Producto.class);
			System.out.println(producto.getName());
			productoService.add(producto);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@DeleteMapping("/producto/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		System.out.println("Se ha eliminado el Producto con ID:"+id);
		productoService.delete(id);
	}
	
	@PutMapping("/producto/{id}")
	public void put(Producto producto,@PathVariable(value = "id") long id) {
		productoService.put(producto, id);
	}
}
