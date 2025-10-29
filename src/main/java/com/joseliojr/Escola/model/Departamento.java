package com.joseliojr.Escola.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Departamentos")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sigla;

    @Column(nullable = false)
    private String centro;

    @Column(nullable = false)
    private UUID chefeDepartamento;

    @Column(nullable = false)
    private String emailContato;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String localizacao;

    public Departamento() {
    }

    public Departamento(UUID id, String nome, String sigla, String centro, UUID chefeDepartamento,
            String emailContato, String telefone, String localizacao) {
        this.id = id;
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
