package MVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MVC.model.Hotel;
import MVC.model.Simple;
import MVC.model.CDouble;
import MVC.model.SuiteNormale;
import MVC.model.SuitePresidentiel;
import MVC.model.Chambre;
//import MVC.view.MainPanel;

import MVC.vue.AdminChambre;
import MVC.vue.AdminPage;
import MVC.vue.AdminRes;

public class AdminControllerChambre implements ActionListener {

    private Hotel hotel;
    private AdminChambre room;

    public AdminControllerChambre(AdminChambre roomView) {
        this.room = roomView;
        hotel = new Hotel(0, 0, 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var source = e.getSource();
        if (source instanceof JRadioButton) {
            room.getSimple().setSelected(true);
            room.getDouble().setSelected(true);
            room.getSN().setSelected(true);
            room.getSP().setSelected(true);
            if (source.equals(room.getSP())) {
                room.getDouble().setSelected(false);
                room.getSimple().setSelected(false);
                room.getSN().setSelected(false);
            } else if (source.equals(room.getSN())) {
                room.getSP().setSelected(false);
                room.getDouble().setSelected(false);
                room.getSimple().setSelected(false);
            } else if (source.equals(room.getDouble())) {
                room.getSP().setSelected(false);
                room.getSimple().setSelected(false);
                room.getSN().setSelected(false);
            } else if (source.equals(room.getSimple())) {
                room.getDouble().setSelected(false);
                room.getSP().setSelected(false);
                room.getSN().setSelected(false);
            }
        }
        if (source instanceof JButton) {
            if (source.equals(room.getAdd())) {
                addRoom();
            }else if(source.equals(room.getSupr())){
                removeRoom();
            }else if(source.equals(room.getMain())) {
                AdminPage panel= new AdminPage();
                room.dispose();
            }
        }
    }

    private void removeRoom() {
        hotel.deleteRoom(room.getNumero());
        hotel.save();
        setTable();
    }

    private void addRoom() {
        if(room.getSimple().isSelected()){

            hotel.addRoom(new Simple(room.getNumero(), 0, null, hotel, null, 0));
        }
        else if(room.getDouble().isSelected()){

           hotel.addRoom(new CDouble(room.getNumero(), 0, null, hotel, null, 0));
        }
        else if(room.getSN().isSelected()){

           hotel.addRoom(new SuiteNormale(room.getNumero(), 0, null, hotel, null, 0));

        }  else if(room.getSP().isSelected()){
            
            hotel.addRoom(new SuitePresidentiel(room.getNumero(), 0, null, hotel, null, 0));
        }
        hotel.save();
        setTable();
    }

    public void setTable() {
        ArrayList<Chambre> list = Hotel.getRooms();
        room.setTable();
        JTable table = room.getTable();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int i = 1;
        for (var x : list) {
            model.addRow(new Object[] { i++, x.getNumero(), x.getType() });
        }
    }

}



