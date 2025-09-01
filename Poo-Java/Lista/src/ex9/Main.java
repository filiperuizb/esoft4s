package ex9;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel Core i7", 8);
        MemoriaRam memoriaRam = new MemoriaRam("DDR4", 16);
        Periferico mouse = new Periferico("Mouse", "Logitech");
        Periferico teclado = new Periferico("Teclado", "Microsoft");


        Computador computador = new Computador(processador, memoriaRam);

        computador.adicionarPeriferico(mouse);
        computador.adicionarPeriferico(teclado);

        System.out.println(computador);
    }
}
