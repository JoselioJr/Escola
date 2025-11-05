package com.joseliojr.Escola.model;

import java.util.UUID;

public class Departamento {
    private UUID id;
    private String nome;
    private String sigla;
    private String centro;
    private UUID chefeDepartamento;
    private String emailContato;
    private String telefone;
    private String localizacao;

    public Departamento() {
    }

    public Departamento(UUID id, String nome, String sigla, String centro, UUID chefeDepartamento,
            String emailContato, String telefone, String localizacao) {
        this.id = id != null ? id : UUID.randomUUID();
        this.nome = nome;
        this.sigla = sigla;
        this.centro = centro;
        this.chefeDepartamento = chefeDepartamento;
        this.emailContato = emailContato;
        this.telefone = telefone;
        this.localizacao = localizacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public UUID getChefeDepartamento() {
        return chefeDepartamento;
    }

    public void setChefeDepartamento(UUID chefeDepartamento) {
        this.chefeDepartamento = chefeDepartamento;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
