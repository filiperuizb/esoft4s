package domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Materia materia;
    private List<Matricula> matriculas = new ArrayList<>();

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Matricula matricula) {
        matriculas.add(matricula);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------TURMA--------")
                .append("\nMatéria: ").append(materia != null ? materia.getNomeDisciplina() : "Sem matéria")
                .append("\nProfessor: ").append(materia != null && materia.getProfessor() != null ? materia.getProfessor().getNome() : "Sem professor")
                .append("\nAlunos matriculados: ").append(matriculas.size())
                .append("\n---------------------");
        return sb.toString();
    }
}
