package ex9;

public class Processador {
    private String modelo;
    private Integer nucleos;
    private Computador computador;

    public Processador(String modelo, Integer nucleos) {
        this.modelo = modelo;
        this.nucleos = nucleos;
    }

    void vincular(Computador computador) {
        if(this.computador == null) {
            this.computador = computador;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------PROCESSADOR------\n")
                .append("Modelo: ").append(modelo).append("\n")
                .append("Núcleos: ").append(nucleos).append("\n")
                .append("------PROCESSADOR------");
        return sb.toString();
    }
}
