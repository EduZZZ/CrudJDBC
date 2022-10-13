package br.com.loja_informatica.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "3260";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/loja_informatica";

    public static Connection connectionToMySQL() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(USERNAME, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection con = connectionToMySQL();

        if (con != null) {
            System.out.println("Connection sucessful!");
            con.close();

        }
    }
}
