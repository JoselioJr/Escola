package com.joseliojr.Escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Aluno extends Pessoa {
    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private int matricula;

    public Aluno() {
    }

    public Aluno(String nomeCompleto, String cpf, String emailInstitucional, String telefone,
            String dataNascimento, int matricula) {
        super(nomeCompleto, cpf, emailInstitucional, telefone);
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
}