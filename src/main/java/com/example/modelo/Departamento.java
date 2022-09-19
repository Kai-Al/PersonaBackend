package com.example.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Departamento")
public class Departamento {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;
        private String nombre;
        @ManyToOne
        @JoinColumn(name = "id_pais")
        private Pais pais;

        public Departamento(String nombre, Pais pais) {
                this.nombre = nombre;
                this.pais = pais;
        }

        public Departamento() {}

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public Pais getPais() {
                return pais;
        }

        public void setPais(Pais pais) {
                this.pais = pais;
        }
}
