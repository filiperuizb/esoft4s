//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro bob = new Cachorro("Bob", 9.700,
                "João Paulo", 0);

        Pessoa pedro = new Pessoa ("Lucas", 150);

        Banho banho = new Banho("Dove", 30.00, bob, pedro);

        System.out.println(banho);

    }
}