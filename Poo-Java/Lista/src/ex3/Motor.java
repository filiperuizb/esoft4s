package ex3;

public class Motor {
    private Integer potencia;
    private String tipoCombustivel;

    public Motor(Integer potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----MOTOR-----\n");
        sb.append("Potência: ").append(potencia).append(" CV\n");
        sb.append("Tipo de Combustível: ").append(tipoCombustivel).append("\n");
        sb.append("-----MOTOR-----\n");

        return sb.toString();
    }
}
