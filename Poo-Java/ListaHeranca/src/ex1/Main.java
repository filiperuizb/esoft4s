package ex1;

public class Main {
    public static void main(String[] args) {
        Carro tesla = new Carro("Tesla", "KingSize",
                2024, 4);
        Moto moto = new Moto("Bmw", "f45h40",
                2023, 666);

        System.out.println(tesla);
        System.out.println("--------------------------");
        System.out.println(moto);

    }
}