package classes;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel {
	private String nome;
	private String endereco;
	private ArrayList<Quarto> quartos = new ArrayList<>();

	public Hotel(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public void adicionarQuarto(Quarto quarto) {
		quartos.add(quarto);
	}

	public void hospedar(Hospede hospede, int numeroQuarto) {
		for(Quarto quarto:quartos) {
			if(quarto.getNumero() == numeroQuarto) {
				if(!quarto.isOcupado()) {
					quarto.ocupar(hospede);
					System.out.println("Hospedado com sucesso!");
				} else {
					System.out.println("Quarto já está ocupado tiozao");
				}
				break;
			}
		}
		System.out.println("Quarto não encontrado");
	}

	 public void realizarCheckout(int numeroQuarto) {
		for(Quarto quarto:quartos) {
			if(quarto.getNumero() == numeroQuarto) {
				if(quarto.isOcupado()) {
					quarto.liberar();
					System.out.println("Checkout realizado com sucesso!");
				} else {
					System.out.println("Quarto já está livre");
				}
				break;
			}
		}
		System.out.println("Quarto não encontrado");
	}

	public void exibirRelatorio() {
		System.out.println("Relatório de Quartos do Hotel " + nome);
		if(!quartos.isEmpty()) {
			for(Quarto quarto:quartos) {
				String status = quarto.isOcupado() ? "Ocupado" : "Livre";
				String hospedeInfo = quarto.isOcupado() ? ", Hospede: " + quarto.getHospede().getNome() + " (CPF: " + quarto.getHospede().getCpf() + ")" : "";
				System.out.println("Quarto " + quarto.getNumero() + " (" + quarto.getTipo() + ") - " + status + hospedeInfo);
			}
		} else {
			System.out.println("Nenhum quarto cadastrado.");
		}
	}


}
