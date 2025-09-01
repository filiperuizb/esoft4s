package ex8;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("Nome: ").append(this.nome)
                .append(" - Preço: R$").append(String.format("%.2f", this.preco)).append('\n');
        return sb.toString();
    }
}
