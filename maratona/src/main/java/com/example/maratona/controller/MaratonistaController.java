package com.example.maratona.controller;

import com.example.maratona.entity.Maratonista;
import com.example.maratona.service.MaratonistaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("maratonista")
public class MaratonistaController {

    @Autowired
    MaratonistaService maratonistaService;

    @PostMapping("cadastrar")
    public String cadastrarMaratonista(@RequestBody @Valid Maratonista maratonista){
        maratonistaService.cadastrarMaratonista(maratonista);
        return "Maratonista cadastrado com sucesso!";
    }

}
