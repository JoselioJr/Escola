package com.joseliojr.Escola.model;

public class Funcionario extends Pessoa {
    private String cargo;
    private String tipoVinculo;

    public Funcionario() {
    }

    public Funcionario(String nomeCompleto, String cpf, String emailInstitucional,
            String telefone, String cargo, String tipoVinculo) {
        super(nomeCompleto, cpf, emailInstitucional, telefone);
        this.cargo = cargo;
        this.tipoVinculo = tipoVinculo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }
}
