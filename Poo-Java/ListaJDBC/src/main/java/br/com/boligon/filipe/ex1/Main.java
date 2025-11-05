package br.com.boligon.filipe.ex1;

import br.com.boligon.filipe.utils.ConexaoBanco;
import br.com.boligon.filipe.utils.CriacaoTabelas;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Connection conexao = ConexaoBanco.getConexao();
             Scanner entrada = new Scanner(System.in)) {
            CriacaoTabelas ex1 = new CriacaoTabelas();
            ex1.criarTabela(conexao, ex1.ex1);

            ProdutoService produtoService = new ProdutoService();

            while(true) {
                System.out.println("--------------------------------");
                System.out.println("1 - Adicionar Produto");
                System.out.println("2 - Listar Produtos");
                System.out.println("3 - Alterar Preço do Produto");
                System.out.println("4 - Excluir Produto");
                System.out.println("0 - Sair");
                System.out.println("--------------------------------");
                System.out.print("Escolha uma opção: ");
                int opcao = entrada.nextInt();

                switch(opcao) {
                    case 1:
                        System.out.print("Nome do Produto: ");
                        String nome = entrada.next();
                        System.out.print("Preço do Produto: ");
                        double preco = entrada.nextDouble();
                        System.out.print("Quantidade do Produto: ");
                        int quantidade = entrada.nextInt();
                        produtoService.adicionarProduto(nome, preco, quantidade);
                        break;
                    case 2:
                        produtoService.mostrarProdutos();
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;
                    case 3:
                        System.out.print("ID do Produto a ser alterado: ");
                        int idAlterar = entrada.nextInt();
                        System.out.print("Novo Preço do Produto: ");
                        double novoPreco = entrada.nextDouble();
                        produtoService.alterarPrecoProduto(idAlterar, novoPreco);
                        break;
                    case 4:
                        System.out.print("ID do Produto a ser excluído: ");
                        int idExcluir = entrada.nextInt();
                        produtoService.excluirProduto(idExcluir);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
