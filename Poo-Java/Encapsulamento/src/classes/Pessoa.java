package classes;

public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser menor que 0");
        }

    }
}


