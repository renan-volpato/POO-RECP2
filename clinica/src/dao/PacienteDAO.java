package dao;

import model.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PacienteDAO {

    public void inserir(Paciente paciente) {

        String sql =
                "INSERT INTO paciente " +
                "(nome, cpf, telefone, idade) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    paciente.getNome());

            stmt.setString(2,
                    paciente.getCpf());

            stmt.setString(3,
                    paciente.getTelefone());

            stmt.setInt(4,
                    paciente.getIdade());

            stmt.execute();

            stmt.close();
            conn.close();

            System.out.println(
                    "Paciente salvo!"
            );

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}