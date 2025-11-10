package br.com.boligon.filipe.banco;

import br.com.boligon.filipe.entity.ProdutoFisico;
import br.com.boligon.filipe.entity.ServicoDigital;
import br.com.boligon.filipe.utils.ConexaoBanco;
import br.com.boligon.filipe.utils.ItemVendavel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemStorage {
    private String ddl = """
            CREATE TABLE IF NOT EXISTS item (
             id INT AUTO_INCREMENT PRIMARY KEY,
             nome VARCHAR(255) NOT NULL,
             preco_base DOUBLE,
             tipo VARCHAR(50),
             preco_final DOUBLE,
             imposto DOUBLE
            );
            """;

    private String insert = """
            INSERT INTO item(nome, preco_base, tipo, preco_final, imposto) 
            VALUES(?, ?, ?, ?, ?);
            """;

    private String query = """
            SELECT * FROM item;
            """;

    private String update = """
        UPDATE item SET preco_base = ? WHERE id = ?;
        """;

    private String delete = """
            DELETE FROM item WHERE id = ?;
            """;


    public void criarTabela() {
        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(ddl)) {

            stmt.execute();

        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void salvarItem(ItemVendavel item) {

        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(insert)) {
            stmt.setString(1, item.getNome());
            stmt.setDouble(2, item.getPrecoBase());
            stmt.setString(3, item.getTipo());
            stmt.setDouble(4, item.calcularPrecoFinal());
            stmt.setDouble(5, item.calcularImposto());

            stmt.executeUpdate();
            System.out.println("Inserido com sucesso!");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<ItemVendavel> buscarTodosItems() {

        List<ItemVendavel> itens = new ArrayList<>();

        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();


            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double precoBase = rs.getDouble("preco_base");
                String tipo = rs.getString("tipo");

                switch(tipo) {
                    case "Físico":
                        ProdutoFisico produtoFisico = new ProdutoFisico(id, nome, precoBase);
                        itens.add(produtoFisico);
                        break;
                    case "Digital":
                        ServicoDigital servicoDigital = new ServicoDigital(id, nome, precoBase);
                        itens.add(servicoDigital);
                        break;
                    default:
                        System.out.println("Tipo desconhecido!");
                        break;
                }

            }


        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return itens;
    }

    public void atualizarPrecoBase(int id, double novoPrecoBase) {

        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(update)) {
            stmt.setDouble(1, novoPrecoBase);
            stmt.setInt(2, id);
            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas == 0) {
                throw new IllegalArgumentException("Item com ID " + id + " não encontrado!");
            } else {
                System.out.println("Atualizado com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public void deletar(int id) {
        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(delete)) {

            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas == 0 ) {
                throw new IllegalArgumentException("Item com o ID" + id + " não encontrado!");
            }
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
