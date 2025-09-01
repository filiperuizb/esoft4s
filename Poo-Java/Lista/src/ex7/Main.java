package ex7;

public class Main {
    public static void main(String[] args) {
        Professor arantes = new Professor("Arantes");

        Disciplina comoNaoSerUmProgramador = new Disciplina("Como não ser um programador", arantes);
        Disciplina comoAplicarGoHorse = new Disciplina("Como aplicar Go Horse", arantes);
        Disciplina comoNaoSerEticoNoTrabalho = new Disciplina("Como não ser ético no trabalho", arantes);
        Disciplina comoDormirNoTrabalho = new Disciplina("Como dormir no trabalho", arantes);
        Disciplina comoFugirDoTrabalho = new Disciplina("Como fugir do trabalho", arantes);
        Disciplina comoRoubarPacocaDosColegas = new Disciplina("Como roubar paçoca dos colegas", arantes);

        Professor boligon = new Professor("Boligon");
        Disciplina comoSerUmBomProgramador = new Disciplina("Como ser um bom programador", boligon);
        Disciplina comoNaoSerUmProfissionalIgualOArantes = new Disciplina("Como não ser um profissional igual o Arantes", boligon);

        Professor senra = new Professor("Senra");
        //O senra ta num ano sábatico
    }
}
