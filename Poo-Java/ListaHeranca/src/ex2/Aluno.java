package ex2;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, String cpf, String ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    @Override
    public String toString() {
        return super.toString() + "Aluno{" +
                "ra='" + ra + '\'' +
                '}';
    }
}
