package br.com.boligon.filipe.ex5;

import br.com.boligon.filipe.utils.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeiculoBanco {
    public void inserirVeiculo(Veiculo veiculo) {
        String sql = "INSERT INTO veiculo (placa, marca, modelo, ano) VALUES (?, ?, ?, ?)";

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getMarca());
            stmt.setString(3, veiculo.getModelo());
            stmt.setInt(4, veiculo.getAno());

            stmt.executeUpdate();
            System.out.println("Veículo inserido com sucesso!");

        } catch(SQLException e) {
            System.out.println("Erro ao inserir o veículo: " + e.getMessage());
        }
    }

    public void listarPatio() {
        String sql = "SELECT * FROM veiculo;";

        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql)) {

            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                do {
                    String placa = rs.getString("placa");
                    String marca = rs.getString("marca");
                    String modelo = rs.getString("modelo");
                    int ano = rs.getInt("ano");

                    System.out.printf("Placa: %s - Marca: %s - Modelo: %s - Ano: %d%n",
                            placa, marca, modelo, ano);
                } while(rs.next());
            } else {
                System.out.println("O pátio está vazio.");
            }

        } catch(SQLException e) {
            System.out.println("Erro ao listar o pátio: " + e.getMessage());
        }
    }

    public void buscarPorPlaca(String placa) {
        String sql = "SELECT * FROM veiculo WHERE placa = ?;";

        try(Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, placa);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int ano = rs.getInt("ano");

                System.out.printf("Placa: %s - Marca: %s - Modelo: %s - Ano: %d%n",
                        placa, marca, modelo, ano);
            } else {
                System.out.printf("Veículo com a placa %s não foi encontrado!!!", placa);
            }

        } catch(SQLException e) {
            System.out.println("Erro ao buscar o veículo: " + e.getMessage());
        }
    }

    public void atualizarAno(String placa, int ano) {
        String sql = "UPDATE veiculo SET ano = ? WHERE placa = ?;";

        try(Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, ano);
            stmt.setString(2, placa);

            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas > 0) {
                System.out.println("Ano do veículo atualizado com sucesso!");
            } else {
                System.out.println("Veículo com o placa " + placa + " não foi encontrado.");
            }

        } catch(SQLException e) {
            System.out.println("Erro ao atualizar o ano do veículo: " + e.getMessage());
        }
    }

    public void venderVeiculo(String placa) {
        String sql = "DELETE FROM veiculo WHERE placa = ?";

        try(Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, placa);

            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas > 0) {
                System.out.println("Veículo vendido e removido do pátio com sucesso!");
            } else {
                System.out.println("Veículo com a placa " + placa + " não foi encontrado.");
            }

        } catch(SQLException e) {
            System.out.println("Erro ao vender o veículo: " + e.getMessage());
        }
    }
}
