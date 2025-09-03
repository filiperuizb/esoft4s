package classes;

public class Biblioteca {
    private String titulo;
    private String autor;
    private Boolean disponivel;

    public void emprestarLivro() {
        if(this.disponivel) {
            this.disponivel = false;
        } else {
            System.out.println("O livro não está disponível");
        }
    }

    public void devolverLivro() {
        if(!this.disponivel) {
            this.disponivel = true;
        } else{
            System.out.println("O livro não está disponível");
        }
    }
}
