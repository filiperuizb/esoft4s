package br.com.boligon.filipe;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaCorrente("Filipe", 1000));
        contas.add(new ContaCorrente("escrever", 123.23));
        contas.add(new ContaCorrente("leonardo", 9999.99));
        contas.add(new ContaPoupanca("Maria", 2000));
        contas.add(new ContaPoupanca("eu", 255.5));
        contas.add(new ContaPoupanca("joao", 10000));

        ItemStorage is = new ItemStorage();

        is.criarTabela();

        for(ContaBancaria conta : contas) {
                is.inserir(conta);
        }

        for(ContaBancaria conta : is.listar()) {
            System.out.println(conta);
        }


    }
}