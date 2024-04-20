package com.curso.spring.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DireccionRequest {

    private Long direccionId;
    private String calle;
    private String ciudad;
    private String estado;
    private String codigoPostal;
}
