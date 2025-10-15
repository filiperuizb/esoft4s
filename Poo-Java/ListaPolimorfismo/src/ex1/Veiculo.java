package ex1;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public double calcularPedagio() {
        return 10.50;
    }


}
