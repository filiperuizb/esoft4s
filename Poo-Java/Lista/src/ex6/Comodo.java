package ex6;

public class Comodo {
    private String nome;
    private Casa casa;

    public Comodo(String nome) {
        this.nome = nome;
    }

    public void vincular(Casa casa) {
        if (this.casa == null) {
            this.casa = casa;
        }
    }

    public String toString() {
        return nome;
    }
}
