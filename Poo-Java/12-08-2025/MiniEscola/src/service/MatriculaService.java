package service;

import domain.Aluno;
import domain.Matricula;
import domain.Turma;

public class MatriculaService {

    Matricula matricula = new Matricula();

    public void criarMatricula(Aluno aluno, Turma turma, Double nota1, Double nota2, Double notaFinal) {
        matricula.setAluno(aluno);
        matricula.setTurma(turma);
        matricula.setNota1(nota1);
        matricula.setNota2(nota2);
        matricula.setNotaFinal(notaFinal);
        turma.setMatriculas(matricula);

    }
}
