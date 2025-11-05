package br.com.boligon.filipe.ex1;

import br.com.boligon.filipe.utils.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoBanco {
    public void inserirProduto(Produto produto) {

        String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());

            stmt.executeUpdate();
            System.out.println("Produto foi inserido!!!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir o produto: " + e.getMessage());
        }
    }

    public void listarProdutos() {
        String sql = "SELECT * FROM produto";

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                int quantidade = rs.getInt("quantidade");

                System.out.printf("ID: %d - Nome: %s - Preço: %.2f - Quantidade: %d%n", id, nome, preco, quantidade);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar os produtos: " + e.getMessage());
        }
    }

    public void updateProduto(int id, double novoPreco) {
        String sql = """
                UPDATE produto
                SET PRECO = ?
                WHERE ID = ?
                """;

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setDouble(1, novoPreco);
            stmt.setInt(2, id);
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o produto: " + e.getMessage());
        }
    }

    public void deletarProduto(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Produto deletado com sucesso!");
            } else {
                System.out.println("Id inválido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o produto: " + e.getMessage());
        }
    }
}
