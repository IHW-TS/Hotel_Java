/*package MVC.vue.V1;

import java.awt.*;
import java.util.*;
import javax.swing.*;

import MVC.controller.V1.Caccueil;

import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Accueil extends JFrame implements ActionListener {
		JButton b1=new JButton("Gestion des chambres");
		JButton b2=new JButton("Gestion des clients");
		JButton b3=new JButton("Gestion des réservations");
		JButton b4=new JButton("Gestion des séjours");
		JLabel text = new JLabel("Page principale pour gérer l'hotel", SwingConstants.CENTER);

		
	public Accueil() {

		
    this.setTitle("Bienvenue sur le site de gestion de l'hotel");
    JPanel fenetreA = new JPanel();
    this.getContentPane().add(fenetreA);
    fenetreA.setLayout(new BorderLayout());
    fenetreA.add(BorderLayout.NORTH, text);

    //Faire les boutons
	JPanel panneauB = new JPanel();
	GridLayout position = new GridLayout(1,4);

	panneauB.add(b1); 
	panneauB.add(b2);
	panneauB.add(b3);
	panneauB.add(b4);

	Caccueil c = new Caccueil();
	b1.addActionListener(c); 
	b2.addActionListener(c);
	fenetreA.add(BorderLayout.CENTER, panneauB);
	
    this.setVisible(true);
    this.pack();
    }
	public static void main(String[] args) {
		new Accueil();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
*/