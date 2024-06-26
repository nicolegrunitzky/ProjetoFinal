package com.example.maratona.controller;

import com.example.maratona.entity.Circuito;
import com.example.maratona.entity.Inscricao;
import com.example.maratona.service.InscricaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class InscricaoController {

    @Autowired
    InscricaoService inscricaoService;

    @PostMapping("inscricao")
    public String cadastrarInscricao(@RequestBody @Valid Inscricao inscricao){
        inscricaoService.salvarInscricao(inscricao);
        return "Inscrição concluida com sucesso!";
    }

}
