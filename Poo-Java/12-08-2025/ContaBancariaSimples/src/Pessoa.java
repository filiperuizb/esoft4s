public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "Data de Nascimento: " + dataNascimento;
    }
}
