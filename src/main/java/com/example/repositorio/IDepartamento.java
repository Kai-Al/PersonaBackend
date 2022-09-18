package com.example.repositorio;

import com.example.modelo.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamento extends JpaRepository<Departamento, String> {


}
