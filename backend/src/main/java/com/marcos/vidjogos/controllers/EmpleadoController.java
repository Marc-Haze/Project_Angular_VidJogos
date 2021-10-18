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
import com.marcos.vidjogos.entity.models.Empleado;
import com.marcos.vidjogos.entity.services.IEmpleadoService;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class EmpleadoController {

	@Autowired
	IEmpleadoService empleadoService;
	
	@GetMapping("/empleado")
	public List<Empleado> getAllLibros(){
		return empleadoService.getAll();				
	}	
	
	@GetMapping("/empleado/{id}")
	public Empleado getOne(@PathVariable(value = "id") long id) {
		Optional<Empleado> b = empleadoService.getOne(id);
		if(b.isPresent()) {
			System.out.println("Se ha obtenido con éxito el Empleado con ID: "+id);
			return b.get();
		};
		
		return null;
	}
	
	@PostMapping("/empleado")
	public void add(Empleado empleado) {
		System.out.println(empleado.getName());
		empleadoService.add(empleado);
	}
	
	@PostMapping(value="/empleado", consumes="application/json")
	void addUsingJson(@RequestBody String empeladoString) {
		ObjectMapper om = new ObjectMapper();
		try {
			Empleado empleado = om.readValue(empeladoString, Empleado.class);
			System.out.println(empleado.getName());
			empleadoService.add(empleado);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@DeleteMapping("/empleado/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		System.out.println("Se ha eliminado el empelado con ID:"+id);
		empleadoService.delete(id);
	}
	
	@PutMapping("/empleado/{id}")
	public void put(Empleado empleado,@PathVariable(value = "id") long id) {
		empleadoService.put(empleado, id);
	}
	
	
}