package MVC.vue.V1;


import java.awt.*;
import javax.swing.*;



public class Gsejour2 extends JFrame {

	public Gsejour2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel principal = new JPanel();
		JButton ajouterF = new JButton();
		
		principal.setLayout(new BorderLayout());
		this.getContentPane().add(principal, BorderLayout.CENTER);
	
		principal.add(ajouterF, BorderLayout.SOUTH );
		
		this.pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gsejour2();
	}

}
