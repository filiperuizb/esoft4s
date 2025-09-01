package ex9;

public class Periferico {
    private String tipo;
    private String marca;
    private Computador computador;

    public Periferico(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    void conectar(Computador computador) {
        if(this.computador == null) {
            this.computador = computador;
        }
    }

    void desconectar() {
        this.computador = null;
    }

    Computador getComputador() {
        return computador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------PERIFERICO------\n")
                .append("Tipo: ").append(tipo).append("\n")
                .append("Marca: ").append(marca).append("\n")
                .append("------PERIFERICO------");
        return sb.toString();
    }
}
