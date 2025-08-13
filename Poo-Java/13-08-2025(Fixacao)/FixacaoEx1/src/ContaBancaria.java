import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private Pessoa titular;
    private String numeroConta;
    private String agencia;
    private Double saldo;
    List<Cartao> cartoes = new ArrayList<>();

    public ContaBancaria(String numeroConta, String agencia,
                         Double saldo, String nome, String cpf, String dataNascimento) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = new Pessoa(nome, cpf, dataNascimento);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void adicionarCartao(String codigo, String cvv,
                                String validade, ContaBancaria contaBancaria) {
        this.cartoes.add(new Cartao(codigo, cvv, validade, contaBancaria));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(titular.getNome())
                .append(" - ").append(titular.getCpf())
                .append(" - ").append(titular.getDataNascimento())
                .append("\nConta Bancária: ").append(numeroConta)
                .append("\nAgência: ").append(agencia)
                .append("\nSaldo: ").append(saldo);
        return sb.toString();
    }
}
