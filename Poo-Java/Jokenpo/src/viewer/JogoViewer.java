package viewer;

import enums.Gesto;
import service.JogoService;

import java.util.Scanner;

public class JogoViewer {

	private JogoService jogoService;

	public JogoViewer() {

	}

	public static void clearConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	Scanner entrada = new Scanner(System.in);
	
	public void menuInicial() {
		clearConsole();
		System.out.println("---------- BEM VINDO AO JOKENPO ----------");
		System.out.println("1 - Iniciar Jogo");
		System.out.println("2 - Sair");
		System.out.println("------------------------------------------");
		System.out.printf("Escolha: ");
		int escolha = entrada.nextInt();
		switch (escolha) {
			case 1:
				menuJogo();
				break;
			case 2:
				System.out.println("Saindo do jogo...");
				entrada.close();
				break;
			default:
				System.out.println("Escolha inválida! Tente novamente.");
				menuInicial();
				break;
		}
	}
	
	public void menuJogo() {
		clearConsole();
		System.out.println("---------- MENU JOKENPO ----------");
		System.out.println("1 - Jogar Com o Computador");
		System.out.println("2 - Jogar com um Amigo");
		System.out.println("3 - Sair");
		System.out.println("----------------------------------");
		System.out.printf("Escolha: ");
		int escolha = entrada.nextInt();
		switch (escolha) {
			case 1:
				iniciarJogoSemAmigo();
				break;
			case 2:
				iniciarJogoComAmigo();
				break;
			case 3:
				System.out.println("Saindo do jogo...");
				entrada.close();
				break;
			default:
				System.out.println("Escolha inválida! Tente novamente.");
				menuJogo();
				break;
		}
	}
	
	public void jogadas() {
		System.out.println("Escolha seu gesto:");
		System.out.printf("1 - PEDRA%n2 - TESOURA%n3 - PAPEL%n");
		System.out.println("--------------------------------------------------");
		System.out.printf("Escolha: ");
	}

	public void iniciarJogoSemAmigo() {
		clearConsole();
		System.out.println("---------- VOCÊ INICIOU O JOGO JOKENPO (P1 VS MAQUINA) ----------");
		jogadas();
		int escolha = entrada.nextInt();
		Gesto gestoJogador;

		if (escolha < 1 || escolha > 3) {
			System.out.println("Escolha inválida! Tente novamente.");
			iniciarJogoSemAmigo();
			return;
		}

		gestoJogador = escolherGesto(escolha);

		jogoService = new JogoService(gestoJogador);
		jogoService.sortearOponente();
		jogoService.exibirResultado(jogoService.getJogo());

		System.out.println("\nPressione ENTER para voltar ao menu principal...");
		entrada.nextLine();
		entrada.nextLine();
		menuJogo();
	}
	
	public void iniciarJogoComAmigo() {
		clearConsole();
		System.out.println("---------- VOCÊ INICIOU O JOGO JOKENPO (P1 VS P2) ----------");

		System.out.println("Player 1, é a sua vez!");
		jogadas();
		int escolha1 = entrada.nextInt();
		if (escolha1 < 1 || escolha1 > 3) {
			System.out.println("Escolha inválida! Tente novamente.");
			iniciarJogoComAmigo();
			return;
		}

		clearConsole();

		System.out.println("Player 2, é a sua vez!");
		jogadas();
		int escolha2 = entrada.nextInt();
		if (escolha2 < 1 || escolha2 > 3) {
			System.out.println("Escolha inválida! Tente novamente.");
			iniciarJogoComAmigo();
			return;
		}

		clearConsole();

		jogoService = new JogoService(escolherGesto(escolha1), escolherGesto(escolha2));
		jogoService.exibirResultado(jogoService.getJogo());
		
		System.out.println("\nPressione ENTER para voltar ao menu principal...");
		entrada.nextLine();
		entrada.nextLine();
		menuJogo();
	}
	
	public Gesto escolherGesto(int escolha) {
		switch (escolha) {
			case 1:
				return Gesto.PEDRA;
			case 2:
				return Gesto.TESOURA;
			case 3:
				return Gesto.PAPEL;
			default:
				System.out.println("Escolha inválida! Tente novamente.");
				return null;
		}
	}
}
