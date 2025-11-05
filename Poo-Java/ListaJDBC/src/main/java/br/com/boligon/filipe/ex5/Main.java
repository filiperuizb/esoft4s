package br.com.boligon.filipe.ex5;

import br.com.boligon.filipe.utils.ConexaoBanco;
import br.com.boligon.filipe.utils.CriacaoTabelas;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Connection conexao = ConexaoBanco.getConexao();
            Scanner entrada = new Scanner(System.in)) {

            CriacaoTabelas ex5 = new CriacaoTabelas();
            ex5.criarTabela(conexao, ex5.ex5);

            VeiculoService veiculoService = new VeiculoService();

            while(true) {
                System.out.println("--------------------------------");
                System.out.println("1 - Adicionar Veículo");
                System.out.println("2 - Listar Veículos");
                System.out.println("3 - Buscar Veículo por Placa");
                System.out.println("4 - Atualizar Ano");
                System.out.println("5 - Excluir Veículo");
                System.out.println("0 - Sair");
                System.out.println("--------------------------------");
                System.out.print("Escolha uma opção: ");
                int opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Placa do Veículo: ");
                        String placa = entrada.nextLine();
                        System.out.print("Marca do Veículo: ");
                        String marca = entrada.nextLine();
                        System.out.print("Modelo do Veículo: ");
                        String modelo = entrada.nextLine();
                        System.out.print("Ano do Veículo: ");
                        int ano = entrada.nextInt();
                        veiculoService.adicionarVeiculo(placa, marca, modelo, ano);
                        break;
                    case 2:
                        veiculoService.mostrarPatio();
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        break;
                    case 3:
                        System.out.print("Placa para busca: ");
                        String placaBuscar = entrada.nextLine();
                        veiculoService.mostrarPorPlaca(placaBuscar);
                        System.out.println("Pressione Enter para continuar...");
                        entrada.nextLine();
                        break;
                    case 4:
                        System.out.print("Placa do Veículo a ser alterado: ");
                        String busca = entrada.nextLine();
                        System.out.print("Novo Ano do Veículo: ");
                        int novoAno = entrada.nextInt();
                        veiculoService.atualizarAno(busca, novoAno);
                        break;
                    case 5:
                        System.out.print("Placa do Veículo a ser excluído: ");
                        String placaExcluir = entrada.nextLine();
                        veiculoService.venderVeiculo(placaExcluir);
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
