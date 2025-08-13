import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private Double saldo;
    private String numeroConta;
    private String agencia;
    private Pessoa titular;
    private List<Cartao> cartoes = new ArrayList<>();

    public ContaBancaria(String numeroConta, String agencia, String nomePessoa, String cpf, String dataNascimento) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = new Pessoa(nomePessoa, cpf, dataNascimento);
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void adicionarCartao(Cartao cartao) {
        cartoes.add(cartao);
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
            for (int i = 0; i < cartoes.size(); i++) {
                sb.append("Cartão ").append(i + 1).append(":\n")
                  .append(cartoes.get(i)).append("\n");
            }
        }
        return sb.toString();
    }
}
