package com.curso.spring.controller;

import com.curso.spring.dto.Persona;
import com.curso.spring.dto.RectanguloDto;
import com.curso.spring.dto.TrianguloDto;
import com.curso.spring.service.RectanguloService;
import com.curso.spring.service.TrianguloService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("Figuras")
@Slf4j
@CrossOrigin

@Tag(name = "Figuras")
public class FigurasController {

    @Autowired
    private RectanguloService rectanguloService;

    @PostMapping("/area-rectangulo")
    public double calcularAreaRectangulo(@RequestBody RectanguloDto request){
        return rectanguloService.calcularAreaRectangulo(request);
    }

    @Autowired
    private TrianguloService trianguloService;
    @PostMapping("/area-triangulo")
    public double calcularAreaTriangulo(@RequestBody TrianguloDto request){
        return trianguloService.calcularAreaTriangulo(request);
    }

    @GetMapping("/area-circulo/{radio}")
    public double calcularAreaCirculo(@PathVariable double radio){
        final double pi=3.1416;
        return pi*(radio*radio);
    }

    /*@GetMapping("/area-rectangulo/{base}/{altura}")
    //@RequestMapping(method = RequestMethod.GET, value ="/area-rectangulo/{base}/{altura}")
    public double calcularAreaRectangulo(@PathVariable @Schema(description= "base del rectangulo", example="28.46") double base,
                                        @PathVariable @Schema(description= "altura del rectangulo", example="46.28") double altura){
        return base * altura;
    }*/

    /*@PostMapping("/area-rectangulo")
    @Operation(summary = "Modulo para calcular el area de un rectangulo")
    public double calcularAreaRectangulo(@RequestBody RectanguloDto request) {
        return request.getBase()*request.getAltura();
    }*/
}