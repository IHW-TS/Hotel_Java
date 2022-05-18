package MVC.vue;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminPage extends JFrame implements ActionListener {

	private JLabel lab = new JLabel("Vous êtes dans l'interface Admin");

	private JPanel mainPanel = new JPanel();
	private JButton CheckChambre = new JButton("Chambre");
	private JButton CheckReserv = new JButton("Reservation");
	private JButton ModifyClient = new JButton("Clients");

	private JButton btnLogout = new JButton("Logout");

	public AdminPage() {
		setSize(810, 600);
		setLocationRelativeTo(null);
		setTitle("Page d'accueil Admin");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createGUI();
		setMyFont();


	}

	public void setMyFont() {
		Font myFont = new Font("monospaced", Font.CENTER_BASELINE, 15);

		ModifyClient.setFont(myFont);
		ModifyClient.setForeground(Color.black);
		ModifyClient.setBackground(Color.white);
		CheckChambre.setFont(myFont);
		CheckChambre.setForeground(Color.black);
		CheckChambre.setBackground(Color.white);
		CheckReserv.setFont(myFont);
		CheckReserv.setForeground(Color.black);
		CheckReserv.setBackground(Color.white);
		btnLogout.setFont(myFont);
		btnLogout.setForeground(Color.black);
		btnLogout.setBackground(Color.red);
	}

	public void createGUI() {

		mainPanel.setLayout(null);

		mainPanel.add(CheckChambre);
		mainPanel.add(CheckReserv);
		mainPanel.add(ModifyClient);
		mainPanel.add(btnLogout);

		CheckChambre.setBounds(270, 140, 250, 50);
		CheckReserv.setBounds(270, 220, 250, 50);
		ModifyClient.setBounds(270, 300, 250, 50);
		btnLogout.setBounds(270, 380, 250, 50);

		CheckChambre.addActionListener(this);
		CheckReserv.addActionListener(this);
		ModifyClient.addActionListener(this);
		btnLogout.addActionListener(this);

		add(mainPanel);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ModifyClient) {
			AdminClient view=new AdminClient();
            view.setVisible(true);	
			dispose();

		} else if (e.getSource() == CheckReserv) {
			new AdminRes();
			dispose();

		} else if (e.getSource() == CheckChambre) {
			AdminChambre view=new AdminChambre();
            view.setVisible(true);
			dispose();

		} else if (e.getSource() == btnLogout) {
			JOptionPane.showMessageDialog(AdminPage.this,
					"J'espère que vous avez passer un bon moment sur notre application",
					"Logging Out",
					JOptionPane.PLAIN_MESSAGE);
			dispose();
		}
	}

}
