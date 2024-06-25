package com.example.maratona.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double valoInscricao;

    @ManyToOne
    private Circuito circuito;

    @ManyToOne
    private Maratonista maratonista;

    public Long getId() {
        return id;
    }

}
