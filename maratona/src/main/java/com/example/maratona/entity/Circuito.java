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

    @Min(value=1, message="A idade não pode ser menor de 16 anos!")
    @Max(value=3, message="A idade não pode ser maior de 50 anos!")
    private int categoria;

    private int distancia;

    @ManyToOne
    private Maratona maratona;

    @OneToMany(mappedBy = "inscricao")
    private List<Inscricao> inscricoes;

    public Long getId() {
        return id;
    }
}
