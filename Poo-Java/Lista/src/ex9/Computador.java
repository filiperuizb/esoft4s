package ex9;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private Processador processador;
    private MemoriaRam memoriaRam;
    private List<Periferico> perifericos = new ArrayList<>();

    public Computador(Processador processador, MemoriaRam memoria) {
        this.processador = processador;
        this.memoriaRam = memoria;
        this.processador.vincular(this);
        this.memoriaRam.vincular(this);
    }

    public void adicionarPeriferico(Periferico periferico) {
        if(periferico.getComputador() == null) {
            perifericos.add(periferico);
            periferico.conectar(this);
        }
    }

    public void removerPeriferico(Periferico periferico) {
        if(perifericos.contains(periferico)) {
            perifericos.remove(periferico);
            periferico.desconectar();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------COMPUTADOR------\n")
                .append(processador).append("\n")
                .append(memoriaRam).append("\n");

        if (perifericos.isEmpty()) {
            sb.append("Nenhum periférico conectado.\n");
        } else {
            perifericos.forEach(p -> sb.append(p).append("\n"));
        }

        sb.append("------COMPUTADOR------");
        return sb.toString();
    }
}
