package com.MC.EjercicioRectangulo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatitoController {
    @Value("${frase.gatito}")
    private String fraseDelGatito;

    @GetMapping("/MiGatito")
    public ResponseEntity<String> miGatito()    {
        return ResponseEntity.ok(fraseDelGatito);
    }
}
