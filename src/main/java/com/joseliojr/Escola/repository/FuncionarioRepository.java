package com.joseliojr.Escola.repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;
import com.joseliojr.Escola.model.Funcionario;

@Repository
public class FuncionarioRepository {
    private final Map<UUID, Funcionario> funcionarios = new ConcurrentHashMap<>();

    public FuncionarioRepository() {
        // Dados mockados
        Funcionario func1 = new Funcionario("Pedro Almeida", "33344455566", "pedro.almeida@escola.edu", "11555555555", "Secretário", "CLT");
        Funcionario func2 = new Funcionario("Lúcia Ferreira", "77788899900", "lucia.ferreira@escola.edu", "11444444444", "Bibliotecária", "Estatutário");
        
        funcionarios.put(func1.getId(), func1);
        funcionarios.put(func2.getId(), func2);
    }

    public Funcionario save(Funcionario funcionario) {
        if (funcionario.getId() == null) {
            funcionario.setId(UUID.randomUUID());
        }
        funcionarios.put(funcionario.getId(), funcionario);
        return funcionario;
    }

    public Optional<Funcionario> findById(UUID id) {
        return Optional.ofNullable(funcionarios.get(id));
    }

    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios.values());
    }

    public void deleteById(UUID id) {
        funcionarios.remove(id);
    }

    public boolean existsById(UUID id) {
        return funcionarios.containsKey(id);
    }

    public Funcionario findByNomeCompleto(String nomeCompleto) {
        return funcionarios.values().stream()
                .filter(funcionario -> funcionario.getNomeCompleto().equals(nomeCompleto))
                .findFirst()
                .orElse(null);
    }

    public Funcionario findByCpf(String cpf) {
        return funcionarios.values().stream()
                .filter(funcionario -> funcionario.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public Funcionario findByEmailInstitucional(String emailInstitucional) {
        return funcionarios.values().stream()
                .filter(funcionario -> funcionario.getEmailInstitucional().equals(emailInstitucional))
                .findFirst()
                .orElse(null);
    }
}
