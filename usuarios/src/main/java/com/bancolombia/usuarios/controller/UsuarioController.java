package com.bancolombia.usuarios.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UsuarioController {

    // crear un meotodo que retorne un "Hola mundo" , como lo hacen ?
    @GetMapping
    public String holaMundo(){
        return "Hola mundo";
    }

    // crear un metodo que retorne un "Hola DANIEL" con el nombre del usuario
    // tipoAcceso retorno/noRetorna nombreMetodo(parametros   tipoDato nombreVariable) {  return valor; }
    @GetMapping("/saludo")
    public String holaUsuario(@RequestParam("nombre") String nombre){
        return "Hola " + nombre;
    }

    @GetMapping("/saludo-patch/{nombre}")
    public String patchSaludo(@PathVariable("nombre") String nombre){
        return "Hola " + nombre;
    }
}
