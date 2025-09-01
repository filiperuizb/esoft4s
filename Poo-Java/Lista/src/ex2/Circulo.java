package ex2;

public class Circulo {
    Double raio;

    Circulo(Double raio) {
        this.raio = raio;
    }

    Double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }

    Double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}
