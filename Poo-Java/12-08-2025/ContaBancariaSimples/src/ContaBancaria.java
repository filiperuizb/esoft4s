import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private Double saldo = 0.0;
    private String numeroConta;
    private String agencia;
    private Pessoa titular;
    private List<Cartao> cartoes = new ArrayList<>();

    public ContaBancaria(String numeroConta, String agencia, String nomePessoa, String cpf, String dataNascimento) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = new Pessoa(nomePessoa, cpf, dataNascimento);
    }

    public void adicionarCartao(Cartao cartao) {
        cartoes.add(cartao);
    }

    public void depositarSaldo(Double valor) {
        this.saldo += valor;
    }

    public void sacarSaldo(Double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$ " + valor + ".");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== DADOS DA CONTA =====\n")
                .append("Número da Conta: ").append(numeroConta).append("\n")
                .append("Agência: ").append(agencia).append("\n")
                .append("Saldo: R$ ").append(saldo).append("\n\n")
                .append("===== DADOS DO TITULAR =====\n")
                .append(titular).append("\n\n")
                .append("===== CARTÕES ASSOCIADOS =====\n");

        if (cartoes.isEmpty()) {
            sb.append("Nenhum cartão cadastrado.\n");
        } else {
            int contador = 1;
            for (Cartao cartao : cartoes) {
                sb.append("Cartão ").append(contador++).append(":\n")
                        .append(cartao).append("\n");
            }
        }
        return sb.toString();
    }

    public String toString(String mensagem) {
        return mensagem;
    }
}
