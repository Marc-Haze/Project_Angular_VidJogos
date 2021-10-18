package com.marcos.vidjogos.entity.services;

import java.util.List;
import java.util.Optional;
import com.marcos.vidjogos.entity.models.Empleado;

public interface IEmpleadoService {
	public Empleado get(long id);
	public List<Empleado> getAll();
	public void add(Empleado empleado);
	public void put(Empleado empleado, long id);
	public void delete(long id);
	Optional<Empleado> getOne(long id);

	
}