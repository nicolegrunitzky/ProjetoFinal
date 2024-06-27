package com.example.maratona.controller;

import com.example.maratona.entity.Maratona;
import com.example.maratona.service.MaratonaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("maratona")
public class MaratonaController {

    @Autowired
    MaratonaService maratonaService;

    @PostMapping("cadastrar")
    public String cadastrarMaratona(@RequestBody @Valid Maratona maratona){
        maratonaService.cadastrarMaratona(maratona);
        return "Maratona cadastrada com sucesso!";
    }

}
