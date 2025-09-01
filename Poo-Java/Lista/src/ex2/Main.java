package ex2;

import ex1.Pessoa;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(15.5);

        System.out.println("-------Área do Círculo-------");
        System.out.println("Valor: " + circulo.calcularArea());
        System.out.println("-------Perímetro do Círculo-------");
        System.out.println("Valor: " + circulo.calcularPerimetro());

    }
}