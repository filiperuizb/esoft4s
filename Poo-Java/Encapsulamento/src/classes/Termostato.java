package classes;

public class Termostato {
    private Double temperaturaAtual;
    private Double temperaturaDesejada;

    public Termostato(Double temperaturaAtual, Double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaDesejada(Double temperaturaDesejada) {
        if(temperaturaDesejada < 15 || temperaturaDesejada > 30) {
            this.temperaturaDesejada = temperaturaDesejada;
        } else {
            System.out.println("Não pode ser menor que 15°C\n" +
                    "nem maior que 30°C");
        }
    }
}
