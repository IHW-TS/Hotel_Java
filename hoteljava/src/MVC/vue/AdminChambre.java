package MVC.vue;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;


public class AdminChambre {
    
    private GchambreStatique modele = new GchambreStatique();
    private JTable tableau;
    JPanel boutons = new JPanel();

    public AdminChambre() {
        this.setTitle("Réservation de la chambre");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tableau = new JTable(modele);
        this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

        boutons.add(new JButton(new AddAction()));
        boutons.add(new JButton(new RemoveAction()));

        this.getContentPane().add(boutons, BorderLayout.SOUTH);

        this.pack();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new AdminRes().setVisible(true);
    }

    private class AddAction extends AbstractAction {
        private AddAction() {
            super("Ajouter");
        }

        public void actionPerformed(ActionEvent e) {
            modele.addReserv(new Reservation("", "", "",""));
        }
    }

    private class RemoveAction extends AbstractAction {
        private RemoveAction() {
            super("Supprimer");
        }

        public void actionPerformed(ActionEvent e) {
            int[] selection = tableau.getSelectedRows();

            for (int i = selection.length - 1; i >= 0; i--) {
                modele.removeReserv(selection[i]);
            }
        }
    }
}
