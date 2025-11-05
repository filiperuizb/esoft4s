package br.com.boligon.filipe.ex3;

public class TarefaService {
    TarefaBanco tarefaBanco = new TarefaBanco();
    public TarefaService() {}

    public void adicionarTarefa(String descricao) {
        Tarefa tarefaNova = new Tarefa(descricao);
        tarefaBanco.inserirTarefa(tarefaNova);
    }

    public void mostrarTarefas() {
        tarefaBanco.listarTodos();
    }

    public void mostrarTarefaPendente() {
        tarefaBanco.listarPendentes();
    }

    public void atualizarStatusTarefa(int id) {
        tarefaBanco.atualizarStatus(id);
    }

    public void excluirTarefa(int id) {
        tarefaBanco.removerTarefa(id);
    }
}
