package br.com.boligon.filipe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemStorage {
    public void criarTabela() {
        String ddl = """
                CREATE TABLE IF NOT EXISTS conta (
                  id INT AUTO_INCREMENT PRIMARY KEY,
                  titular VARCHAR(255) NOT NULL,
                  tipo VARCHAR(50) NOT NULL,
                  saldo DOUBLE NOT NULL,
                  tarifa_mensal DOUBLE NOT NULL,
                  rendimento_mensal DOUBLE NOT NULL
                );
                
                """;
        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(ddl)) {
            stmt.execute();
        } catch(SQLException e) {
            System.out.println("Erro ao criar tabela " + e.getMessage());
        }
    }

    public void inserir(ContaBancaria conta) {
        String insert = """
                INSERT INTO conta (titular, tipo, saldo, tarifa_mensal, rendimento_mensal)
                VALUES (?, ?, ?, ?, ?);
                """;

        try(Connection conexao = ConexaoBanco.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(insert)) {
            stmt.setString(1, conta.getTitular());
            stmt.setString(2, conta.getTipo());
            stmt.setDouble(3, conta.getSaldo());
            stmt.setDouble(4, conta.calcularTarifaMensal());
            stmt.setDouble(5, conta.calcularRendimentoMensal());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados " + e.getMessage());
        }
    }

    public List<ContaBancaria> listar() {
        List<ContaBancaria> contas = new ArrayList<>();

        String query = "SELECT * FROM conta";

        try(Connection conexao = ConexaoBanco.getConexao(); PreparedStatement stmt = conexao.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                String titular = rs.getString("titular");
                double saldo = rs.getDouble("saldo");
                String tipo = rs.getString("tipo");

                switch(tipo) {
                    case "Corrente":
                        contas.add(new ContaCorrente(titular, saldo));
                        break;
                    case "Poupança":
                        contas.add(new ContaPoupanca(titular, saldo));
                        break;
                    default:
                        System.out.println("Tipo inválido");
                }
            }
        } catch(SQLException e) {
            System.out.println("Erro ao listar dados " + e.getMessage());
        }

        return contas;
    }


}
