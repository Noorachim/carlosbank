package com.transactions.bank.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCuenta;

    private String propietario;

    private BigDecimal balance;

    @Version
    private Long version;
}
