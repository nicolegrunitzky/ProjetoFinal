package com.example.maratona.controller;

import com.example.maratona.service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitoController {

    @Autowired
    CircuitoService circuitoService;

}
