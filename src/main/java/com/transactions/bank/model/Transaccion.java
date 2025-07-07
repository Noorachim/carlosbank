package com.transactions.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private BigDecimal cantidad;
    private Long fuenteIdCuenta;
    private Long tarjetaCuentaId;
    private LocalDateTime timestamp;
    private String status;
}
