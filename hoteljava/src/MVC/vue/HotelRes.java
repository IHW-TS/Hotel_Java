package MVC.vue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HotelRes {

    public HotelRes() {
        // Création des conteneurs

        JButton btnDeco = new JButton("Déconnecter"); // creation bouton deco 

        JFrame BlockReserv = new JFrame("Hotel");// creation de la fenêtre
        BlockReserv.setSize(400, 400); // Dimension de la fenêtre

        JLabel homeTitleText = new JLabel("Bienvenue !");
        homeTitleText.setBounds(150, 10, 100, 50);
        BlockReserv.add(homeTitleText);

        JLabel findHotelsLabel = new JLabel("Trouver vos hôtels favoris à proximité :");
        findHotelsLabel.setBounds(80, 30, 400, 50);
        BlockReserv.add(findHotelsLabel);

        /*
         * 
         * On pourra faire plusieurs Hotel pour l'instant on va rester avec un seul
         * 
         */

        // Création d'une barre de menu pour le profil utilisateur, avec un menu "Déconnexion"
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Interface Client");
        menuBar.add(menu); // ajouter de l'indication interface client dans le %enu en haut 
        BlockReserv.setJMenuBar(menuBar); //block du MenuBar
        menuBar.setBackground(new java.awt.Color(30, 80, 250)); // choix couleur en rgb 
        menu.setForeground(Color.white); // couleur du texte
        
        // Hotel 1 Panel
        JPanel PanelHotel = new JPanel();
        PanelHotel.setBounds(40, 80, 300, 100);
        PanelHotel.setBackground(Color.white);
        PanelHotel.setLayout(null);
        BlockReserv.add(PanelHotel);

        JLabel NomHotel = new JLabel("Hotel Evry");
        NomHotel.setBounds(10, 0, 350, 50);
        PanelHotel.add(NomHotel);

        JLabel NbEtageHotel = new JLabel("Etage : 2");
        NbEtageHotel.setBounds(10, 20, 100, 50);
        PanelHotel.add(NbEtageHotel);

        JLabel PrecisionPrixHotel = new JLabel("Prix : ");
        PrecisionPrixHotel.setBounds(10, 40, 250, 50);
        PanelHotel.add(PrecisionPrixHotel);

        JLabel PrixHotel = new JLabel("500");
        PrixHotel.setBounds(45, 40, 250, 50);
        PanelHotel.add(PrixHotel);

        JButton btnHotel = new JButton("Ajouter");
        btnHotel.setBounds(190, 60, 80, 20);
        PanelHotel.add(btnHotel);
        btnHotel.setBackground(new java.awt.Color(30, 80, 188));
        btnHotel.setForeground(Color.white);

        // Action de redirection sur ClientPage2
        btnHotel.addActionListener((ActionEvent e) -> {
            // Appel du cadre des détails de la réservation et transmission du nom et du
            // prix de l'hôtel au cadre des détails de la réservation
            new ClientRes(NomHotel.getText(), PrixHotel.getText());
            // Fermeture du cadre de réservation
            BlockReserv.setVisible(false);
        });

        // bouton Deconnection 
        BlockReserv.add(btnDeco);
		
		btnDeco.setBounds(125,250,150,40);  
		btnDeco.setForeground(Color.white); 
		btnDeco.setBackground(Color.darkGray); 
        // boite dialogue 
        btnDeco.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(BlockReserv,
                    "Vous vous êtes deconnecter! \nVeuillez vous enregistrer pour continuer !");
            // Appel de l'instance CleintPage si l'utilisateur se déconnecte
            new ClientPage();
            // Fermeture du cadre de réservation
            BlockReserv.setVisible(false);
        });


        // Paramétrage des options du cadre de réservation
        BlockReserv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BlockReserv.setLayout(null);
        BlockReserv.setVisible(true);
        BlockReserv.setLocationRelativeTo(null);
    }
}
