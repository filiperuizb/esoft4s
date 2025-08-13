package service;

import domain.Materia;
import domain.Professor;

public class MateriaService {

    Materia materia = new Materia();

    public void criarMateria(String nomeDisciplina, Professor professor) {
        materia.setNomeDisciplina(nomeDisciplina);
        materia.setProfessor(professor);
    }
}
