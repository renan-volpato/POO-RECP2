package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/clinica";

    private static final String USUARIO =
            "root";

    private static final String SENHA =
            "vagnerlove";

    public static Connection conectar() {

        Connection conn = null;

        try {

            conn =
                    DriverManager.getConnection(
                            URL,
                            USUARIO,
                            SENHA
                    );

            System.out.println("Conectado!");

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return conn;
    }
}
