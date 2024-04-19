package com.curso.spring.dto.request;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data

public class PersonaRequest {

    private Long personaId;


    private String nombre;


    private Integer edad;


    private String genero;


    private Integer direccionId;


    private Integer empleoId;
}
