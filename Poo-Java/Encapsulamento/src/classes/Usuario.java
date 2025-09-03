package classes;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void setSenha(String senha) {
        if(senha.length() >= 8) {
            this.senha = senha;
        } else {
            System.out.println("A senha deve possuir no mínimo 8 caracteres");
        }
    }
}
