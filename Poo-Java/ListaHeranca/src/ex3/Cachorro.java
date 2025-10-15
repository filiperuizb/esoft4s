package ex3;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + "Cachorro{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
