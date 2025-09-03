package classes;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if(preco > 0.0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo");
        }
    }
}
