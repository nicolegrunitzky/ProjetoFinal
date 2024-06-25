package com.example.maratona.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public
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

    @OneToMany(mappedBy = "inscricao")
    private List<Inscricao> inscricoes;

    public Long getId() {
        return id;
    }
}
