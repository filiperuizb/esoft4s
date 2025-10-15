package ex1;

import ex1.Livro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro ("Harry Potter");
        System.out.println(Livro.getContadorDeLivros());
        Livro l2 = new Livro ("Harry Potter 2");
        System.out.println(Livro.getContadorDeLivros());
    }
}