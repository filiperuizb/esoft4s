package br.com.boligon.filipe.utils;

public abstract class ItemVendavel {

    private int id;
    private String nome;
    private double precoBase;

    public ItemVendavel(int id, String nome, double precoBase) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();

    public abstract String getTipo();

    public double calcularImposto() {
        return 0.0;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
