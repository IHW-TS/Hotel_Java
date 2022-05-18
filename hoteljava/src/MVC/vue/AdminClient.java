package MVC.vue;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import MVC.controller.AdminClientController;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

import MVC.model.Client;

public class AdminClient extends JFrame {

  private JPanel contentPanel;
  private Font mainLabel;
  private AdminClientController controller;
  private JTable table;

  public AdminClient() {
    mainLabel = new Font("Arial", Font.BOLD, 34);
    controller = new AdminClientController(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 590, 387);
    setLocationRelativeTo(null);
    contentPanel = new JPanel();
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPanel);
    contentPanel.setLayout(null);

    JLabel csDetails = new JLabel("Details Client");
    csDetails.setFont(mainLabel);
    csDetails.setForeground(Color.WHITE);
    csDetails.setBounds(150, 5, 300, 30);
    contentPanel.add(csDetails);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(30, 40, 530, 263);
    contentPanel.add(scrollPane);

    table = new JTable();
    table.setModel(new DefaultTableModel(new Object[][] {},
    new String[] { "ID", "Nom", "Numero", "Date Début", "Durée" }));
    scrollPane.setViewportView(table);
    controller.setTabel();

    JButton mainMenu = new JButton("Page Accueil");
    mainMenu.setBounds(223, 315, 117, 25);
    contentPanel.add(mainMenu);
/*
    JLabel background = new JLabel("");
    background.setIcon(new ImageIcon("all.jpg"));
    background.setBounds(0, 0, 605, 354);
    contentPanel.add(background);
*/
    mainMenu.addActionListener(controller);
  }

  public void setTable() {
    table.setModel(new DefaultTableModel(new Object[][] {},
        new String[] { "ID", "Nom", "Numero", "Date Début", "Durée" }));
  }

  public JTable getTable() {
    return table;
  }

}
