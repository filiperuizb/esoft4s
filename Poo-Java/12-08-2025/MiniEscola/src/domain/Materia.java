package domain;

public class Materia {

    private String nomeDisciplina;
    private Professor professor;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------MATÉRIA--------")
                .append("\nNome da Disciplina: ").append(getNomeDisciplina())
                .append("\nProfessor: ").append(professor != null ? professor.getNome() : "Sem professor")
                .append("\n--------MATÉRIA--------");
        return sb.toString();
    }
}