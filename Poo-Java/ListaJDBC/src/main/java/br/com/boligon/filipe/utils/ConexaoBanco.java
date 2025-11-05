package br.com.boligon.filipe.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection getConexao() {
        String url = "jdbc:h2:./exercicios_lista";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Falha ao conectar ao banco de dados" + e.getMessage());
        }
    }

}
