package com.marcos.vidjogos.entity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.vidjogos.entity.dao.IProductoDao;
import com.marcos.vidjogos.entity.models.Producto;

@Service
public class IProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	public Producto get(long id) {
		return productoDao.findById(id).get();
	}

	@Override
	public List<Producto> getAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public void add(Producto producto) {
		productoDao.save(producto);
		
	}

	@Override
	public void put(Producto producto, long id) {
		productoDao.findById(id).ifPresent((x) -> {
			producto.setId(id);
			productoDao.save(producto);
		});
	}

	@Override
	public void delete(long id) {
		productoDao.deleteById(id);
		
	}
	
	@Override
	public Optional<Producto> getOne(long id) {
		return productoDao.findById(id);
	}
	

}
