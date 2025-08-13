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
}
