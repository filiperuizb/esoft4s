public class Cartao {
    private String codigo;
    private String cvv;
    private String validade;
    private ContaBancaria contaBancaria;

    public Cartao(String codigo, String cvv, String validade, ContaBancaria contaBancaria) {
        this.codigo = codigo;
        this.cvv = cvv;
        this.validade = validade;
        this.contaBancaria = contaBancaria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCvv() {
        return cvv;
    }

    public String getValidade() {
        return validade;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }
}
