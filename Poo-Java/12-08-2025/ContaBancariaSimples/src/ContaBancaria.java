import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private Double saldo;
    private String numeroConta;

    private String agencia;

    private Pessoa titular;

    private List<Cartao> cartoes = new ArrayList<>();

    ContaBancaria(String numeroConta, String agencia, String nomePessoa, String cpf,
                  String dataNascimento) {
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

}
