package view;

import dao.ConsultaDAO;
import model.Consulta;

import javax.swing.*;

public class TelaConsulta extends JFrame {

    JLabel lblData =
            new JLabel("Data");

    JTextField txtData =
            new JTextField();

    JLabel lblHorario =
            new JLabel("Horário");

    JTextField txtHorario =
            new JTextField();

    JLabel lblMedico =
            new JLabel("Médico");

    JTextField txtMedico =
            new JTextField();

    JLabel lblPaciente =
            new JLabel("Paciente");

    JTextField txtPaciente =
            new JTextField();

    JButton btnSalvar =
            new JButton("Salvar");

    JButton btnVoltar =
            new JButton("Voltar");

    public TelaConsulta() {

        setTitle("CRUD Consulta");

        setSize(400,400);

        setLayout(null);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        lblData.setBounds(30,30,100,30);
        txtData.setBounds(130,30,200,30);

        lblHorario.setBounds(30,80,100,30);
        txtHorario.setBounds(130,80,200,30);

        lblMedico.setBounds(30,130,100,30);
        txtMedico.setBounds(130,130,200,30);

        lblPaciente.setBounds(30,180,100,30);
        txtPaciente.setBounds(130,180,200,30);

        btnSalvar.setBounds(130,250,120,40);

        btnVoltar.setBounds(260,250,100,40);

        add(lblData);
        add(txtData);

        add(lblHorario);
        add(txtHorario);

        add(lblMedico);
        add(txtMedico);

        add(lblPaciente);
        add(txtPaciente);

        add(btnSalvar);
        add(btnVoltar);

        btnSalvar.addActionListener(e -> {

            Consulta consulta =
                    new Consulta();

            consulta.setDataConsulta(
                    txtData.getText()
            );

            consulta.setHorario(
                    txtHorario.getText()
            );

            consulta.setMedico(
                    txtMedico.getText()
            );

            consulta.setPaciente(
                    txtPaciente.getText()
            );

            ConsultaDAO dao =
                    new ConsultaDAO();

            dao.inserir(consulta);

            JOptionPane.showMessageDialog(
                    null,
                    "Consulta salva!"
            );
        });

        btnVoltar.addActionListener(e -> {

            dispose();

            new TelaInicial();
        });

        setVisible(true);
    }
}