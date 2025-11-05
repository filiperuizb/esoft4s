package br.com.boligon.filipe.ex1;

public class ProdutoService {
    ProdutoBanco produtoBanco = new ProdutoBanco();

    public void adicionarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtoBanco.inserirProduto(produto);
    }

    public void mostrarProdutos() {
        produtoBanco.listarProdutos();
    }

    public void alterarPrecoProduto(int id, double novoPreco) {
        produtoBanco.updateProduto(id, novoPreco);
    }

    public void excluirProduto(int id) {
        produtoBanco.deletarProduto(id);
    }

}
