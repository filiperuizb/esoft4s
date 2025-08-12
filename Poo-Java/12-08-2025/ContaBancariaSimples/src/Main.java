public class Main {
    public static void main(String[] args) {
        ContaBancaria contaNu = new ContaBancaria("2131321", "213-2",
                "Filipe", "135.739.259-10", "16/09/2005");

        contaNu.setSaldo(3500.00);
        Cartao cartaoNu = new Cartao("12312321", "123", "08/31", contaNu);

    }
}
