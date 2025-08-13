public class Main {
    public static void main(String[] args) {
        ContaBancaria contaNu = new ContaBancaria(
                "2131321", "213-2", "Filipe", "135.739.259-10", "16/09/2005");

        contaNu.adicionarCartao(new Cartao("12312321", "123", "08/31", contaNu));
        contaNu.adicionarCartao(new Cartao("98765432", "999", "05/29", contaNu));

        contaNu.depositarSaldo(2500.00);

        contaNu.sacarSaldo(5000.00);

        contaNu.sacarSaldo(2.50);

        System.out.println(contaNu);

    }
}
