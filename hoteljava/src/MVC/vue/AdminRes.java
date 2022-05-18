package MVC.vue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MVC.model.Reservation;

public class AdminRes implements ActionListener {

    String[] header = { "ID", "Prenom", "Nom", "Numero", "Date", "TempsSej" };
    JFrame frame = new JFrame("Hotel Reservation Systeme");
    JLabel descriptions = new JLabel("Reservation details: ");
    JButton registerbutton = new JButton("Nouveau Client");
    JButton backbutton = new JButton("Retour");
    static JTable reservations = new JTable();
    private JTable table;

    private static Scanner z;

    public AdminRes() {

        descriptions.setBounds(165, 10, 300, 30);
        descriptions.setFont(new Font(null, Font.ITALIC, 20));

        registerbutton.setBounds(100, 420, 300, 30);
        registerbutton.setFocusable(false);
        registerbutton.addActionListener(this);

        backbutton.setBounds(10, 10, 70, 30);
        backbutton.setFocusable(false);
        backbutton.addActionListener(this);

        reservations = new JTable(ReservationTable(), header);
        reservations.setBounds(30, 50, 450, 350);

        frame.add(registerbutton);
        frame.add(descriptions);
        frame.add(reservations);
        frame.add(backbutton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 520);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void setTable() {
        table.setModel(new DefaultTableModel(new Object[][] {},
                new String[] { "ID", "Prenom", "Nom", "Numero", "Date", "TempsSej" }));
    }

    public JTable getTable() {
        return table;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == registerbutton) {

                // supprimer page

            } else if (e.getSource() == backbutton) {

                AdminPage welcomePage = new AdminPage();
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "ERREUR");
        }
    }

    public static String[][] ReservationTable() {

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

    public void dispose() {
    }

}
