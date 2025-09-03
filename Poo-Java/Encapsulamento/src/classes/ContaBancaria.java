package classes;

public class ContaBancaria {
    private String titular;
    private Integer numeroConta;
    private Double saldo;

    public ContaBancaria(String titular, Integer numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositarSaldo(Double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
        } else {
            System.out.println("O número a depositar não pode ser negativo!!!");
        }
    }

    public void sacarSaldo(Double valor) {
        if(this.saldo > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Seu valor de saque é maior do que o saldo atual");
        }
    }
}
