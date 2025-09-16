package service;

import enums.Gesto;
import enums.Resultado;
import domain.Jogo;

import java.util.Random;

public class JogoService {

	private Jogo jogo;
	private Gesto oponenteSorteado;
	private static final Random random = new Random();

	public JogoService(Gesto jogador1) {
		this.jogo = new Jogo(jogador1, oponenteSorteado);
	}

	public JogoService(Gesto jogador1, Gesto jogador2) {
		this.jogo = new Jogo(jogador1, jogador2);
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void sortearOponente() {
		Gesto[] gestos = Gesto.values();
		int indiceSorteado = random.nextInt(gestos.length);
		this.oponenteSorteado = gestos[indiceSorteado];
		jogo.setJogador2(oponenteSorteado);
	}

	public Resultado contra(Jogo jogo) {
		Gesto oponente = jogo.getJogador2();
		Gesto jogador = jogo.getJogador1();

		if(jogador == oponente) {return Resultado.EMPATOU;}

		do {
			switch (jogador) {
				case PEDRA:
					return (oponente == Gesto.TESOURA) ? Resultado.GANHOU : Resultado.PERDEU;
				case TESOURA:
					return (oponente == Gesto.PAPEL) ? Resultado.GANHOU : Resultado.PERDEU;
				case PAPEL:
					return (oponente == Gesto.PEDRA) ? Resultado.GANHOU : Resultado.PERDEU;
			}
		} while (true);

	}

	public void exibirResultado(Jogo jogo) {
		Resultado resultado = contra(jogo);
		switch (resultado) {
			case GANHOU:
				System.out.println("Escolha do jogador 1: " + jogo.getJogador1());
				System.out.println("Escolha do jogador 2: " + jogo.getJogador2());
				System.out.println("Jogador 1 venceu!");
				break;
			case PERDEU:
				System.out.println("Escolha do jogador 1: " + jogo.getJogador1());
				System.out.println("Escolha do jogador 2: " + jogo.getJogador2());
				System.out.println("Jogador 2 venceu!");
				break;
			case EMPATOU:
				System.out.println("Escolha do jogador 1: " + jogo.getJogador1());
				System.out.println("Escolha do jogador 2: " + jogo.getJogador2());
				System.out.println("Empate!");
				break;
		}
	}
}
