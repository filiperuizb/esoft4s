package br.com.boligon.filipe.ex2;

import br.com.boligon.filipe.utils.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteBanco {

    public void inserirCliente(Cliente cliente) {
        String sql = """
                INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)
                """;

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());

            stmt.executeUpdate();
            System.out.println("Cliente foi inserido!!!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir o cliente: " + e.getMessage());
        }
    }

    public void listarTodos() {
        String sql = "SELECT * FROM cliente";

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                System.out.printf("ID: %d - Nome: %s - Email: %s - Telefone: %s%n", id, nome, email, telefone);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar os clientes: " + e.getMessage());
        }
    }

    public void listarClientePorEmail(String email) {
        String sql = "SELECT * FROM CLIENTE WHERE email = ?";

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if(!rs.next()) {
                System.out.println("Nenhum cliente encontrado com o email fornecido.");
            } else {
                do {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String telefone = rs.getString("telefone");

                    System.out.printf("ID: %d - Nome: %s - Email: %s - Telefone: %s%n", id, nome, email, telefone);
                } while (rs.next());
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar o cliente por email: " + e.getMessage());
        }
    }

    public void atualizarTelefone(int id, String telefone) {
        String sql = "UPDATE cliente SET telefone = ? WHERE id = ?";

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, telefone);
            stmt.setInt(2, id);
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Telefone atualizado com sucesso!");
            } else {
                System.out.println("Nenhum cliente encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o telefone: " + e.getMessage());
        }
    }

    public void removerCliente(int id) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Cliente deletado com sucesso!");
            } else {
                System.out.println("Nenhum cliente encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o cliente: " + e.getMessage());
        }
    }


}
