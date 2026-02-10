
package com.example.fuel.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "bomba", schema = "poc")
public class Bomba {

    @Id
    private UUID id;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "estoque_litros")
    private BigDecimal estoqueLitros;
}
