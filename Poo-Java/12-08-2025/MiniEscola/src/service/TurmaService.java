package service;

import domain.Materia;
import domain.Turma;

public class TurmaService {

    public Turma criarTurma(Materia materia) {
        Turma turma = new Turma();
        turma.setMateria(materia);
        return turma;
    }

    public Turma getTurma(Turma turma) {return turma;}
}
