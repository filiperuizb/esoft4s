package domain;

import java.time.LocalDate;

public class Pessoa {

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() > 11) {
            throw new IllegalArgumentException("CPF inválido");
        } else {
            this.cpf = cpf;
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
