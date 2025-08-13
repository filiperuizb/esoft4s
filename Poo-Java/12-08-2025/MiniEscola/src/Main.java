import service.AlunoService;

public class Main {
    public static void main(String[] args) {
        AlunoService alunoService = new AlunoService();

        alunoService.criarAluno("Filipe Boligon", "13573925910", "2005-09-16", "240420692");

        System.out.println(alunoService);
    }
}