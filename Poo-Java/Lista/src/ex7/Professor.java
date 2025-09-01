package ex7;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}
