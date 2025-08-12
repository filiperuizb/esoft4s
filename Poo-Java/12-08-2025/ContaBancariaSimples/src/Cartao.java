public class Cartao {
    private String codigo;

    private String cvv;

    private String validade;

    private ContaBancaria contaBancaria;

    Cartao(String codigo, String cvv, String validade, ContaBancaria contaBancaria) {
        this.codigo = codigo;
        this.cvv = cvv;
        this.validade = validade;
        this.contaBancaria = contaBancaria;
    }

}
