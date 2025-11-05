package com.joseliojr.Escola.repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;
import com.joseliojr.Escola.model.Professor;

@Repository
public class ProfessorRepository {
    private final Map<UUID, Professor> professores = new ConcurrentHashMap<>();

    public ProfessorRepository() {
        // Dados mockados
        Professor prof1 = new Professor("Dr. Carlos Oliveira", "11122233344", "carlos.oliveira@escola.edu", "11777777777", "Doutorado", "Matemática", 40);
        Professor prof2 = new Professor("Dra. Ana Costa", "55566677788", "ana.costa@escola.edu", "11666666666", "Doutorado", "Física", 40);
        
        professores.put(prof1.getId(), prof1);
        professores.put(prof2.getId(), prof2);
    }

    public Professor save(Professor professor) {
        if (professor.getId() == null) {
            professor.setId(UUID.randomUUID());
        }
        professores.put(professor.getId(), professor);
        return professor;
    }

    public Optional<Professor> findById(UUID id) {
        return Optional.ofNullable(professores.get(id));
    }

    public List<Professor> findAll() {
        return new ArrayList<>(professores.values());
    }

    public void deleteById(UUID id) {
        professores.remove(id);
    }

    public boolean existsById(UUID id) {
        return professores.containsKey(id);
    }

    public Professor findByNomeCompleto(String nomeCompleto) {
        return professores.values().stream()
                .filter(professor -> professor.getNomeCompleto().equals(nomeCompleto))
                .findFirst()
                .orElse(null);
    }

    public Professor findByCpf(String cpf) {
        return professores.values().stream()
                .filter(professor -> professor.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public Professor findByEmailInstitucional(String emailInstitucional) {
        return professores.values().stream()
                .filter(professor -> professor.getEmailInstitucional().equals(emailInstitucional))
                .findFirst()
                .orElse(null);
    }
}
