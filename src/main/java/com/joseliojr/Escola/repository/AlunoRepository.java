package com.joseliojr.Escola.repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;
import com.joseliojr.Escola.model.Aluno;

@Repository
public class AlunoRepository {
    private final Map<UUID, Aluno> alunos = new ConcurrentHashMap<>();

    public AlunoRepository() {
        // Dados mockados
        Aluno aluno1 = new Aluno("João Silva", "12345678901", "joao.silva@escola.edu", "11999999999", "2000-01-15", 2021001);
        Aluno aluno2 = new Aluno("Maria Santos", "98765432100", "maria.santos@escola.edu", "11888888888", "1999-05-20", 2021002);
        
        alunos.put(aluno1.getId(), aluno1);
        alunos.put(aluno2.getId(), aluno2);
    }

    public Aluno save(Aluno aluno) {
        if (aluno.getId() == null) {
            aluno.setId(UUID.randomUUID());
        }
        alunos.put(aluno.getId(), aluno);
        return aluno;
    }

    public Optional<Aluno> findById(UUID id) {
        return Optional.ofNullable(alunos.get(id));
    }

    public List<Aluno> findAll() {
        return new ArrayList<>(alunos.values());
    }

    public void deleteById(UUID id) {
        alunos.remove(id);
    }

    public boolean existsById(UUID id) {
        return alunos.containsKey(id);
    }

    public Aluno findByCpf(String cpf) {
        return alunos.values().stream()
                .filter(aluno -> aluno.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public Aluno findByMatricula(int matricula) {
        return alunos.values().stream()
                .filter(aluno -> aluno.getMatricula() == matricula)
                .findFirst()
                .orElse(null);
    }

    public Aluno findByEmailInstitucional(String emailInstitucional) {
        return alunos.values().stream()
                .filter(aluno -> aluno.getEmailInstitucional().equals(emailInstitucional))
                .findFirst()
                .orElse(null);
    }
}
