public class Main {
    public static void main(String[] args) {
        Predio edificio = new Predio("Filipes", 23,
                "Rua Senra Boligon, 123", 13.55, "Bicicletas");

        edificio.adicionarElevador(new Elevador(23, "ZTEC23", edificio));

        System.out.println(edificio);
    }
}