import java.util.ArrayList;
import java.util.List;

public class Banho {
    String sabao;
    double qtdAgua;
    Cachorro cachorro;
    Pessoa[] funcionarios;

    Banho(String sabao, double qtdAgua, Cachorro cachorro, Pessoa funcionario) {
        this.sabao = sabao;
        this.qtdAgua = qtdAgua;
        this.cachorro = cachorro;
        this.funcionarios = new Pessoa[3];
        this.funcionarios[0] = funcionario;
    }

    void addFuncionario(Pessoa novoFuncionario) {
        if (novoFuncionario.matricula!=0) {
            for(int i=0; i<3; i++) {
                if (funcionarios[i] == null){
                    funcionarios[i] = novoFuncionario;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cachorro)
                .append(funcionarios[0])
                .append("\n---------------------------------\n")
                .append("BANHO: \n")
                .append("Sabão: ").append(sabao)
                .append(" - Quant/Água: ").append(qtdAgua)
                .append("\nCachorro: ").append(cachorro.nome)
                .append("\nDono: ").append(cachorro.dono.nome)
                .append("\nFuncionário: ").append(funcionarios[0].nome)
                .append(" - ").append(funcionarios[0].matricula)
                .append("\n---------------------------------\n");

        return sb.toString();
    }

}
