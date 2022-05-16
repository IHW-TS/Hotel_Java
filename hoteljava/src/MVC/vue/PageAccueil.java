package MVC.vue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageAccueil extends JFrame implements ActionListener {

	public JPanel mainPanel = new JPanel();
	// Creation des boutons 
	public JButton client = new JButton("CLIENT");
	public JButton admin = new JButton("ADMIN");
	
	Container con = getContentPane();
	
	public PageAccueil(){
			
		setTitle("Hotel Reservation Système"); //titre 
		setSize(810,600); //taille de la fenêtre
		setLocationRelativeTo(null); //Appartion au centre
		setVisible(true); //rendue visible 
		setResizable(false); //Verrouille la taille de la fenêtre
		setDefaultCloseOperation(EXIT_ON_CLOSE); //fermeture immediat sans que l'app continue de s'executer en arriere plan 
		setButton();

		setBackground();
	}
	public void setButton(){
			
			Font a = new Font("Monospaced" , Font.CENTER_BASELINE , 35); //Tout les polices sont à la meme position 
			//partie client 
			mainPanel.add(client); //couleur du client est white/black
			client.setForeground(Color.white);
			client.setBackground(Color.black);
			client.setToolTipText("Click ici, si tu es un Client !"); // text qui apparaît en @hover ( on passe la souris dessus) 
			//partie admin 
			mainPanel.add(admin); //coleur du client est black/white
			admin.setForeground(Color.black);
			admin.setBackground(Color.white);
			admin.setToolTipText("Click ici, si tu es un Admin !"); // texte qui apparait en @hover
			
			client.setFont(a); //prends le reglage en a
			admin.setFont(a); 
			
            client.addActionListener(this); //fonction du boutton staff
			admin.addActionListener(this); //fonction du boutton admin
		}
	
// définir l'arrière-plan dans l'image d'importation de la page d'accueil à partir du fichier de répertoire

public void setBackground(){
			
			JLabel background = new JLabel(new ImageIcon("image/logo.gif")); //Import l'image à partir d'un repertoire 
			con.add(background); //Arriere plan dans un containeur 
			background.setLayout(new FlowLayout());
			background.add(mainPanel);
			validate();
		}

	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == client){
			try {
				new LoginClient();
			}
			catch (Exception e1) {
				
				e1.printStackTrace(); // outil utilisé pour gérer les exceptions (utile dans notre cas) mais aussi les erreurs

                // l'intégralité de la trace de la pile est imprimée avec les numéros de ligne et les noms de clase pour identifier l'emplacement exact de l'exception
			}
		}
		if(e.getSource() == admin){
			try {
				new LoginAdmin();
			}
			catch (Exception e1) {
					
				e1.printStackTrace();
			}
		}
	}
}