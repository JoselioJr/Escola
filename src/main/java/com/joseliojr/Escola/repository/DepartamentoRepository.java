package com.joseliojr.Escola.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joseliojr.Escola.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, UUID> {
    Departamento findByNome(String nome);
}
