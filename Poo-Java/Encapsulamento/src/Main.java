import classes.Aluno;
import classes.ContaBancaria;
import classes.Funcionario;
import classes.Pessoa;

public class Main {
    public static void main(String[] args) {
       Pessoa p = new Pessoa("Teste");

       p.setIdade(-2);

       ContaBancaria cb = new ContaBancaria("Eu", 12321321);

       cb.sacarSaldo(1400.00);

       cb.depositarSaldo(1300.00);

       cb.sacarSaldo(1400.00);

       cb.sacarSaldo(1200.00);

        System.out.println(cb.getSaldo());

        Funcionario f = new Funcionario("Filipe", "Dev", 3500.00);

        f.setSalario(-5.00);
        System.out.println(f.getSalario());


        Aluno aluno = new Aluno("Filipe");

        aluno.setNotaX(3, 4.00);

        aluno.setNotaX(2, -2.0);

        aluno.setNotaX(2, 9.00);
        System.out.println(aluno.getNota2());
    }
}