package MVC.vue;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import MVC.model.Reservation;
import MVC.model.Client;


public class GchambreStatique extends AbstractTableModel{
	
    private final ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    private final String[] entetes = {"Prénom", "Nom", "type de chambre réservée", "Date"};
    
	public GchambreStatique() {
		super();
	                reservations.add(new Reservation ("Johnathan", "Sykes","chambre double", "25/03/23"));
	                reservations.add(new Reservation ("Nicolas", "Van de Kampf", "chambre simple", "9/07/23"));
	                reservations.add(new Reservation ("Damien", "Cuthbert", "Chambre présidentielle", "15/08/23"));
	  
	}
	
	 
    public int getRowCount() {
        return reservations.size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
               return reservations.get(rowIndex).getPrenom();
            case 1:
               return reservations.get(rowIndex).getNom();
            case 2:
               return reservations.get(rowIndex).getTypeChambre();
            case 3:
               return reservations.get(rowIndex).getDateA();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    public void addReserv(Reservation reservation) {
        reservations.add(reservation);
 
        fireTableRowsInserted(reservations.size() -1, reservations.size() -1);
    }
    
    public void removeReserv(int rowIndex) {
        reservations.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

}
