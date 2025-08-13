import domain.*;
import service.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ProfessorService professorService = new ProfessorService();
        professorService.criarProfessor("Maurilio", "34354667812",  LocalDate.of(1980, 5, 12), "4214141");
        Professor professor = professorService.getProfessor();

        AlunoService alunoService = new AlunoService();
        alunoService.criarAluno("Filipe Boligon", "13573925910",  LocalDate.of(2005, 9, 16), "240420692");
        Aluno aluno = alunoService.getAluno();

        MateriaService materiaService = new MateriaService();
        Materia materia = materiaService.criarMateria("Sistemas Operacionais", professor);

        TurmaService turmaService = new TurmaService();
        Turma turma = turmaService.criarTurma(materia);

        MatriculaService matriculaService = new MatriculaService();
        Matricula matricula = matriculaService.criarMatricula(aluno, turma, 8.0, 7.5);

        System.out.println(professorService);
        System.out.println(alunoService);
        System.out.println(materia);
        System.out.println(matricula);
        System.out.println(turma);
    }
}
