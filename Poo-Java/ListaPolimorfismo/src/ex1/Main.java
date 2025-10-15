package ex1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB500", 999);

        System.out.println("Pedágio Carro: R$ " + carro.calcularPedagio());
        System.out.println("Pedágio Moto: R$ " + moto.calcularPedagio());
    }
}