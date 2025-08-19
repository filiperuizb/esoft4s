public class Cachorro {
    String nome;
    double peso;
    Pessoa dono;

    Cachorro(String nome, double peso, String nomePessoa, int matricula) {
        this.nome = nome;
        this.peso = peso;
        this.dono = new Pessoa(nomePessoa, matricula);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------------------------------\n")
                .append("CACHORRO:\n")
                .append("Nome: ").append(nome)
                .append("\nPeso: ").append(peso)
                .append("\nDONO: ").append(dono.nome)
                .append("\n---------------------------------\n");
        return sb.toString();
    }
}
