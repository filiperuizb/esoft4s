package ex5;

public class Main {
    public static void main(String[] args) {
        Time corinthians = new Time("Corinthians", "São Paulo");

        Jogador jogador1 = new Jogador("Cássio", "Goleiro", 12, corinthians);
        Jogador jogador2 = new Jogador("Fagner", "Lateral Direito", 23, corinthians);
        Jogador jogador3 = new Jogador("Gil", "Zagueiro", 3, corinthians);
        Jogador jogador4 = new Jogador("Danilo Avelar", "Lateral Esquerdo", 6, corinthians);
        Jogador jogador5 = new Jogador("Gabriel", "Meio-Campo", 8, corinthians);
        Jogador jogador6 = new Jogador("Renato Augusto", "Meio-Campo", 5, corinthians);
        Jogador jogador7 = new Jogador("Jadson", "Meio-Campo", 10, corinthians);
        Jogador jogador8 = new Jogador("Clayson", "Atacante", 11, corinthians);
        Jogador jogador9 = new Jogador("Vagner Love", "Atacante", 9, corinthians);
        Jogador jogador10 = new Jogador("Romero", "Atacante", 7, corinthians);
        Jogador jogador11 = new Jogador("Memphis Sem Pai", "Atacante", 99, corinthians);

        corinthians.listarJogadores();
    }
}
