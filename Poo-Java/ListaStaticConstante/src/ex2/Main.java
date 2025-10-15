package ex2;

import ex1.Livro;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto (100);
        System.out.println(p1.getPrecoComImposto());
        Produto p2 = new Produto (1000);
        System.out.println(p2.getPrecoComImposto());
    }
}