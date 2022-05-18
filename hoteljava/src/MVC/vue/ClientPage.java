package MVC.vue;

import java.awt.Color;
import java.awt.Container;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClientPage extends JFrame implements ActionListener {
	//menu client pour choisir de réserver ou se déconnecter

	JLabel lab = new JLabel("Vous êtes enregistré en temps que client");
	JPanel mainPanel = new JPanel();
	JButton btnReserv = new JButton("Reserver");
	JButton btnLogout = new JButton("Déconnecter");
	Container contt;

	public ClientPage() {
		setSize(810, 600);
		setLocationRelativeTo(null);
		setTitle("Page d'acceuil Client");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addClientAdmin();
		Fontperso();
	}

	public void Fontperso() {
		Font myFont = new Font("monospaced", Font.PLAIN, 15);

		btnReserv.setFont(myFont);
		btnReserv.setToolTipText("Plannifier votre Séjour !");

		btnLogout.setFont(myFont);

	}

	public void addClientAdmin() {
		mainPanel.setLayout(null);

		mainPanel.add(btnReserv);

		mainPanel.add(btnLogout);

		btnReserv.setBounds(300, 140, 250, 50);
		btnReserv.setForeground(Color.white);
		btnReserv.setBackground(Color.black);

		btnLogout.setBounds(300, 300, 250, 50);
		btnLogout.setForeground(Color.white);
		btnLogout.setBackground(Color.red);

		btnLogout.addActionListener(this);
		btnReserv.addActionListener(this);

		add(mainPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnReserv) {
			new HotelRes(); // changer en Hotel Res
			dispose();
		} else if (e.getSource() == btnLogout) {
			JOptionPane.showMessageDialog(ClientPage.this,
					"J'espère que vous avez passer un bon moment sur notre application",
					"Logging Out",
					JOptionPane.PLAIN_MESSAGE);
			dispose();
		}
	}
}
