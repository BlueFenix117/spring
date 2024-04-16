package com.curso.spring.controller;

import com.curso.spring.service.EjerciciosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.curso.spring.dto.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/curso-spring")

@Slf4j

@Tag(name = "Hola Mundo Controller")
public class HelloWorldController {

    @Autowired
    private EjerciciosService ejerciciosService;

    @GetMapping("/Hello")
    @Operation(summary = "Operacion para mostrar un hola mundo")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hola/{nombre}")
    @Operation(summary = "Operacion opara mostrar un hola mundo mandando un parametro")
    public String holaMundoCustom(@PathVariable String nombre){
        log.info("El nombre que se envia desde la url es: " + nombre);
        return "Hola Mundo " + nombre;
    }

    @PostMapping("/persona")
        public Persona datospersona(@Valid @RequestBody Persona persona) {
        /*Integer edad=0;
        edad = Integer.valueOf(persona.getEdad());*/
        return persona;
    }

    @GetMapping("/nombres")
    public List<String> getNombres(){
        return ejerciciosService.getNombres();
    }
}
