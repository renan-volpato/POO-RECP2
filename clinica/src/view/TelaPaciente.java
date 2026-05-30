package view;

import dao.PacienteDAO;
import model.Paciente;

import javax.swing.*;

public class TelaPaciente extends JFrame {

    JLabel lblNome =
            new JLabel("Nome");

    JTextField txtNome =
            new JTextField();

    JLabel lblCpf =
            new JLabel("CPF");

    JTextField txtCpf =
            new JTextField();

    JLabel lblIdade =
            new JLabel("Idade");

    JTextField txtIdade =
            new JTextField();

    JLabel lblTelefone =
            new JLabel("Telefone");

    JTextField txtTelefone =
            new JTextField();

    JButton btnSalvar =
            new JButton("Salvar");

    JButton btnVoltar =
            new JButton("Voltar");

    public TelaPaciente() {

        setTitle("CRUD Paciente");

        setSize(450,400);

        setLayout(null);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        lblNome.setBounds(30,30,100,30);
        txtNome.setBounds(130,30,250,30);

        lblCpf.setBounds(30,80,100,30);
        txtCpf.setBounds(130,80,250,30);

        lblIdade.setBounds(30,130,100,30);
        txtIdade.setBounds(130,130,250,30);

        lblTelefone.setBounds(30,180,100,30);
        txtTelefone.setBounds(130,180,250,30);

        btnSalvar.setBounds(130,260,120,40);

        btnVoltar.setBounds(260,260,120,40);

        add(lblNome);
        add(txtNome);

        add(lblCpf);
        add(txtCpf);

        add(lblIdade);
        add(txtIdade);

        add(lblTelefone);
        add(txtTelefone);

        add(btnSalvar);
        add(btnVoltar);

        btnSalvar.addActionListener(e -> {

            Paciente paciente =
                    new Paciente();

            paciente.setNome(
                    txtNome.getText()
            );

            paciente.setCpf(
                    txtCpf.getText()
            );

            paciente.setIdade(
                    Integer.parseInt(
                            txtIdade.getText()
                    )
            );

            paciente.setTelefone(
                    txtTelefone.getText()
            );

            PacienteDAO dao =
                    new PacienteDAO();

            dao.inserir(paciente);

            JOptionPane.showMessageDialog(
                    null,
                    "Paciente salvo!"
            );
        });

        btnVoltar.addActionListener(e -> {

            dispose();

            new TelaInicial();
        });

        setVisible(true);
    }
}