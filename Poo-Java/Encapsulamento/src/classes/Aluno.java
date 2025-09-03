package classes;

public class Aluno {
    private String nome;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNotaX(Integer bimestre, Double nota) {
        if(nota < 0 || nota > 10) {
            System.out.println("A nota não pode ser menor do que 0 ou maior que 10");
        } else {
            switch(bimestre) {
                case 1:
                    this.nota1 = nota;
                    break;
                case 2:
                    this.nota2 = nota;
                    break;
                default:
                    System.out.println("Bimestre inválido deve ser 1 ou 2");
            }
        }
    }
}
