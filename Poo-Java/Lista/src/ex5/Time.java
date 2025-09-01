package ex5;

import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogador> jogadores;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = new ArrayList<>();
    }

    public void addJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador) {
        this.jogadores.remove(jogador);
    }

    public void listarJogadores() {
        System.out.printf("Jogadores do time %s:\n", this.nome);
        if(this.jogadores.isEmpty()) {
            System.out.println("Nenhum jogador cadastrado.");
        } else {
            for (Jogador jogador : this.jogadores) {
                System.out.println(jogador);
            }
        }
    }
}
