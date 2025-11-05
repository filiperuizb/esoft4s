package br.com.boligon.filipe.ex3;

import br.com.boligon.filipe.utils.ConexaoBanco;
import br.com.boligon.filipe.utils.CriacaoTabelas;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Connection conexao = ConexaoBanco.getConexao();
            Scanner entrada = new Scanner(System.in)) {

            CriacaoTabelas ex3 = new CriacaoTabelas();
            ex3.criarTabela(conexao, ex3.ex3);

            TarefaService tarefaService = new TarefaService();

            while(true) {
                System.out.println("--------------------------------");
                System.out.println("1 - Adicionar Tarefa");
                System.out.println("2 - Listar Todas as Tarefas");
                System.out.println("3 - Listar Tarefas Pendentes");
                System.out.println("4 - Atualizar Status da Tarefa");
                System.out.println("5 - Excluir Tarefa");
                System.out.println("0 - Sair");
                System.out.println("--------------------------------");
                System.out.print("Escolha uma opção: ");

                int opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Descrição da Tarefa: ");
                        String descricao = entrada.nextLine();
                        tarefaService.adicionarTarefa(descricao);
                        break;
                    case 2:
                        tarefaService.mostrarTarefas();
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        break;
                    case 3:
                        tarefaService.mostrarTarefaPendente();
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        break;
                    case 4:
                        System.out.print("ID da Tarefa a ser atualizada: ");
                        int idAtualizar = entrada.nextInt();
                        tarefaService.atualizarStatusTarefa(idAtualizar);
                        break;
                    case 5:
                        System.out.print("ID da Tarefa a ser excluída: ");
                        int idExcluir = entrada.nextInt();
                        tarefaService.excluirTarefa(idExcluir);
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
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
