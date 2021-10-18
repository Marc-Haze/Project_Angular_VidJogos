package com.marcos.vidjogos.entity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.vidjogos.entity.dao.IEmpleadoDao;
import com.marcos.vidjogos.entity.models.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	public Empleado get(long id) {
		return empleadoDao.findById(id).get();
	}

	@Override
	public List<Empleado> getAll() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public void add(Empleado empleado) {
		empleadoDao.save(empleado);
		
	}

	@Override
	public void put(Empleado empleado, long id) {
		empleadoDao.findById(id).ifPresent((x) -> {
			empleado.setId(id);
			empleadoDao.save(empleado);
		});
	}

	@Override
	public void delete(long id) {
		empleadoDao.deleteById(id);
		
	}
	
	@Override
	public Optional<Empleado> getOne(long id) {
		return empleadoDao.findById(id);
	}

}