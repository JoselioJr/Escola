package com.joseliojr.Escola.repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;
import com.joseliojr.Escola.model.Departamento;

@Repository
public class DepartamentoRepository {
    private final Map<UUID, Departamento> departamentos = new ConcurrentHashMap<>();

    public DepartamentoRepository() {
        // Dados mockados
        UUID chefeId1 = UUID.randomUUID();
        UUID chefeId2 = UUID.randomUUID();
        
        Departamento dept1 = new Departamento(null, "Departamento de Matemática", "DMAT", "Centro de Ciências Exatas", chefeId1, "dmat@escola.edu", "11333333333", "Bloco A - Sala 101");
        Departamento dept2 = new Departamento(null, "Departamento de Física", "DFIS", "Centro de Ciências Exatas", chefeId2, "dfis@escola.edu", "11222222222", "Bloco B - Sala 201");
        
        departamentos.put(dept1.getId(), dept1);
        departamentos.put(dept2.getId(), dept2);
    }

    public Departamento save(Departamento departamento) {
        if (departamento.getId() == null) {
            departamento.setId(UUID.randomUUID());
        }
        departamentos.put(departamento.getId(), departamento);
        return departamento;
    }

    public Optional<Departamento> findById(UUID id) {
        return Optional.ofNullable(departamentos.get(id));
    }

    public List<Departamento> findAll() {
        return new ArrayList<>(departamentos.values());
    }

    public void deleteById(UUID id) {
        departamentos.remove(id);
    }

    public boolean existsById(UUID id) {
        return departamentos.containsKey(id);
    }

    public Departamento findByNome(String nome) {
        return departamentos.values().stream()
                .filter(departamento -> departamento.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }
}
