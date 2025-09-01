package ex3;

public class Carro {
    private String modelo;

    private String marca;

    private Motor motor;

    public Carro(String modelo, String marca, Integer potencia, String tipoCombustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = new Motor(potencia, tipoCombustivel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----CARRO-----\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        sb.append("Marca: ").append(marca).append("\n");
        sb.append(motor);
        sb.append("-----CARRO-----\n");

        return sb.toString();
    }
}
