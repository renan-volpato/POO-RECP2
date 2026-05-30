package view;

import javax.swing.*;

public class TelaInicial extends JFrame {

    JButton btnMedico =
            new JButton("Cadastrar Médicos");

    JButton btnPaciente =
            new JButton("Cadastrar Pacientes");

    JButton btnConsulta =
            new JButton("Marcar Consultas");

    public TelaInicial() {

        setTitle("Sistema Clínica");

        setSize(400,300);

        setLayout(null);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        btnMedico.setBounds(
                100,40,180,40
        );

        btnPaciente.setBounds(
                100,100,180,40
        );

        btnConsulta.setBounds(
                100,160,180,40
        );

        add(btnMedico);
        add(btnPaciente);
        add(btnConsulta);

        btnMedico.addActionListener(e -> {

            new TelaMedico();
        });

        btnPaciente.addActionListener(e -> {

            new TelaPaciente();
        });

        btnConsulta.addActionListener(e -> {

            new TelaConsulta();
        });

        setVisible(true);
    }
}