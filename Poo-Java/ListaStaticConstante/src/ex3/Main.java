package ex3;

import ex3.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(100);

        System.out.println(p1.getPrecoComImposto());

        Produto p2 = new Produto(1000);

        System.out.println(p2.getPrecoComImposto());

        Produto.setTaxaImposto(0.10);

        System.out.println(p1.getPrecoComImposto());
        System.out.println(p2.getPrecoComImposto());
    }
}