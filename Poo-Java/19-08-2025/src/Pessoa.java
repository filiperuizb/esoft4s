public class Pessoa {
    String nome;
    int matricula;

    Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
                sb.append("Nome: ").append(nome)
                    .append(" - Matricula: ").append(matricula);
        return sb.toString();
    }
}
