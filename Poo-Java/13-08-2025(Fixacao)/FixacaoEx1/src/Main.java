public class Main {
    public static void main(String[] args) {

        ContaBancaria contaNu = new ContaBancaria("13213131",
                "21412-2", 2500.00, "Filipe Boligon",
                "13573925910", "16/09/2005");

        contaNu.adicionarCartao("12323131", "333", "10-31", contaNu);
    }
}