package MVC.vue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JTextField;

import MVC.model.Plus.AdminUser;
import MVC.model.Plus.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class LoginAdmin extends JFrame implements ActionListener {
	// création des différents boutons et espaces pour rentrer les informations
	// demandées
	//création des différents boutons et espaces pour rentrer les informations demandées
	private JLabel lblusername = new JLabel("Username");
	private JLabel lblpassword = new JLabel("Password");
	private JLabel Msg = new JLabel("Veuillez vous connecter (Admin)");

	private JTextField usernameInput = new JTextField(13);
	private JPasswordField passwordInput = new JPasswordField(13); // JPasswordField n'affiche pas les caractères saisis
																	// par l'utilisateur ex: *******

	private JButton BtnAnnuler = new JButton("Annuler");
	private JButton BtnLog = new JButton("Connexion");

	private JPanel mainPanel = new JPanel();
	private JPanel instructionPanel = new JPanel();


	public LoginAdmin() throws Exception{
		
		setTitle("Admin Connexion");
		setSize(260, 160);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ClientLog();
	}

	public void ClientLog() {

		//Valider la connexion du clien
		mainPanel.setLayout(new FlowLayout());
		instructionPanel.setLayout(new FlowLayout());

		instructionPanel.add(Msg);

		mainPanel.add(instructionPanel);
		mainPanel.add(lblusername);
		mainPanel.add(usernameInput);
		mainPanel.add(lblpassword);
		mainPanel.add(passwordInput);
		mainPanel.add(BtnLog);
		mainPanel.add(BtnAnnuler);

		BtnLog.addActionListener(this);
		BtnAnnuler.addActionListener(this);
		add(mainPanel);
	}

	public void actionPerformed(ActionEvent e) {
		User myUser = new User();

		if (e.getSource() == BtnLog) {
			try {
				AdminUser myAdmin = new AdminUser();

				String username = usernameInput.getText();
				myUser.setUsername(username);
				String password = new String(passwordInput.getPassword());
				myUser.setPassword(password);

				FileReader fileReader = new FileReader("Admin.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				while ((bufferedReader.readLine()) != null) {
					if (myUser.getUsername().equals(myAdmin.getAdminName())
							&& myUser.getPassword().equals(myAdmin.getAdminPassword())) {
						dispose();
						JOptionPane.showMessageDialog(LoginAdmin.this,
								"Vous avez reussit à vous enregistrer en temps qu'Admin.",
								"L'enregistrement est validé'",
								JOptionPane.PLAIN_MESSAGE);
						dispose();
						new AdminPage();
					} else {
						JOptionPane.showMessageDialog(LoginAdmin.this,
								"Identifiant invalide",
								"L'enregistrement a échoué",
								JOptionPane.ERROR_MESSAGE);
						usernameInput.setText("");
						passwordInput.setText("");
					}
				}
				bufferedReader.close();

			}catch(Exception E){
				JOptionPane.showMessageDialog(null, "Vous n'avez pas entré les bonnes données", "Erreur",JOptionPane.ERROR_MESSAGE);	
			}
		} else if (e.getSource() == BtnAnnuler) {
			dispose();
		}
	}
}
