package com.example.maratona.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double valorInscricao;

    @ManyToOne
    private Circuito circuito;

    @ManyToOne
    private Maratonista maratonista;

    @Override
    public String toString() {
        return "Inscricao{" +
                "id=" + id +
                ", valorInscricao=" + valorInscricao +
                ", circuito=" + circuito +
                ", maratonista=" + maratonista +
                '}';
    }
}
