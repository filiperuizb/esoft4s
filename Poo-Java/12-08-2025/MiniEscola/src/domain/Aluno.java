package domain;

import utils.Formatacoes;

public class Aluno extends Pessoa {

    Formatacoes formatar = new Formatacoes();

    private String ra;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------ALUNO--------")
                .append("\nNome: ")
                .append(getNome()).append(" - ")
                .append(formatar.maskCpf(getCpf()))
                .append("\nRA: ").append(formatar.maskRa(getRa()))
                .append("\nData de Nascimento: ")
                .append(getDataNascimento())
                .append("\n--------ALUNO--------");

        return sb.toString();
    }

}
