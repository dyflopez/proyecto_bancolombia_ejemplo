package com.bancolombia.usuarios.controller;

import com.bancolombia.usuarios.service.ICalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    //inyecion de dependencias:

    private final ICalculadoraService calculadoraService ;

    public CalculadoraController(ICalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/resta")
    public int resta(@RequestParam("numero1") int numero1,@RequestParam("numero2") int numero2) {
        return numero1-numero2-10;
    }


    @GetMapping("/resta")
    public int restaGet(@RequestParam("numero1") int numero1,@RequestParam("numero2") int numero2) {
        return numero1-numero2;
    }

    @PostMapping("/suma")
    public int suma(@RequestParam("numero1") int numero1,@RequestParam("numero2") int numero2) {
        return calculadoraService.suma(numero1, numero2);
    }
}