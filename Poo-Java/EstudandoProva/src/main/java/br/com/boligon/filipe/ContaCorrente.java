package br.com.boligon.filipe;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public String getTipo() {
        return "Corrente";
    }

    @Override
    public double calcularTarifaMensal() {
        return 12.90 + (getSaldo() < 0 ? Math.abs(getSaldo()) * 0.01 : 0.0);
    }

    @Override
    public double calcularRendimentoMensal() {
        return 0.0;
    }
}
