package view;

import dao.MedicoDAO;
import model.Medico;

import javax.swing.*;

public class TelaMedico extends JFrame {

    JLabel lblNome =
            new JLabel("Nome");

    JTextField txtNome =
            new JTextField();

    JLabel lblCrm =
            new JLabel("CRM");

    JTextField txtCrm =
            new JTextField();

    JLabel lblEspecialidade =
            new JLabel("Especialidade");

    JTextField txtEspecialidade =
            new JTextField();

    JLabel lblTelefone =
            new JLabel("Telefone");

    JTextField txtTelefone =
            new JTextField();

    JButton btnSalvar =
            new JButton("Salvar");

    JButton btnVoltar =
            new JButton("Voltar");

    public TelaMedico() {

        setTitle("CRUD Médico");

        setSize(450,400);

        setLayout(null);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        lblNome.setBounds(30,30,100,30);
        txtNome.setBounds(130,30,250,30);

        lblCrm.setBounds(30,80,100,30);
        txtCrm.setBounds(130,80,250,30);

        lblEspecialidade.setBounds(30,130,100,30);
        txtEspecialidade.setBounds(130,130,250,30);

        lblTelefone.setBounds(30,180,100,30);
        txtTelefone.setBounds(130,180,250,30);

        btnSalvar.setBounds(130,260,120,40);

        btnVoltar.setBounds(260,260,120,40);

        add(lblNome);
        add(txtNome);

        add(lblCrm);
        add(txtCrm);

        add(lblEspecialidade);
        add(txtEspecialidade);

        add(lblTelefone);
        add(txtTelefone);

        add(btnSalvar);
        add(btnVoltar);

        btnSalvar.addActionListener(e -> {

            Medico medico =
                    new Medico();

            medico.setNome(
                    txtNome.getText()
            );

            medico.setCrm(
                    txtCrm.getText()
            );

            medico.setEspecialidade(
                    txtEspecialidade.getText()
            );

            medico.setTelefone(
                    txtTelefone.getText()
            );

            MedicoDAO dao =
                    new MedicoDAO();

            dao.inserir(medico);

            JOptionPane.showMessageDialog(
                    null,
                    "Médico salvo!"
            );
        });

        btnVoltar.addActionListener(e -> {

            dispose();

            new TelaInicial();
        });

        setVisible(true);
    }
}