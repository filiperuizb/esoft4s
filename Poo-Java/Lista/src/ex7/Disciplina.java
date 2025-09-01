package ex7;

public class Disciplina {
    private String nome;
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.professor.addDisciplina(this);
    }
}
