package ex4;

public class Main {
    public static void main(String[] args) {
        Autor arantes = new Autor("Arantes", "Mongoles");

        Livro comoNaoProgramarEmJava = new Livro("Como nao programar em Java", arantes);

        Livro comoReprovarEmJava = new Livro("Como reprovar em Java", arantes);

    }
}
