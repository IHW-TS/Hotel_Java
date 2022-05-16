package MVC.controller.V1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import MVC.vue.*;
import MVC.vue.V1.Gsejour2;

public class Csejour implements ActionListener {

	public void actionPerfomed(ActionEvent e) {
		if(((JButton)e.getSource()).getText().equals("\"valider le s�jour")){
			new Gsejour2();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
