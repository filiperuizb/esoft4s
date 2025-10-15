package ex3;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Quadrado quadrado = new Quadrado(4.0);

        System.out.println(circulo.calcularArea());
        System.out.println(quadrado.calcularArea());
    }
}
