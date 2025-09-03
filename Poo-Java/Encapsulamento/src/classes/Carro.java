package classes;

public class Carro {
    private String marca;
    private String modelo;
    private Double velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(Double incremento) {
        if(this.velocidadeAtual < 180 && incremento < 180) {
            this.velocidadeAtual += incremento;
        } else {
            System.out.println("A velocidade não pode ser maior que 180km/h");
        }
    }

    public void frear(Double decremento) {
        if(this.velocidadeAtual > 0.0 && decremento > 0.00) {
            this.velocidadeAtual -= decremento;
        } else {
            System.out.println("Deeer... O carro já está parado seu imbecil");
        }
    }

}
