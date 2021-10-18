package com.marcos.vidjogos.entity.services;
import java.util.List;
import java.util.Optional;

import com.marcos.vidjogos.entity.models.Producto;

public interface IProductoService {

	public Producto get(long id);
	public List<Producto> getAll();
	public void add(Producto producto);
	public void put(Producto producto, long id);
	public void delete(long id);
	Optional<Producto> getOne(long id);
}
