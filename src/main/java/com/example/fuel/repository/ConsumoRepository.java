
package com.example.fuel.repository;

import com.example.fuel.domain.ConsumoEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ConsumoRepository extends JpaRepository<ConsumoEvento, UUID> {
}
