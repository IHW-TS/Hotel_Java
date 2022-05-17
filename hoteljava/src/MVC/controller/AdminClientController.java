package MVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import MVC.model.Client;
import MVC.model.ClientInfo;
import MVC.vue.AdminClient;
import MVC.vue.AdminPage;

public class AdminClientController implements ActionListener{
    
    private AdminClient Aclient;
    
    public AdminClientController(AdminClient customerView) {
        Aclient = customerView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AdminPage panel=new AdminPage();
        panel.setVisible(true);
        Aclient.dispose();
    }
    
    public void setTabel() {
        ArrayList<Client> arr= ClientInfo.getClients();
        Aclient.setTable();
        DefaultTableModel model = (DefaultTableModel) Aclient.getTable().getModel();
        for(var x:arr)
            model.addRow(new Object[]{x.getPrenom(),x.getNom(),x.getAge(),x.getEmail(),x.getTel()});
    }

}



