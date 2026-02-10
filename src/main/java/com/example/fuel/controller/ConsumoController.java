
package com.example.fuel.controller;

import com.example.fuel.domain.ConsumoEvento;
import com.example.fuel.repository.ConsumoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consumos")
public class ConsumoController {

    private final ConsumoRepository repository;

    public ConsumoController(ConsumoRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/sync")
    public void sync(@RequestBody ConsumoEvento evento) {
        repository.save(evento);
    }
}
