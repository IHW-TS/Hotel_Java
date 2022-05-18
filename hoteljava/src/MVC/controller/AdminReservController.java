package MVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import MVC.model.Client;
import MVC.model.Reservation;
import MVC.model.ClientInfo;
import MVC.vue.AdminRes;
import MVC.vue.AdminClient;
import MVC.vue.AdminPage;

public class AdminReservController implements ActionListener{
    
    private AdminRes Areserv;
    
    public AdminReservController(AdminRes adminRes) {
        Areserv = adminRes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AdminPage panel=new AdminPage();
        panel.setVisible(true);
        Areserv.dispose();
    }
    
    public void setTabel() {
        ArrayList<Client> arr= ClientInfo.getClients();
        Areserv.setTable();
        DefaultTableModel model = (DefaultTableModel) Areserv.getTable().getModel();
        for(var x:arr)
            model.addRow(new Object[]{x.getPrenom(),x.getNom(),x.getAge(),x.getEmail(),x.getTel()});
    }

}



