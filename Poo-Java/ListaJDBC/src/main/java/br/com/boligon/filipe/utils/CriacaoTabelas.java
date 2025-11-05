package br.com.boligon.filipe.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CriacaoTabelas {

    private int idExercicio;

    public String ex1 = """
            CREATE TABLE IF NOT EXISTS produto (
             id INT AUTO_INCREMENT PRIMARY KEY,
             nome VARCHAR(255) NOT NULL,
             preco DOUBLE,
             quantidade INT
            );
            """;

    public String ex2 = """
            CREATE TABLE IF NOT EXISTS cliente (
               id INT AUTO_INCREMENT PRIMARY KEY,
               nome VARCHAR(255) NOT NULL,
               email VARCHAR(255) UNIQUE,
               telefone VARCHAR(20)
              );
            """;

    public String ex3 = """
            CREATE TABLE IF NOT EXISTS tarefa (
             id INT AUTO_INCREMENT PRIMARY KEY,
             descricao VARCHAR(255) NOT NULL,
             status VARCHAR(20) DEFAULT 'PENDENTE'
            );
            """;

    public String ex4 = """
               CREATE TABLE IF NOT EXISTS filme (
                id INT AUTO_INCREMENT PRIMARY KEY,
                titulo VARCHAR(255) NOT NULL,
                diretor VARCHAR(255),
                ano_lancamento INT
               );
            """;

    public String ex5 = """
            CREATE TABLE IF NOT EXISTS veiculo (
             placa VARCHAR(10) PRIMARY KEY, -- A Placa é a Chave Primária!
             marca VARCHAR(100),
             modelo VARCHAR(100),
             ano INT
            );
            """;


    public void criarTabela(Connection conexao, String sql) {
        try(PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.execute();
        } catch (Exception e) {
            System.out.println("oi" + e.getMessage());
        }
    }

    public CriacaoTabelas() {
    }
}
