package service;

import domain.Aluno;
import domain.Matricula;
import domain.Turma;

public class MatriculaService {

    public Double calcularMedia(Double nota1, Double nota2) {
        return (nota1 == null || nota2 ==null) ? null : (nota1 + nota2) / 2;
    }

    public String status(Matricula matricula) {
        return (matricula.getNotaFinal() > 6.0) ? "Aprovado" : "Reprovado";
    }

    public Matricula criarMatricula(Aluno aluno, Turma turma, Double nota1, Double nota2, Double notaFinal) {
        Matricula matricula = new Matricula(aluno, turma);
        matricula.setNota1(nota1);
        matricula.setNota2(nota2);
        matricula.setNotaFinal(calcularMedia(nota1, nota2));
        matricula.setStatus(status(matricula));
        turma.setMatriculas(matricula);
        return matricula;
    }

    public Matricula getMatricula(Matricula matricula) {return matricula;}
}
