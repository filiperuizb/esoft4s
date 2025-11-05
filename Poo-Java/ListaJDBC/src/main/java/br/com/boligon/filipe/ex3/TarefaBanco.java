package br.com.boligon.filipe.ex3;

import br.com.boligon.filipe.utils.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TarefaBanco {
    public void inserirTarefa(Tarefa tarefa) {
        String sql = "INSERT INTO tarefa (descricao) VALUES (?)";
        try (Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, tarefa.getDescricao());
            stmt.executeUpdate();
        } catch(SQLException e) {
            System.out.println("Erro ao inserir a tarefa: " + e.getMessage());
        }
    }

    public void listarTodos() {
        String sql = "SELECT * FROM tarefa";

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {

            var rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String status = rs.getString("status");

                System.out.printf("ID: %d - Descrição: %s - Status: %s%n", id, descricao, status);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar as tarefas: " + e.getMessage());
        }
    }

    public void listarPendentes() {
        String sql = "SELECT * FROM tarefa WHERE status = 'PENDENTE'";

        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String status = rs.getString("status");

                System.out.printf("ID: %d - Descrição: %s - Status: %s%n", id, descricao, status);
            }

        } catch(SQLException e) {
            System.out.println("Erro ao listar as tarefas pendentes: " + e.getMessage());
        }
    }

    public void atualizarStatus(int id) {
        String sql = "UPDATE tarefa SET status = 'CONCLUIDA' WHERE id = ?";
        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Tarefa atualizada com sucesso!");
            } else {
                System.out.println("Nenhuma tarefa encontrada com o ID fornecido.");
            }
        } catch(SQLException e) {
            System.out.println("Erro ao atualizar a tarefa: " + e.getMessage());
        }
    }

    public void removerTarefa(int id) {
        String sql = "DELETE FROM tarefa WHERE id = ?";
        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Nenhuma tarefa encontrada com o ID fornecido.");
            }
        } catch(SQLException e) {
            System.out.println("Erro ao remover a tarefa: " + e.getMessage());
        }
    }
}
