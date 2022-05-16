/*package MVC.vue.V1;

import javax.swing.JFrame;

import MVC.model.Reservation;
import MVC.vue.V1.GchambreStatique;


import MVC.vue.V1.GchambreStatique;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

//import GchambreStatique.java;

public class GchambreTable extends JFrame {  
	
	  private GchambreStatique modele = new GchambreStatique();
	    private JTable tableau;
	JPanel boutons = new JPanel();
	public GchambreTable(){
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
		new GchambreTable().setVisible(true);
	}
	 private class AddAction extends AbstractAction {
	        private AddAction() {
	            super("Ajouter");
	        }
	 
	        public void actionPerformed(ActionEvent e) {
//	            modele.addReservation(new Reservation("Megan", "Sami", "chambre double","23/10/22"));
	        }
	    }
	 
	    private class RemoveAction extends AbstractAction {
	        private RemoveAction() {
	            super("Supprimer");
	        }
	 
	        public void actionPerformed(ActionEvent e) {
	            int[] selection = tableau.getSelectedRows();
	 
	            for(int i = selection.length - 1; i >= 0; i--){
//	                modele.removeReservation(selection[i]);
	            }
	        }
	    }

}
*/