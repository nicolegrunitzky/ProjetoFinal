package com.example.maratona.controller;

import com.example.maratona.service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaratonistaController {

    @Autowired
    MaratonistaService maratonistaService;

}
