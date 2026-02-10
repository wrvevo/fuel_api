-- ============================================
-- DATABASE: fuel_db
-- ============================================

-- EXTENSÕES
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- ============================================
-- TABELA: bomba
-- ============================================
CREATE TABLE IF NOT EXISTS bomba (
                                     id UUID PRIMARY KEY,
                                     numero INTEGER NOT NULL,
                                     estoque_litros NUMERIC(18,2) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP
    );

-- ============================================
-- TABELA: consumo_evento
-- ============================================
CREATE TABLE IF NOT EXISTS consumo_evento (
                                              id UUID PRIMARY KEY,
                                              bomba_id UUID NOT NULL,
                                              litros NUMERIC(18,2) NOT NULL,
    data_consumo TIMESTAMP NOT NULL,
    origem VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT now(),

    CONSTRAINT fk_consumo_bomba
    FOREIGN KEY (bomba_id)
    REFERENCES bomba(id)
    );

-- ============================================
-- ÍNDICES (performance + sync)
-- ============================================
CREATE INDEX IF NOT EXISTS idx_consumo_bomba_id
    ON consumo_evento (bomba_id);

CREATE INDEX IF NOT EXISTS idx_consumo_data
    ON consumo_evento (data_consumo);

CREATE INDEX IF NOT EXISTS idx_consumo_origem
    ON consumo_evento (origem);




