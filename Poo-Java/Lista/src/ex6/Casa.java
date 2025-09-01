package ex6;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String endereco;
    private List<Comodo> comodos = new ArrayList<>();


    public Casa(String endereco, List<Comodo> comodos) {
        this.endereco = endereco;
        comodos.forEach(this::adicionarComodo);
    }

    private void adicionarComodo(Comodo comodo) {
        comodo.vincular(this);
        comodos.add(comodo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa localizada em: ").append(endereco).append("\n");
        sb.append("Comodos:\n");
        if(comodos.isEmpty()) {
            sb.append("Nenhum comodo cadastrado.\n");
        } else {
            for (Comodo comodo : comodos) {
                sb.append("- ").append(comodo).append("\n");
            }
        }
        return sb.toString();
    }


}
