package com.prueba.servicio.servicioprueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class PruebaRestController {

    @RequestMapping("/saludo")
    public String saludo() {
        return "¡Hola desde el servicio REST!";
    }
}
