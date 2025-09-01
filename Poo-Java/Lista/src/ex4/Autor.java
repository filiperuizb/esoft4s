package ex4;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String nacionalidade;
    private List<Livro> livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = new ArrayList<Livro>();
    }

    public void addLivros(Livro livro) {
        this.livros.add(livro);
    }
}
