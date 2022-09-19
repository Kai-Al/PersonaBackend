package com.example.rest;

import com.example.modelo.Pais;
import com.example.servicio.PaisServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pais")
public class PaisRest {
    @Autowired
    PaisServicio paisServicio;
    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises() {
        return ResponseEntity.ok(paisServicio.findAll());
    }
    @GetMapping("/test")
    private String test() {
        return "test";
    }
}
