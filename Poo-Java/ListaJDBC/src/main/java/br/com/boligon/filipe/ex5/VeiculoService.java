package br.com.boligon.filipe.ex5;

public class VeiculoService {

    public VeiculoBanco veiculoBanco = new VeiculoBanco();

    public void adicionarVeiculo(String placa, String marca, String modelo, int ano) {
        Veiculo veiculo = new Veiculo(placa, marca, modelo, ano);
        veiculoBanco.inserirVeiculo(veiculo);
    }

    public void mostrarPatio() {
        veiculoBanco.listarPatio();
    }

    public void mostrarPorPlaca(String placa) {
        veiculoBanco.buscarPorPlaca(placa);
    }

    public void atualizarAno(String placa, int ano) {
        veiculoBanco.atualizarAno(placa, ano);
    }

    public void venderVeiculo(String placa) {
        veiculoBanco.venderVeiculo(placa);
    }
}
