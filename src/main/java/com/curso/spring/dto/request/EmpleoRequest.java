package com.curso.spring.dto.request;

import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
public class EmpleoRequest {

    private Long empleoId;
    private String titulo;
    private String empresa;
    private BigDecimal salario;
}
