package service;

import domain.Materia;
import domain.Professor;

public class MateriaService {

    public Materia criarMateria(String nomeDisciplina, Professor professor) {
        Materia materia = new Materia();
        materia.setNomeDisciplina(nomeDisciplina);
        materia.setProfessor(professor);
        return materia;
    }

    public Materia getMateria(Materia materia) {return materia;}
}