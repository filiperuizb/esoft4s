package ex8;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.produtos.addAll(produtos);
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------PEDIDO------").append('\n')
                .append(this.cliente.toString());
        if(this.produtos.isEmpty()) {
            sb.append("Nenhum produto adicionado.").append('\n');
        } else {
            this.produtos.forEach(p -> sb.append(p.toString()));
        }
        sb.append("------PEDIDO------");
        return sb.toString();
    }
}
