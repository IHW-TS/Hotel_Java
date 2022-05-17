package MVC.vue;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import MVC.controller.*;
import MVC.controller.AdminControllerChambre;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AdminChambre extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField textField;
    private JButton add;
    private JRadioButton Simple;
    private JRadioButton dDouble;
    private JRadioButton SN;
    private JRadioButton SP;
    private Font mainLabel;
    private Font label;
    private JFrame frame;
    private JLabel err;

    private JButton supr;
    private JButton main;

    public AdminChambre() {
        frame = new JFrame("Admin Gestion Chambre");
        mainLabel = new Font("Arial", Font.BOLD, 25);
        label = new Font("Arial", Font.BOLD, 14);
        AdminControllerChambre controller = new AdminControllerChambre(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 500);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(150, 50, 430, 380);
        contentPane.add(scrollPane);

        table = new JTable();
        table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Numero", "Num Chambre", "Type" }));
        scrollPane.setViewportView(table);
        controller.setTable();

        JLabel Chambre = new JLabel("Chambre");
        Chambre.setBounds(250, 5, 115, 45);
        contentPane.add(Chambre);

        JLabel roomNo = new JLabel("Num Chambre");
        roomNo.setBounds(0, 45, 70, 15);
        contentPane.add(roomNo);

        SP = new JRadioButton("Suite Prés");
        SP.setBounds(10, 105, 150, 20);
        contentPane.add(SP);

        SN = new JRadioButton("Suite Norm");
        SN.setBounds(10, 120, 150, 20);
        contentPane.add(SN);

        dDouble = new JRadioButton("Double");
        dDouble.setBounds(10, 135, 150, 20);
        contentPane.add(dDouble);

        Simple = new JRadioButton("Simple");
        Simple.setBounds(10, 150, 150, 20);
        contentPane.add(Simple);

        add = new JButton("Ajt Chambre");
        add.setBounds(20, 190, 115, 20);
        contentPane.add(add);

        supr = new JButton("Delete");
        supr.setBounds(20, 220, 117, 20);
        contentPane.add(supr);

        main = new JButton("Acceuil Adm");
        main.setBounds(20, 250, 115, 20);
        contentPane.add(main);

        err = new JLabel("Mauvais Num");
        err.setForeground(Color.YELLOW);
        err.setBounds(10, 95, 150, 15);
        err.setVisible(false);
        contentPane.add(err);

        textField = new JTextField();
        textField.setBounds(5, 60, 135, 25);
        contentPane.add(textField);
        textField.setColumns(10);

        dDouble.setOpaque(false);
        Simple.setOpaque(false);
        SN.setOpaque(false);
        SP.setOpaque(false);

        Chambre.setFont(mainLabel);
        Chambre.setForeground(Color.BLACK);
        roomNo.setFont(label);
        roomNo.setForeground(Color.BLACK);
        dDouble.setFont(label);
        dDouble.setForeground(Color.BLACK);
        SN.setFont(label);
        SN.setForeground(Color.BLACK);
        SP.setFont(label);
        SP.setForeground(Color.BLACK);
        Simple.setFont(label);
        Simple.setForeground(Color.BLACK);

        add.addActionListener(controller);
        supr.addActionListener(controller);
        main.addActionListener(controller);

        dDouble.addActionListener(controller);
        SN.addActionListener(controller);
        Simple.addActionListener(controller);
        SP.addActionListener(controller);

    }

    public JTable getTable() {
        return table;
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getSupr() {
        return supr;
    }

    public JButton getMain() {
        return main;
    }

    public JRadioButton getDouble() {
        return dDouble;
    }

    public JRadioButton getSimple() {
        return Simple;
    }

    public JRadioButton getSN() {
        return SN;
    }

    public JRadioButton getSP() {
        return SP;
    }

    public int getNumero() {
        int i;
        try {
            i = Integer.parseInt(textField.getText());
            return i;
        } catch (Exception e) {
            err.setVisible(true);
        }
        return -1;
    }

    public void setTable() {
        table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Numero", "Chambre Num", "Type" }));
    }

}
