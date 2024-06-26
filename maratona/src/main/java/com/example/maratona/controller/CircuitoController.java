package com.example.maratona.controller;

import com.example.maratona.entity.Circuito;
import com.example.maratona.service.CircuitoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CircuitoController {

    @Autowired
    CircuitoService circuitoService;

    @PostMapping("circuito")
    public String cadastrarTime(@RequestBody @Valid Circuito circuito){
        circuitoService.salvarCircuito(circuito);
        return "Time cadastrado com sucesso!";
    }

}
