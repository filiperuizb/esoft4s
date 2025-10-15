package ex1;

public class Livro {
    private static int contadorDeLivros = 0;

    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
        contadorDeLivros++;
    }

    public static int getContadorDeLivros() {
        return contadorDeLivros;
    }
}
