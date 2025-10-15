package ex4;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        Gerente gerente = new Gerente();

        System.out.println("Férias do colaborador: " + colaborador.calcularFerias() + " dias");
        System.out.println("Férias do gerente: " + gerente.calcularFerias() + " dias");
    }
}
