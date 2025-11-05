package br.com.boligon.filipe.entity;

import br.com.boligon.filipe.utils.ItemVendavel;
import br.com.boligon.filipe.utils.Tributavel;

public class ProdutoFisico extends ItemVendavel implements Tributavel {
    private double pesoEmKg;

    public ProdutoFisico(int id, String nome, double precoBase, double pesoEmKg) {
        super(id, nome, precoBase);
        this.pesoEmKg = pesoEmKg;
    }


    @Override
    public double calcularPrecoFinal() {
        return super.getPrecoBase() + (this.pesoEmKg * 3.50);
    }

    @Override
    public String getTipo() {
        return "Físico";
    }




    @Override
    public double calcularImposto() {
        return super.getPrecoBase() * 0.05;
    }


}
