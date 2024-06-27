package com.example.maratona.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Categoria categoria;

    private int distancia;

    @ManyToOne
    private Maratona maratona;

    @OneToMany(mappedBy = "circuito")
    private List<Inscricao> inscricoes;

}
