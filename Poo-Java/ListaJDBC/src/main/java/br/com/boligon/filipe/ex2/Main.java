package br.com.boligon.filipe.ex2;

import br.com.boligon.filipe.utils.ConexaoBanco;
import br.com.boligon.filipe.utils.CriacaoTabelas;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection conexao = ConexaoBanco.getConexao();
             Scanner entrada = new Scanner(System.in)) {
            CriacaoTabelas ex2 = new CriacaoTabelas();
            ex2.criarTabela(conexao, ex2.ex2);

            ClienteService clienteService = new ClienteService();

            while(true) {
                System.out.println("--------------------------------");
                System.out.println("1 - Adicionar Cliente");
                System.out.println("2 - Listar Clientes");
                System.out.println("3 - Buscar Cliente por Email");
                System.out.println("4 - Atualizar Telefone do Cliente");
                System.out.println("5 - Excluir Cliente");
                System.out.println("0 - Sair");
                System.out.println("--------------------------------");
                System.out.print("Escolha uma opção: ");
                int opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do Cliente: ");
                        String nome = entrada.next();
                        System.out.print("Email do Cliente: ");
                        String email = entrada.next();
                        System.out.print("Telefone do Cliente: ");
                        String telefone = entrada.next();
                        clienteService.adicionarCliente(nome, email, telefone);
                        break;
                    case 2:
                        clienteService.mostrarClientes();
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;
                    case 3:
                        System.out.print("Email do Cliente a ser buscado: ");
                        String emailBuscar = entrada.next();
                        clienteService.buscarClientePorEmail(emailBuscar);
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;
                    case 4:
                        System.out.println("Digite o ID para atualizar o telefone:");
                        int idAtualizar = entrada.nextInt();
                        System.out.println("Digite o novo telefone:");
                        String novoTelefone = entrada.next();
                        clienteService.atualizarTelefoneCliente(idAtualizar, novoTelefone);
                        break;
                    case 5:
                        System.out.println("Digite o ID do cliente a ser excluído:");
                        int idExcluir = entrada.nextInt();
                        clienteService.excluirCliente(idExcluir);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
