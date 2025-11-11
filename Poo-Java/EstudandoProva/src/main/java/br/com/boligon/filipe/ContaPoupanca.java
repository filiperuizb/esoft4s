package br.com.boligon.filipe;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public String getTipo() {
        return "Poupança";
    }

    @Override
    public double calcularTarifaMensal() {
        return 0.0;
    }

    @Override
    public double calcularRendimentoMensal() {
        return getSaldo() * 0.0065;
    }
}
