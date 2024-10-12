package com.ginvetario.apirest.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private int id;
    private int cantidad;
    private LocalDate FechaPedido;
    private LocalDate FechaRecepcion;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public LocalDate getFechaPedido() {
        return FechaPedido;
    }
    public void setFechaPedido(LocalDate fechaPedido) {
        FechaPedido = fechaPedido;
    }
    public LocalDate getFechaRecepcion() {
        return FechaRecepcion;
    }
    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        FechaRecepcion = fechaRecepcion;
    }

}
