public class Circulo {

    private Double raio;

    Circulo(Double raio) {
        this.raio = raio;
    }

    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    public Double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public void calcularOsDois() {
        Double area = calcularArea();
        Double circunferencia = calcularCircunferencia();

        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Circunferência: %.2f", circunferencia);
    }
}
