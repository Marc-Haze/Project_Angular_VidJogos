package com.marcos.vidjogos.entity.dao;

import org.springframework.data.repository.CrudRepository;
import com.marcos.vidjogos.entity.models.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
