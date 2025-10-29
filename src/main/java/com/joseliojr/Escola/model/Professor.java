package com.joseliojr.Escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Professor extends Pessoa{
    @Column(nullable = false)
    private String titulacao;

    @Column(nullable = false)
    private String areaAtuacao;

    @Column(nullable = false)
    private int regimeTrabalho;

    public Professor() {
    }
    
    public Professor(String nomeCompleto, String cpf, String emailInstitucional, String telefone,
            String titulacao, String areaAtuacao, int regimeTrabalho) {
        super(nomeCompleto, cpf, emailInstitucional, telefone);
        this.titulacao = titulacao;
        this.areaAtuacao = areaAtuacao;
        this.regimeTrabalho = regimeTrabalho;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public int getRegimeTrabalho() {
        return regimeTrabalho;
    }

    public void setRegimeTrabalho(int regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }
}
