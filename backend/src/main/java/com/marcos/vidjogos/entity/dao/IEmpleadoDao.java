package com.marcos.vidjogos.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.marcos.vidjogos.entity.models.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Long>{
	
	
}