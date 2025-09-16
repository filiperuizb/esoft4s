package domain;

import enums.Gesto;

public class Jogo {
	private Gesto jogador1;
	private Gesto jogador2;

	public Jogo(Gesto jogador1, Gesto jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}

	public Gesto getJogador1() {
		return jogador1;
	}

	public void setJogador1(Gesto jogador1) {
		this.jogador1 = jogador1;
	}

	public Gesto getJogador2() {
		return jogador2;
	}

	public void setJogador2(Gesto jogador2) {
		this.jogador2 = jogador2;
	}
}
