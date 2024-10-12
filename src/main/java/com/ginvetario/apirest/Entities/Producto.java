package com.ginvetario.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private String Descripcion;
    private int Cantidad;
    private Double Precio;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public Double getPrecio() {
        return Precio;
    }
    public void setPrecio(Double precio) {
        Precio = precio;
    }

    
}
