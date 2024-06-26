package com.example.maratona.repository;

import com.example.maratona.entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository extends JpaRepository<Circuito, Long> {
}
