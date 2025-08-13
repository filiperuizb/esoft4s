package domain;

public class Professor extends Pessoa{
    private String rp;

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------PROFESSOR--------")
                .append("\nNome: ")
                .append(getNome()).append(" - ")
                .append(getCpf())
                .append("\nRP: ").append(getRp())
                .append("\nData de Nascimento: ")
                .append(getDataNascimento())
                .append("\n--------PROFESSOR--------");

        return sb.toString();
    }
}
