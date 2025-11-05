package br.com.boligon.filipe.ex4;

public class FilmeService {
    FilmeBanco filme = new FilmeBanco();

    public void adicionarFilme(String titulo, String diretor, int anoLancamento) {
        Filme filmeNovo = new Filme(titulo, diretor, anoLancamento);
        filme.inserirFilme(filmeNovo);
    }

    public void mostrarFilmes() {
        filme.listarTodos();
    }

    public void mostrarFilmePorTitulo(String titulo) {
        filme.buscarPorTitulo(titulo);
    }

    public void atualizarDiretor(int id, String diretor) {
        filme.atualizarDiretor(id, diretor);
    }

    public void excluirFilme(int id) {
        filme.removerFilme(id);
    }

}
