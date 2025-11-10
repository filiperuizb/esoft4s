package br.com.boligon.filipe;

import br.com.boligon.filipe.banco.ItemStorage;
import br.com.boligon.filipe.entity.ProdutoFisico;
import br.com.boligon.filipe.entity.ServicoDigital;
import br.com.boligon.filipe.utils.ItemVendavel;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemStorage storage = new ItemStorage();
        storage.criarTabela();

        boolean running = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (running) {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("                    SISTEMA DE ITENS");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Atualizar preço base");
            System.out.println("4 - Deletar item");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine().trim();
            switch (opcao) {
                case "1": {
                    System.out.println("\n-=-=-= ADICIONAR ITEM =-=-=-");
                    System.out.print("Tipo (1) Produto Físico  (2) Serviço Digital: ");
                    String tipo = scanner.nextLine().trim();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine().trim();
                    System.out.print("Preço base (ex: 12.50): ");
                    double precoBase = Double.parseDouble(scanner.nextLine().trim());

                    if ("1".equals(tipo)) {
                        System.out.print("Peso em kg (ex: 2.5): ");
                        double peso = Double.parseDouble(scanner.nextLine().trim());
                        ProdutoFisico pf = new ProdutoFisico(0, nome, precoBase, peso);
                        storage.salvarItem(pf);
                    } else if ("2".equals(tipo)) {
                        System.out.print("Duração em meses (inteiro): ");
                        int duracao = Integer.parseInt(scanner.nextLine().trim());
                        ServicoDigital sd = new ServicoDigital(0, nome, precoBase, duracao);
                        storage.salvarItem(sd);
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                }

                case "2": {
                    System.out.println("\n-=-=-= LISTA DE ITENS =-=-=-");
                    List<ItemVendavel> itens = storage.buscarTodosItems();
                    if (itens.isEmpty()) {
                        System.out.println("Nenhum item encontrado.");
                    } else {
                        for (ItemVendavel it : itens) {
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println(it.getId() + " - " + it.getNome() + " - " + it.getTipo()
                                    + " - Preço base: " + it.getPrecoBase()
                                    + " - Preço final: " + it.calcularPrecoFinal()
                                    + " - Imposto: " + it.calcularImposto());
                        }
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("\nPressione Enter para voltar ao menu...");
                        scanner.nextLine();
                    }
                    break;
                }
                case "3": {
                    System.out.println("\n-=-=-= ATUALIZAR PREÇO BASE =-=-=-");
                    System.out.print("ID do item: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Novo preço base: ");
                    double novoPreco = Double.parseDouble(scanner.nextLine().trim());
                    storage.atualizarPrecoBase(id, novoPreco);
                    break;
                }

                case "4": {
                    System.out.println("\n-=-=-= DELETAR ITEM =-=-=-");
                    System.out.print("ID do item: ");
                    int idDel = Integer.parseInt(scanner.nextLine().trim());
                    storage.deletar(idDel);
                    break;
                }

                case "0": {
                    running = false;
                    System.out.println("Encerrando aplicação...");
                    break;
                }

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            }
        }
    }
}