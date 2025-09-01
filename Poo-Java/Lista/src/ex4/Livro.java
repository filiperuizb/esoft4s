package ex4;

public class Livro {
    private String titulo;
    private Autor autor;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.autor.addLivros(this);
    }
}
