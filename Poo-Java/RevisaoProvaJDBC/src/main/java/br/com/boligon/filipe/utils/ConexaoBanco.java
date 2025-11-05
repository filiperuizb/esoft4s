package br.com.boligon.filipe.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection getConexao() {
        String url = "jdbc:h2:./exercicio_revisao";
        String user = "root";
        String password = "";
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(url, user, password);
        } catch(SQLException e) {
            System.out.println("Falha ao conectar ao banco de dados + " + e.getMessage());
        }

        return conexao;
    }
}
