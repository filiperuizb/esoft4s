package ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Comodo> comodos = new ArrayList<>();
        comodos.add(new Comodo("Cozinha"));
        comodos.add(new Comodo("Sala"));
        comodos.add(new Comodo("Quarto"));
        comodos.add(new Comodo("Suíte"));

        Casa casa = new Casa("Rua Tupã, 1643", comodos);

        System.out.println(casa);

    }
}
