package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.DTO.Producto.Producto;

//https://hevodata.com/learn/spring-boot-rest-api/


@RestController
@RequestMapping("/api/producto")
public class ProductController {
 
    @Autowired
    private ProductRepository productoRepository;
            
    @GetMapping
    public List<Producto> findAllUsers() {
    	return (List<Producto>) productoRepository.findAll();
    }
    
 
    @GetMapping("/{idproduct}")
    public ResponseEntity<Producto> findUserById(@PathVariable(value = "idproduct") long id) {

    	Optional<Producto> producto = productoRepository.findById(id);
    	 
        if(producto.isPresent()) {
            return ResponseEntity.ok().body(producto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
 
    @PostMapping
    public Producto saveProducto(@Validated @RequestBody Producto producto) {
        // Implement
    	return productoRepository.save(producto);
    }
}
