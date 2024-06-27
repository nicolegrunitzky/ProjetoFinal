package com.example.maratona.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Maratonista {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String sobrenome;

    private int idade;

    private String tipoSanguineo;

    private String celular;

    private String emergencia;

    private String RG;

    @OneToMany(mappedBy = "maratonista")
    private List<Inscricao> inscricoes;

}
