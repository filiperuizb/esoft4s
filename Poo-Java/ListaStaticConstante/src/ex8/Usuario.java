package ex8;

public class Usuario {
    private String usuario;
    private String email;
    private String senha;

    public Usuario(String usuario, String email, String senha) {
        this.usuario = usuario;
        if(ValidacaoUtil.isEmailValido(email)) {
            this.email = email;
        } else {
            System.out.println("Precisa ser um email válido");
        }
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(ValidacaoUtil.isEmailValido(email)) {
            this.email = email;
        } else {
            System.out.println("Precisa ser um email válido");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
