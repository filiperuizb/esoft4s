package service;

import domain.Professor;

import java.time.LocalDate;

public class ProfessorService {

    Professor professor = new Professor();

    public void criarProfessor(String nome, String cpf, LocalDate dataNascimento, String rp) {
        professor.setNome(nome);
        professor.setCpf(cpf);
        professor.setDataNascimento(dataNascimento);
        professor.setRp(rp);
    }

    public Professor getProfessor() {return professor;}

    @Override
    public String toString() {
        return professor.toString();
    }
}
