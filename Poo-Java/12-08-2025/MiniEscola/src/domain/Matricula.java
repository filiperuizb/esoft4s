package domain;

public class Matricula {
    private Aluno aluno;

    private Turma turma;

    private Double nota1;

    private Double nota2;

    private Double notaFinal;

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
    };

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------NOTAS--------")
                .append("\nNota 1: ")
                .append(getNota1())
                .append("\nNota 2: ")
                .append(getNota2())
                .append("\nNota Final: ")
                .append(getNotaFinal()).append(" - ")
                .append(getStatus())
                .append("\n--------NOTAS--------");

        return sb.toString();
    }
}
