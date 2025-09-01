package ex8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");


        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 150.00));
        produtos.add(new Produto("Teclado", 300.00));

        Pedido pedido = new Pedido(cliente, produtos);

        System.out.println(pedido);
    }
}
