package classes;

public class Quarto {
	private int numero;
	private String tipo;
	private double precoPorNoite;
	private boolean ocupado;
	private Hospede hospede;

	public Quarto(int numero, String tipo, double precoPorNoite) {
		this.numero = numero;
		this.tipo = tipo;
		this.precoPorNoite = precoPorNoite;
		this.ocupado = false;
		this.hospede = null;
	}

	public void ocupar(Hospede hospede) {
		if(this.hospede == null) {
			this.hospede = hospede;
			this.ocupado = true;
		} else {
			System.out.println("Quarto já está ocupado tiozao");
		}
	}

	public void liberar() {
		if(this.hospede != null) {
			this.hospede = null;
			this.ocupado = false;
		} else {
			System.out.println("Já está livre");
		}
	}

	public int getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public boolean isOcupado() {
		return ocupado;
	}

}
