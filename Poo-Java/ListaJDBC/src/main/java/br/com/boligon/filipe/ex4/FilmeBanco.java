package br.com.boligon.filipe.ex4;

import br.com.boligon.filipe.utils.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmeBanco {
    public void inserirFilme(Filme filme) {
        String sql = """
                INSERT INTO filme (titulo, diretor, ano_lancamento) VALUES (?, ?, ?);
                """;

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, filme.getTitulo());
            stmt.setString(2, filme.getDiretor());
            stmt.setInt(3, filme.getAnoLancamento());

            stmt.executeUpdate();
            System.out.println("Filme inserido com sucesso!");

        } catch(SQLException e) {
            System.out.println("Erro ao inserir o filme: " + e.getMessage());
        }
    }

    public void listarTodos() {
        String sql = "SELECT * FROM filme;";

        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String diretor = rs.getString("diretor");
                int anoLancamento = rs.getInt("ano_lancamento");

                System.out.printf("ID: %d - Título: %s - Diretor: %s - Ano de Lançamento: %d%n",
                        id, titulo, diretor, anoLancamento);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar os filmes: " + e.getMessage());
        }
    }

    public void buscarPorTitulo(String pesquisa) {
       String sql = "SELECT * FROM filme WHERE LOWER(titulo) LIKE ?;";

         try(Connection conexao = ConexaoBanco.getConexao();
              PreparedStatement stmt = conexao.prepareStatement(sql)) {
             stmt.setString(1, "%" + pesquisa.toLowerCase() + "%");

              ResultSet rs = stmt.executeQuery();

              if(!rs.next()) {
                  System.out.println("Nenhum filme encontrado com o título: " + pesquisa);
              } else {
                  do {
                      int id = rs.getInt("id");
                      String titulo = rs.getString("titulo");
                      String diretor = rs.getString("diretor");
                      int anoLancamento = rs.getInt("ano_lancamento");

                      System.out.printf("ID: %d - Título: %s - Diretor: %s - Ano de Lançamento: %d%n",
                              id, titulo, diretor, anoLancamento);
                  } while(rs.next());
              }
         } catch (SQLException e) {
              System.out.println("Erro ao buscar o filme por título: " + e.getMessage());
         }
    }

    public void atualizarDiretor(int id, String novoDiretor) {
        String sql = """
                UPDATE filme SET diretor = ? WHERE id = ?;
                """;

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, novoDiretor);
            stmt.setInt(2, id);

            int linhas = stmt.executeUpdate();
            if(linhas > 0) {
                System.out.println("Diretor atualizado com sucesso!");
            } else {
                System.out.println("Nenhum filme encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o diretor: " + e.getMessage());
        }
    }

    public void removerFilme(int id) {
        String sql = """
                DELETE FROM filme WHERE id = ?;
                """;

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);

            int linhas = stmt.executeUpdate();
            if(linhas > 0) {
                System.out.println("Filme removido com sucesso!");
            } else {
                System.out.println("Nenhum filme encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao remover o filme: " + e.getMessage());
        }

    }
}
