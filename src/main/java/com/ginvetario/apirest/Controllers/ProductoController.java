package com.ginvetario.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ginvetario.apirest.Entities.Producto;
import com.ginvetario.apirest.Repositories.ProductoRepository;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    /**
     * @return
     */
    //get all producto
    @GetMapping
    public List <Producto> getAllProductos(){
        return productoRepository.findAll();
    }
    //get producto
    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id){
        return productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("No se encotro id"+ id));
    }
    //create producto
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto){
        return productoRepository.save(producto);
    }
    //update producto por id
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable int id, @RequestBody Producto detallesProducto){
        Producto producto= productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("No se encotro id"+ id));
        
        producto.setNombre(detallesProducto.getNombre());
        producto.setDescripcion(detallesProducto.getDescripcion());
        producto.setCantidad(detallesProducto.getCantidad());
        producto.setPrecio(detallesProducto.getPrecio());

        return productoRepository.save(producto);
    }
    //delete producto por id
    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable int id){
        Producto producto= productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("No se encotro id"+ id));

        productoRepository.delete(producto);
        return "Producto con "+id+" ha sido eliminado" ;
    }
    
    

}
