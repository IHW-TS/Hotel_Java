package MVC.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import MVC.model.Reservation;

public class AdminRes implements ActionListener {

    String[] header = {"Prenom","Nom","Numero", "Date","TempsSej","Autre"};
    JFrame frame = new JFrame("Hotel Reservation Systeme");
    JLabel descriptions = new JLabel("Reservation details: ");
    JButton registerbutton = new JButton("Nouveau Client");
    JButton backbutton = new JButton("Retour");
    static JTable reservations = new JTable();
    private static Scanner z;

    public AdminRes() {
   
//    JScrollPane reservations2 = new JScrollPane(reservations);

        descriptions.setBounds(165,10,300,30);
        descriptions.setFont(new Font(null,Font.ITALIC,20));

        registerbutton.setBounds(100, 420, 300, 30);
        registerbutton.setFocusable(false);
        registerbutton.addActionListener(this);

        backbutton.setBounds(10, 10, 70, 30);
        backbutton.setFocusable(false);
        backbutton.addActionListener(this);

        reservations = new JTable(ReservationTable(),header);
        reservations.setBounds(30,50,450,350);

        frame.add(registerbutton);
        frame.add(descriptions);
        frame.add(reservations);
        frame.add(backbutton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520,520);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == registerbutton) {

              // supprimer page

            }
            else if(e.getSource() == backbutton){

                AdminPage acc = new AdminPage();
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "ERREUR");
        }
    }
    public static String[][] ReservationTable(){

        ArrayList<String> reservation = new ArrayList<String>();
        String[] split;

        try {
            z = new Scanner(new File("Reserv.txt"));
            while (z.hasNext()) {

                String details = z.nextLine();
                reservation.add(details);
            }
            String[][] reservation2 = new String[reservation.size()][6];
            for (int i = 0; i < reservation.size(); i++) {
                String reservation1 = reservation.get(i);
                split = reservation1.split(",");
                for (int j = 0; j < 6; j++) {
                    reservation2[i][j] = split[j];
                }
            }
            return reservation2;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERREUR");
        }
        return null;
    }
//    public static void main(String[] args) {
//        AdminPage adminPage = new AdminPage();
//    }

    }

