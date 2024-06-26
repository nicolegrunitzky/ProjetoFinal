package com.example.maratona.controller;

import com.example.maratona.entity.Inscricao;
import com.example.maratona.service.InscricaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscricaoController {

    @Autowired
    InscricaoService inscricaoService;

    @PostMapping("inscricao")
    public String inscreverAtleta(@RequestBody @Valid Inscricao inscricao) {
        inscricaoService.inscreverAtleta(inscricao);
        return "Inscrição efetuada com sucesso!";
    }
}
