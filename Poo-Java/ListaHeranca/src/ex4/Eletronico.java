package ex4;

public class Eletronico extends Produto{
    private int voltagem;
    private int garantiaEmMeses;

    public Eletronico(int id, String nome, double preco, int voltagem, int garantiaEmMeses) {
        super(id, nome, preco);
        this.voltagem = voltagem;
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public String toString() {
        return super.toString() + "Eletronico{" +
                "voltagem=" + voltagem +
                ", garantiaEmMeses=" + garantiaEmMeses +
                '}';
    }
}
