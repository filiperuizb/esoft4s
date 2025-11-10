package br.com.boligon.filipe.entity;

import br.com.boligon.filipe.utils.ItemVendavel;

public class ServicoDigital extends ItemVendavel {
    private int duracaoEmMeses;

    public ServicoDigital(int id, String nome, double precoBase, int duracaoEmMeses) {
        super(id, nome, precoBase);
        this.duracaoEmMeses = duracaoEmMeses;
    }

    public ServicoDigital(int id, String nome, double precoBase) {
        super(id, nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.getPrecoBase() + this.duracaoEmMeses;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }
}
