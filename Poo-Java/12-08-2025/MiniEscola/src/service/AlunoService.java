package service;

import domain.Aluno;

import java.time.LocalDate;

public class AlunoService {

    Aluno aluno = new Aluno();

    public void criarAluno(String nome, String cpf, String dataNascimento, String ra) {
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setDataNascimento(LocalDate.parse(dataNascimento));
        aluno.setRa(ra);
    }

    @Override
    public String toString() {
        return aluno.toString();
    }
}
