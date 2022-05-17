package MVC.vue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JTextField;

import MVC.model.Plus.ClientUser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class LoginClient extends JFrame implements ActionListener {

	private JLabel lblusername = new JLabel("Username");
	private JLabel lblpassword = new JLabel("Password ");
	private JLabel Msg = new JLabel("Veuillez vous connecter (Client)");

	private JTextField usernameInput = new JTextField(13);
	private JPasswordField passwordInput = new JPasswordField(13);

	private JButton BtnLog = new JButton("Connection");
	private JButton BtnAnnuler = new JButton("Annuler");

	private JPanel mainPanel = new JPanel();
	private JPanel instructionPanel = new JPanel();

	public LoginClient() throws Exception {

		setTitle("Client Connecter");
		setSize(260, 160);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createGUI();
	}

	public void createGUI() {

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
		BtnLog.setToolTipText("Assurez-vous que votre nom d'utilisateur et votre mot de passe sont corrects");
		BtnAnnuler.addActionListener(this);
		add(mainPanel);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == BtnLog) {
			try {

				ClientUser cClient = new ClientUser();

				String username = usernameInput.getText();

				String password = new String(passwordInput.getPassword());

				FileReader fileReader = new FileReader("ListClient.txt");

				BufferedReader bufferedReader = new BufferedReader(fileReader);

				cClient.setStaffKeyInUsername(username);
				cClient.setStaffKeyInPassword(password);
				cClient.LoginEvent();
				dispose();

				bufferedReader.close();

			} catch (Exception E) {
				JOptionPane.showMessageDialog(null, "Vous avez entré les mauvaises données", "Erreur",
						JOptionPane.ERROR_MESSAGE);
				usernameInput.setText("");
				passwordInput.setText("");
			}
		} else if (e.getSource() == BtnAnnuler) {
			dispose();
		}
	}
}
