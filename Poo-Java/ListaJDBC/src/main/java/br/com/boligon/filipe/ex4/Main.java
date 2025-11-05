package br.com.boligon.filipe.ex4;

import br.com.boligon.filipe.utils.ConexaoBanco;
import br.com.boligon.filipe.utils.CriacaoTabelas;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection conexao = ConexaoBanco.getConexao();
             Scanner entrada = new Scanner(System.in)) {

            CriacaoTabelas ex4 = new CriacaoTabelas();
            ex4.criarTabela(conexao, ex4.ex4);

            FilmeService filmeService = new FilmeService();

            while(true) {
                System.out.println("--------------------------------");
                System.out.println("1 - Adicionar Filme");
                System.out.println("2 - Listar Filmes");
                System.out.println("3 - Buscar Filme por Título");
                System.out.println("4 - Atualizar Diretor do Filme");
                System.out.println("5 - Excluir Filme");
                System.out.println("0 - Sair");
                System.out.println("--------------------------------");
                System.out.print("Escolha uma opção: ");
                int opcao = entrada.nextInt();

                switch(opcao) {
                    case 1:
                        System.out.print("Título do Filme: ");
                        String titulo = entrada.next();
                        System.out.print("Diretor do Filme: ");
                        String diretor = entrada.next();
                        System.out.print("Ano de Lançamento do Filme: ");
                        int anoLancamento = entrada.nextInt();
                        filmeService.adicionarFilme(titulo, diretor, anoLancamento);
                        break;
                    case 2:
                        filmeService.mostrarFilmes();
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;
                    case 3:
                        System.out.print("Título para busca: ");
                        String pesquisa = entrada.next();
                        entrada.nextLine();
                        filmeService.mostrarFilmePorTitulo(pesquisa);
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;
                    case 4:
                        System.out.print("ID do Filme a ser alterado: ");
                        int idAlterar = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Novo Diretor do Filme: ");
                        String novoDiretor = entrada.nextLine();
                        filmeService.atualizarDiretor(idAlterar, novoDiretor);
                        break;
                    case 5:
                        System.out.print("ID do Filme a ser excluído: ");
                        int idExcluir = entrada.nextInt();
                        filmeService.excluirFilme(idExcluir);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
