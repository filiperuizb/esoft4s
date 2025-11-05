import classes.Hospede;
import classes.Hotel;
import classes.Quarto;

public class Main {
	public static void main(String[] args) {
		Hotel hotel = new Hotel("ARANTES GAY", "Rua Tributech, 123");

		Quarto quarto1 = new Quarto(101, "Standard", 150.0);
		Quarto quarto2 = new Quarto(102, "Deluxe", 200.0);
		Quarto quarto3 = new Quarto(103, "Suíte", 180.0);
		hotel.adicionarQuarto(quarto1);
		hotel.adicionarQuarto(quarto2);
		hotel.adicionarQuarto(quarto3);

		Hospede hospede1 = new Hospede("Filipe Senra Boligon", "12345678900");
		Hospede hospede2 = new Hospede("Zulli Gabriel Junior", "98765432100");

		hotel.exibirRelatorio();

		hotel.hospedar(hospede1, 101);

		hotel.hospedar(hospede2, 101);

		hotel.hospedar(hospede2, 102);

		hotel.exibirRelatorio();

		hotel.realizarCheckout(101);

		hotel.exibirRelatorio();
	}
}