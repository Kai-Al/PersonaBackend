package com.example.repositorio;

import com.example.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersona extends JpaRepository<Persona, String> {

}
