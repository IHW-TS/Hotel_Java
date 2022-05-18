package MVC.vue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*

if (a.getSource()==bGoDate){
	final JFrame f = new JFrame();
	depdate.setText(new DatePicker(f).setPickedDate());
} 
if (a.getSource()==bturnDate){
	final JFrame f = new JFrame();
	retdate.setText(new DatePicker(f).setPickedDate());

*/
public class ClientRes extends JFrame {

	public ClientRes(String ReservNom, String ReservPrix) {

		// Création du cadre des détails de la réservation
		JFrame Details = new JFrame("Systeme de reservation (Hotel) | " + ReservNom);
		Details.setSize(600, 400);

		// Message d'information en haut à gauche
		JLabel Titre = new JLabel("Vous etes actuellement entrain de reserver !");
		Titre.setBounds(20, 0, 400, 50);
		Details.add(Titre);

		// creation du bouton de retour
		JButton backbtn = new JButton("Back");
		backbtn.setBounds(400, 10, 100, 30);
		Details.add(backbtn);
		backbtn.setBackground(Color.white);
		backbtn.setForeground(new java.awt.Color(30, 80, 188));

		backbtn.addActionListener((ActionEvent e) -> {
			new HotelRes();
			Details.setVisible(false);
		});

		JPanel p1 = new JPanel();
		p1.setLayout(null);

		JPanel p2 = new JPanel();
		p2.setLayout(null);

		JPanel p3 = new JPanel();
		p3.setLayout(null);

		// Création d'un tabbedpane avec les panels "Chamrbe", "Client", "Recapitulatif
		// Commande
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(10, 60, 560, 290);
		tp.add("Chambre", p1);
		tp.add("Client", p2);
		tp.add("Recapitulatif Commande", p3);
		Details.add(tp);

		tp.setEnabledAt(0, false);
		tp.setEnabledAt(1, false);
		tp.setEnabledAt(2, false);

		// Details Chambre (panel 1)
		JLabel lChambre = new JLabel("Entrer le Type de Chambre :");
		lChambre.setBounds(10, 10, 250, 30);
		p1.add(lChambre);

		// Creation d'un menu deroulant pour choisir les types de chambre




		JComboBox t1 = new JComboBox();
		t1.addItem("1");
		t1.addItem("2");
		t1.addItem("3");
		t1.addItem("4");
		t1.setSelectedItem(1);
		t1.setBounds(220, 10, 120, 30);
		p1.add(t1);

		JLabel nbpersonnes = new JLabel("Entrer le nombre de Personne:");
		nbpersonnes.setBounds(10, 60, 250, 30);
		p1.add(nbpersonnes);

		// Creation d'un menu deroulant pour choisir le nombre de personne
		JComboBox t2 = new JComboBox();
		t2.addItem("1");
		t2.addItem("2");
		t2.addItem("3");
		t2.addItem("4 ou +");
		t2.setSelectedItem(1);
		t2.setBounds(300, 60, 120, 30);
		p1.add(t2);
	//création d'un bouton pour afficher un calendrier
		JLabel Ljours = new JLabel("Entrer La duree du Sejour :");
        Ljours.setBounds(10, 110, 250, 30);
        p1.add(Ljours);

        JButton prevBtn10 = new JButton("Selectionner date depart");
        prevBtn10.setBounds(200, 110, 180, 30);
        p1.add(prevBtn10);
        prevBtn10.addActionListener((ActionEvent e) -> {
            // Appel de la fonction picker dans calendrier
            final JFrame cal = new JFrame();
            prevBtn10.setText(new Calendrier(cal).DateChoisit());
        
        });
	//création d'un menu déroulant pour choisir la durée du sejour
		JComboBox t3 = new JComboBox();
		t3.addItem("1");
		t3.addItem("2");
		t3.addItem("3");
		t3.addItem("4");
		t3.setSelectedItem(1);
		t3.setBounds(220, 110, 120, 30);
		p1.add(t3);
	//Création de la partie consommation avec le choix des produits
		JLabel sConsommation = new JLabel("Consommation :");
		sConsommation.setBounds(10, 140, 250, 40);
		p1.add(sConsommation);

		JCheckBox sSandwich = new JCheckBox("Sandwich");
		sSandwich.setBounds(10, 170, 200, 20);
		p1.add(sSandwich);

		JCheckBox sCoca = new JCheckBox("Coca");
		sCoca.setBounds(10, 190, 200, 20);
		p1.add(sCoca);

		JCheckBox sEau = new JCheckBox("Eau");
		sEau.setBounds(10, 210, 200, 20);
		p1.add(sEau);

		JCheckBox sChips = new JCheckBox("Chips");
		sChips.setBounds(10, 230, 200, 20);
		p1.add(sChips);
	//création du bouton pour passer à la page suivante
		JButton nextBtn1 = new JButton("Next");
		nextBtn1.setBounds(430, 220, 100, 30);
		p1.add(nextBtn1);
		nextBtn1.setBackground(new java.awt.Color(30, 80, 188));
		nextBtn1.setForeground(Color.white);

		// Client panel 2
		//création des différentes informations à donner et des espaces pour les rentrer
		JLabel firstNameLabel = new JLabel("Prenom:");
		firstNameLabel.setBounds(10, 10, 250, 30);
		p2.add(firstNameLabel);

		JTextField firstNameField = new JTextField();
		firstNameField.setBounds(110, 10, 150, 30);
		p2.add(firstNameField);

		JLabel lastNameLabel = new JLabel("Nom :");
		lastNameLabel.setBounds(280, 10, 250, 30);
		p2.add(lastNameLabel);

		JTextField lastNameField = new JTextField();
		lastNameField.setBounds(380, 10, 150, 30);
		p2.add(lastNameField);

		JLabel numLabel = new JLabel("Numero :");
		numLabel.setBounds(10, 45, 250, 30);
		p2.add(numLabel);

		JTextField numField = new JTextField();
		numField.setBounds(110, 45, 150, 30);
		p2.add(numField);

		JLabel ageLabel = new JLabel("Age:");
		ageLabel.setBounds(280, 45, 250, 30);
		p2.add(ageLabel);

		JTextField ageField = new JTextField();
		ageField.setBounds(380, 45, 150, 30);
		p2.add(ageField);

		JLabel addressLabel = new JLabel("Adresse:");
		addressLabel.setBounds(10, 80, 250, 30);
		p2.add(addressLabel);
		JTextArea addressTexteChamps = new JTextArea();

		// partie Adresse + option pour scroller
		addressTexteChamps.setLineWrap(true);
		addressTexteChamps.setWrapStyleWord(true);
		JScrollPane scrollTexteChamps = new JScrollPane(addressTexteChamps);
		scrollTexteChamps.setBounds(110, 80, 150, 65);
		scrollTexteChamps.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		p2.add(scrollTexteChamps);

		JLabel GenderLabel = new JLabel("Genre :");
		GenderLabel.setBounds(10, 150, 250, 30);
		p2.add(GenderLabel);

		// Creation d'un choix de bouton pour le genre
		
		JComboBox Genre = new JComboBox();
		Genre.addItem("Homme");
		Genre.addItem("Femme");
		Genre.addItem("Autre");
		Genre.setSelectedItem(1);
		Genre.setBounds(110, 150, 120, 30);
				p2.add(Genre);
		
		/*JRadioButton genre1 = new JRadioButton("Homme");
		JRadioButton genre2 = new JRadioButton("Femme");
		JRadioButton genre3 = new JRadioButton("Autre");
		genre1.setBounds(60, 150, 250, 30);
		genre2.setBounds(60, 180, 250, 30);
		genre3.setBounds(60, 210, 250, 30);
		ButtonGroup genderbg = new ButtonGroup();
		genderbg.add(genre1);
		genderbg.add(genre2);
		genderbg.add(genre3);
		p2.add(genre1);
		p2.add(genre2);
		p2.add(genre3);
*/
		JButton prevBtn2 = new JButton("Back");
		prevBtn2.setBounds(320, 220, 100, 30);
		p2.add(prevBtn2);
		prevBtn2.setBackground(Color.white);
		prevBtn2.setForeground(new java.awt.Color(30, 80, 188));

		prevBtn2.addActionListener((ActionEvent e) -> {
			tp.setSelectedIndex(0);
		});

		JButton nextBtn2 = new JButton("Next");
		nextBtn2.setBounds(430, 220, 100, 30);
		p2.add(nextBtn2);
		nextBtn2.setBackground(new java.awt.Color(30, 80, 188));
		nextBtn2.setForeground(Color.white);

		// Panel 3 affichage partie gauche
		//affichage des informations rentrées et du prix 
		JLabel itemLabel = new JLabel("Les Items");
		itemLabel.setBounds(40, 10, 250, 30);
		p3.add(itemLabel);

		JLabel totalLabelChambre = new JLabel("Total prix Chambre");
		totalLabelChambre.setBounds(10, 40, 250, 30);
		p3.add(totalLabelChambre);

		JLabel totalLabelSej = new JLabel("Total prix Sejour"); // Crée un pop up pour pour le sejour
		totalLabelSej.setBounds(10, 60, 250, 30);
		p3.add(totalLabelSej);

		JLabel totalLabelService = new JLabel("Total Prix Servive");
		totalLabelService.setBounds(10, 80, 250, 30);
		p3.add(totalLabelService);

		JLabel taxLabel = new JLabel("Tax");
		taxLabel.setBounds(10, 100, 250, 30);
		p3.add(taxLabel);

		JLabel maintainenceLabel = new JLabel("Maintenance");
		maintainenceLabel.setBounds(10, 120, 250, 30);
		p3.add(maintainenceLabel);

		JLabel SejTotalLabel = new JLabel("Prix Sej");
		SejTotalLabel.setBounds(10, 160, 250, 30);
		p3.add(SejTotalLabel);

		// Partie Centre

		JLabel QtLabel = new JLabel("Quantité");
		QtLabel.setBounds(165, 10, 250, 30);
		p3.add(QtLabel);

		JLabel totalLabelChambreQuantite = new JLabel("1");
		totalLabelChambreQuantite.setBounds(180, 40, 250, 30);
		p3.add(totalLabelChambreQuantite);

		JLabel totalLabelJourQuantite = new JLabel("1");
		totalLabelJourQuantite.setBounds(180, 60, 250, 30);
		p3.add(totalLabelJourQuantite);

		JLabel totalLabelServiveQuantite = new JLabel("0");
		totalLabelServiveQuantite.setBounds(180, 80, 250, 30);
		p3.add(totalLabelServiveQuantite);

		JLabel taxLabelQuantite = new JLabel("|");
		taxLabelQuantite.setBounds(180, 100, 250, 30);
		p3.add(taxLabelQuantite);

		JLabel maintainenceLabelQuantite = new JLabel("|");
		maintainenceLabelQuantite.setBounds(180, 120, 250, 30);
		p3.add(maintainenceLabelQuantite);

		// partie droite

		JLabel itemPrixLabel = new JLabel("Prix Total");
		itemPrixLabel.setBounds(250, 10, 250, 30);
		p3.add(itemPrixLabel);

		JLabel rs1Label = new JLabel("€");
		rs1Label.setBounds(270, 40, 250, 30);
		p3.add(rs1Label);

		JLabel totalLabelChambrePrix = new JLabel("0");
		totalLabelChambrePrix.setBounds(260, 40, 250, 30);
		p3.add(totalLabelChambrePrix);

		JLabel rs2Label = new JLabel("€");
		rs2Label.setBounds(270, 60, 250, 30);
		p3.add(rs2Label);

		JLabel totalLabelJourPrix = new JLabel("0");
		totalLabelJourPrix.setBounds(260, 60, 250, 30);
		p3.add(totalLabelJourPrix);

		JLabel rs3Label = new JLabel("€");
		rs3Label.setBounds(270, 80, 250, 30);
		p3.add(rs3Label);

		JLabel totalLabelServivePrix = new JLabel("0");
		totalLabelServivePrix.setBounds(260, 80, 250, 30);
		p3.add(totalLabelServivePrix);

		JLabel rs4Label = new JLabel("€");
		rs4Label.setBounds(270, 100, 250, 30);
		p3.add(rs4Label);

		JLabel taxPrixLabel = new JLabel("400");
		taxPrixLabel.setBounds(260, 100, 250, 30);
		p3.add(taxPrixLabel);

		JLabel rs5Label = new JLabel("€");
		rs5Label.setBounds(270, 120, 250, 30);
		p3.add(rs5Label);

		JLabel maintainenceCostLabel = new JLabel("200");
		maintainenceCostLabel.setBounds(260, 120, 250, 30);
		p3.add(maintainenceCostLabel);

		JLabel rs6Label = new JLabel("€");
		rs6Label.setBounds(270, 160, 250, 30);
		p3.add(rs6Label);

		JLabel totalPrixLabel = new JLabel("0");
		totalPrixLabel.setBounds(260, 160, 250, 30);
		p3.add(totalPrixLabel);

		// Boutons
		JButton prevBtn3 = new JButton("Back");
		prevBtn3.setBounds(320, 220, 100, 30);
		p3.add(prevBtn3);

		prevBtn3.addActionListener((ActionEvent e) -> {
			// Change l'onglet
			tp.setSelectedIndex(1);
		});

		JButton BtnReserv = new JButton("Reserver");
		BtnReserv.setBounds(430, 220, 100, 30);
		p3.add(BtnReserv);
		BtnReserv.setBackground(new java.awt.Color(30, 80, 188));
		BtnReserv.setForeground(Color.white);

		// Panel bouton Next
		nextBtn1.addActionListener((ActionEvent e) -> {
			// Try le code ci-dessous pour tester les erreurs
			try {
				// Création de la variable entière tot pour obtenir le nombre total de tous
				// les installations cochées true dans la section des cases à cocher
				int tot = 0;
				// Si la case sandwich est cochée true, augmente le nombre d'item
				if (sSandwich.isSelected())
					tot += 1;
				// Si la case coca est cochée true, augmente le nombre d'item
				if (sCoca.isSelected())
					tot += 1;
				// Si la case eau est cochée true, augmente le nombre d'item
				if (sEau.isSelected())
					tot += 1;
				// Si la case chips est cochée true, augmente le nombre d'item
				if (sChips.isSelected())
					tot += 1;

				totalLabelServiveQuantite.setText(String.valueOf(tot));
				totalLabelChambreQuantite.setText(String.valueOf(t1.getSelectedItem()));
				totalLabelJourQuantite.setText(String.valueOf(t3.getSelectedItem()));

				// Mise à jour du coût total des chambres en fonction de la quantité de chambres
				// * le prix de la réservation
				int totChambre = Integer.parseInt(totalLabelChambreQuantite.getText())
						* Integer.parseInt(ReservPrix);
				totalLabelChambrePrix.setText(String.valueOf(totChambre));

				// Mise à jour du coût total des jours en fonction du nombre de jours * 150
				// (car 150 est le prix de la chambre)
				int totJour = Integer.parseInt(totalLabelJourQuantite.getText()) * 150;
				totalLabelJourPrix.setText(String.valueOf(totJour));

				// Mise à jour du coût total des installations en fonction de la quantité
				// d'installations * 50 (parce que 50 est le coût par installation)
				int totInstal = Integer.parseInt(totalLabelServiveQuantite.getText()) * 50;
				totalLabelServivePrix.setText(String.valueOf(totInstal));

				// Enfin, mise à jour du coût de réservation final à la somme de tous les autres
				// coûts
				int totFinal = totChambre + totJour + totInstal
						+ Integer.parseInt(taxPrixLabel.getText()) + Integer.parseInt(maintainenceCostLabel.getText());
				;
				totalPrixLabel.setText(String.valueOf(totFinal));

				// Changer le panneau de l'onglet
				tp.setSelectedIndex(1);

				// Si le coût final est inférieur au prix de la réservation (qui ne devrait
				// généralement pas l'être)
				// soit il affiche une boîte de dialogue de message, puis renvoie une erreur
				if (totFinal < Integer.parseInt(ReservPrix)) {
					throw new ArithmeticException("Une erreur a été détecté!");
				}
			}
			// Capture des exceptions arithmétiques
			catch (ArithmeticException arErr) {
				JOptionPane.showMessageDialog(Details, "Une erreur est survenu \n Reserver encore une fois !");
				// Afficher le cadre de réservation
				HotelRes ResInstance = new HotelRes();
				// Fermeture du cadre des détails de la réservation
				Details.setVisible(false);
			}
		});

		// Panel Deux bouton Next
		nextBtn2.addActionListener((ActionEvent e) -> {
			// Si tous les champs de ce panneau ne sont pas remplis, affiche la boîte de
			// dialogue de message
			if (firstNameField.getText().equals("") || lastNameField.getText().equals("")
					|| numField.getText().equals("") || ageField.getText().equals("")
					|| addressTexteChamps.getText().equals("") || Genre.getSelectedItem() == null) {
				JOptionPane.showMessageDialog(Details, "Veuillez entrer toutes les valeurs !");
			}
			// Sinon, change le panneau du l'onglet
			else {
				tp.setSelectedIndex(2);
			}
		});

		// Panel Trois bouton Next
		BtnReserv.addActionListener((ActionEvent e) -> {
			// Affichage de la boîte de dialogue indiquant que la réservation est réussie
			JOptionPane.showMessageDialog(Details, "Vous avez reservé " + ReservNom + " Pour €"
					+ totalPrixLabel.getText() + "!\n Regarder votre boîte mail pour avoir le reçu !");
			// Appel du cadre de réservation
			HotelRes ResInstance = new HotelRes();
			// Fermeture du cadre des détails de la réservation
			Details.setVisible(false);
		});


		// Définition de l'option des détails de la réservation
		Details.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Details.setLayout(null);
		Details.setVisible(true);
		Details.setLocationRelativeTo(null);

/*
			// Genre genre = (Genre) Genre.getSelectedItem();
			 String Nom = lastNameField.getText();
			 String Prenom = firstNameField.getText();
			 String cno = cnoField.getText();
			 String age = ageField.getText();
			 String adresse = addressTexteChamps.getText();
			 
			 controller.saveZakaznik(lastNameField, firstNameField, cnoField, ageField, addressTexteChamps);
			
			 JOptionPane.showMessageDialog(this, "Zclient", "SUCESS", JOptionPane.INFORMATION_MESSAGE);
		 
*/

	}

}
