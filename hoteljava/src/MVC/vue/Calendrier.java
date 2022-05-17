package MVC.vue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calendrier {

    int mois = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
    int année = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

    JLabel l = new JLabel("", JLabel.CENTER);

    String j = "";

    JDialog d;

    JButton[] bt = new JButton[49];

    public Calendrier(JFrame parent) {

        d = new JDialog();

        d.setModal(true);

        String[] header = { "Lun", "Mar", "Mer", "Jeu", "Ven", "Sam", "Dim" };

        JPanel p1 = new JPanel(new GridLayout(7, 7));

        p1.setPreferredSize(new Dimension(430, 120));

        for (int x = 0; x < bt.length; x++) {

            final int selection = x;

            bt[x] = new JButton();

            bt[x].setFocusPainted(false);

            bt[x].setBackground(Color.white); 

            if (x > 6)

            bt[x].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        j = bt[selection].getActionCommand();

                        d.dispose();
                    }
                });
            if (x < 7) {
                bt[x].setText(header[x]);
                bt[x].setForeground(Color.red);
            }
            p1.add(bt[x]);
        }

        JPanel p2 = new JPanel(new GridLayout(1, 3));

        JButton prec = new JButton("<< Précedent");

        prec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                mois--;

                AfficheCalendrier();

            }
        });
        p2.add(prec);
        p2.add(l);

        JButton next = new JButton("Suivant >>");

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                mois++;

                AfficheCalendrier();
            
            }
        });
        p2.add(next);

        d.add(p1, BorderLayout.CENTER);
        d.add(p2, BorderLayout.SOUTH);
        d.pack();

        d.setLocationRelativeTo(parent);

        AfficheCalendrier();

        d.setVisible(true);
    }

    public void AfficheCalendrier() {
        for (int x = 7; x < bt.length; x++)
        bt[x].setText("");
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");

        java.util.Calendar cal = java.util.Calendar.getInstance();

        cal.set(année, mois, 1);

        int JourW = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int JourM = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

        for (int x = 6 + JourW, j = 1; j <= JourM; x++, j++)

        bt[x].setText("" + j);
        l.setText(sdf.format(cal.getTime()));

        d.setTitle("Calendrier");
    }

    public String DateChoisit() {

        if (j.equals(""))
            return j;
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(année, mois, Integer.parseInt(j));
        return sdf.format(cal.getTime());
    }
}

class Picker {
    public static void main(String[] args) {// main method

        JLabel label = new JLabel("Selectionner une date :");

        final JTextField text = new JTextField(20);

        JButton b = new JButton("...");

        JPanel p = new JPanel();
        p.add(label);
        p.add(text);
        p.add(b);

        final JFrame f = new JFrame();
        f.getContentPane().add(p);
        f.pack();
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                text.setText(new Calendrier(f).DateChoisit());
            }
        });
    }
}
