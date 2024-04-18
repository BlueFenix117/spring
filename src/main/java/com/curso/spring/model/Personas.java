package com.curso.spring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "personas")
@Data
public class Personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "persona_id", nullable = false)
    private Long personaId;

    @Column(name= "nombre", nullable = false)
    private String nombre;

    @Column(name= "edad")
    private Integer edad;

    @Column(name= "genero")
    private String genero;

    @ManyToOne
    @JoinColumn(name= "direccion_id")
    private Direcciones direccionId;

    @ManyToOne
    @JoinColumn(name= "empleo_id")
    private Empleos empleoId;


}
