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
    //Metodos HTTP => GET => obtener datos , consular
    // , POST => crear datos o procesar datos
    // , PUT => actualizar datos
    // , DELETE => eliminar Borrar

    /**
     * Los codigos de estado HTTP son los siguientes:
     * 2** => Exitoso
     * 3** => Redireccion
     * 4** => Error del cliente
     * 5** => Error del servidor
     */
}
//Controller =>  Capa que expone los servicios a traves de un API REST(HTTP) que se van a consumir
//Service =>  logica de negocio
//Repository =>  es el cargado de interactuar entre Spring boot y la base de datos (CRUD)(Select, Insert, Update, Delete)
//Model (Entity) =>  una clase que representa una tabla de la base de datos (entidad)
//DTO =>  Data Transfer Object, es un objeto que se utiliza para transferir datos entre capas de la aplicacion