package dao;

import model.Consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaDAO {

    public void inserir(Consulta consulta) {

        String sql =
                "INSERT INTO consulta " +
                "(data_consulta, horario, medico, paciente) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn =
                Conexao.conectar();

        try {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1,
                    consulta.getDataConsulta());

            stmt.setString(2,
                    consulta.getHorario());

            stmt.setString(3,
                    consulta.getMedico());

            stmt.setString(4,
                    consulta.getPaciente());

            stmt.execute();

            stmt.close();
            conn.close();

            System.out.println(
                    "Consulta salva!"
            );

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
