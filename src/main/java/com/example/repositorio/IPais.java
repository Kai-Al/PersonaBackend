package com.example.repositorio;

import com.example.modelo.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPais extends JpaRepository<Pais, String> {

}
