package com.ginvetario.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private String Nombre;
    private String Telefono;
    private String Email;
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
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

}
