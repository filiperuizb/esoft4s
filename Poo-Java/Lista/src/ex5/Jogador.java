package ex5;

public class Jogador {
    private String nome;
    private String posicao;
    private Integer numero;
    private Time time;

    public Jogador(String nome, String posicao, Integer numero, Time time) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
        this.time = time;
        this.time.addJogador(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append(" - Posição: ").append(posicao)
          .append(" - Número: ").append(numero);
        return sb.toString();
    }
}
