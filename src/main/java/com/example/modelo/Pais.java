package com.example.modelo;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table ( name = "Pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @OneToMany(mappedBy = "pais")
    private Collection<Departamento> departamento;

    public Collection<Departamento> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Collection<Departamento> departamento) {
        this.departamento = departamento;
    }
}
