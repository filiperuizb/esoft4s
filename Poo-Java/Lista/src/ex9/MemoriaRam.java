package ex9;

public class MemoriaRam {
    private String tipo;
    private Integer capacidadeGb;
    private Computador computador;

    public MemoriaRam(String tipo, Integer capacidadeGb) {
        this.tipo = tipo;
        this.capacidadeGb = capacidadeGb;
    }

    void vincular(Computador computador) {
        if(this.computador == null) {
            this.computador = computador;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------MEMORIA RAM------\n")
                .append("Tipo: ").append(tipo).append("\n")
                .append("Capacidade: ").append(capacidadeGb).append("GB\n")
                .append("------MEMORIA RAM------");
        return sb.toString();
    }
}
