package MVC.vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import MVC.controller.AdminReservController;
import MVC.model.Reservation;

public class AdminRes extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Restaurant Reservation System");
    
    JButton registerbutton = new JButton("New User");
    JButton backbutton = new JButton("Back");
    private JPanel contentPanel;
    private Font mainLabel;
    private AdminReservController controller;
    private JTable table;
    private static Scanner z;

    public AdminRes() {

    mainLabel = new Font("Arial", Font.BOLD, 34);
    controller = new AdminReservController(this);
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
    registerbutton.setBounds(100, 420, 300, 30);
    registerbutton.setFocusable(false);
    registerbutton.addActionListener(this);

    backbutton.setBounds(10, 10, 70, 30);
    backbutton.setFocusable(false);
    backbutton.addActionListener(this);

    frame.add(registerbutton);
    frame.add(backbutton);
  }

  public void setTable() {
    table.setModel(new DefaultTableModel(new Object[][] {},
        new String[] { "ID", "Nom", "Numero", "Date Début", "Durée" }));
  }

  public JTable getTable() {
    return table;
  }
      
       

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == registerbutton) {

              // supprimer page

            }
            else if(e.getSource() == backbutton){

                AdminPage welcomePage = new AdminPage();
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "ERREUR");
        }
    }
    public static String[][] ReservationTable(){

        ArrayList<String> booking = new ArrayList<String>();
        String[] split;

        try {
            z = new Scanner(new File("Reserv.txt"));
            while (z.hasNext()) {

                String details = z.nextLine();
                booking.add(details);
            }
            String[][] booking3 = new String[booking.size()][6];
            for (int i = 0; i < booking.size(); i++) {
                String booking1 = booking.get(i);
                split = booking1.split(",");
                for (int j = 0; j < 6; j++) {
                    booking3[i][j] = split[j];
                }
            }
            return booking3;

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERREUR");
        }
        return null;
    }


    }

