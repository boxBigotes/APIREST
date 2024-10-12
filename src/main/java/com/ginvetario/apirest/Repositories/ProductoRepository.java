package com.ginvetario.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ginvetario.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
