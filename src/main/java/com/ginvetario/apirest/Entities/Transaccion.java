package com.ginvetario.apirest.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private String Tipo;
    private int Cantidad;
    private LocalDate Fecha;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public LocalDate getFecha() {
        return Fecha;
    }
    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }
  
}
