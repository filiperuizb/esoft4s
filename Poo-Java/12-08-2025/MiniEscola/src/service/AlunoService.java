package service;

import domain.Aluno;

import java.time.LocalDate;

public class AlunoService {

    Aluno aluno = new Aluno();

    public Aluno getAluno() { return aluno; }

    public void criarAluno(String nome, String cpf, LocalDate dataNascimento, String ra) {
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setDataNascimento(dataNascimento);
        aluno.setRa(ra);
    }

    @Override
    public String toString() {
        return aluno.toString();
    }
}
