package com.example.demo.Repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.DTO.Producto.Producto;

@Repository
public interface ProductRepository extends CrudRepository<Producto, Long> {
	
	
}