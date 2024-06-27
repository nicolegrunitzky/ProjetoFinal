package com.example.maratona.controller;

import com.example.maratona.entity.Inscricao;
import com.example.maratona.service.InscricaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inscricao")
public class InscricaoController {

    @Autowired
    InscricaoService inscricaoService;

    @PostMapping("cadastrar")
    public String inscreverAtleta(@RequestBody @Valid Inscricao inscricao) {
        try {
            inscricaoService.inscreverAtleta(inscricao);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "Inscrição efetuada com sucesso!";
    }
}
