package ex1;

public class Moto extends Veiculo {
    private int cilindaradas;

    public Moto(String marca, String modelo, int cilindaradas) {
        super(marca, modelo);
        this.cilindaradas = cilindaradas;
    }

    @Override
    public double calcularPedagio() {
        return 6.00;
    }
}
