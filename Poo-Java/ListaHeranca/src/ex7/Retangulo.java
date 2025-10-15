package ex7;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
