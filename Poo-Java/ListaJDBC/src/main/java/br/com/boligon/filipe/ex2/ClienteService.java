package br.com.boligon.filipe.ex2;

public class ClienteService {

    ClienteBanco cliente = new ClienteBanco();

    public void adicionarCliente(String nome, String email, String telefone) {
        Cliente clienteNovo = new Cliente(nome, email, telefone);
        cliente.inserirCliente(clienteNovo);
    }

    public void mostrarClientes() {
        cliente.listarTodos();
    }

    public void buscarClientePorEmail(String email) {
        cliente.listarClientePorEmail(email);
    }

    public void atualizarTelefoneCliente(int id, String telefone) {
        cliente.atualizarTelefone(id, telefone);
    }

    public void excluirCliente(int id) {
        cliente.removerCliente(id);
    }
}
