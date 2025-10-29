package com.joseliojr.Escola.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joseliojr.Escola.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
    Aluno findByCpf(String cpf);
    Aluno findByMatricula(int matricula);
    Aluno findByEmailInstitucional(String emailInstitucional);
}
