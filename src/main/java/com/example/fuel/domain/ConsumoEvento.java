
package com.example.fuel.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "consumo_evento", schema = "poc")
public class ConsumoEvento {

    @Id
    @JsonProperty("id")
    private UUID id;

    @JsonProperty("bombaId")
    private UUID bombaId;

    @JsonProperty("litros")
    private BigDecimal litros;

    @JsonProperty("dataConsumo")
    private LocalDateTime dataConsumo;

    @JsonProperty("origem")
    private String origem;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getBombaId() {
        return bombaId;
    }

    public void setBombaId(UUID bombaId) {
        this.bombaId = bombaId;
    }

    public BigDecimal getLitros() {
        return litros;
    }

    public void setLitros(BigDecimal litros) {
        this.litros = litros;
    }

    public LocalDateTime getDataConsumo() {
        return dataConsumo;
    }

    public void setDataConsumo(LocalDateTime dataConsumo) {
        this.dataConsumo = dataConsumo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
