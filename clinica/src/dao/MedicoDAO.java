package dao;

import model.Medico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicoDAO {

    public void inserir(Medico medico) {

        String sql =
                "INSERT INTO medico " +
                "(nome, crm, especialidade, telefone) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    medico.getNome());

            stmt.setString(2,
                    medico.getCrm());

            stmt.setString(3,
                    medico.getEspecialidade());

            stmt.setString(4,
                    medico.getTelefone());

            stmt.execute();

            stmt.close();
            conn.close();

            System.out.println(
                    "Médico salvo!"
            );

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}