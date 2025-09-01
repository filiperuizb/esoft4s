package ex1;

public class Pessoa {
    private String nome;
    private Integer idade;

    Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    public void exibirIdade() {
        System.out.println("Idade do(a) " + nome + ": " + idade);
    }
}
 

