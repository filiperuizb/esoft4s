import java.util.ArrayList;
import java.util.List;

public class Predio {
    String nome;
    Integer andares;
    String endereco;
    Armazem armazem;
    List<Elevador> elevadores = new ArrayList<>();

    public Predio(String nome, Integer andares, String endereco, Double area, String tipo) {
        this.nome = nome;
        this.andares = andares;
        this.endereco = endereco;
        armazem = new Armazem(area, tipo);
    }

    public void adicionarElevador(Elevador elevador) {
        elevadores.add(elevador);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Edifício: ").append(nome)
                .append("\nAndares: ").append(andares)
                .append("\nEndereço: ").append(endereco)
                .append("Armazém: A/").append(armazem.area)
                .append(" - T/").append(armazem.tipo)
                .append("\n");
        for (Elevador elevador: elevadores) {
            sb.append("Capacidade: ").append(elevador.capacidade)
                    .append(" - Modelo: ").append(elevador.modelo)
                    .append("\n");
        }
        return sb.toString();
    }
}
