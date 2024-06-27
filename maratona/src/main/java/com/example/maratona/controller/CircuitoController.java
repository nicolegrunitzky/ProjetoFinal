package com.example.maratona.controller;

import com.example.maratona.entity.Circuito;
import com.example.maratona.service.CircuitoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("circuito")
public class CircuitoController {

    @Autowired
    CircuitoService circuitoService;

    @PostMapping("cadastrar")
    public String cadastrarCircuito(@RequestBody @Valid Circuito circuito) {
        circuitoService.cadastrarCircuito(circuito);
        return "Circuito cadastrado com sucesso!";
    }

}
