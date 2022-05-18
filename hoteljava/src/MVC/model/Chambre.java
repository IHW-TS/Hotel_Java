
package MVC.model;

import java.util.*;

public class Chambre {
    //crée les différentes variables
    public int numero;
    public int etage;
    public String type;
    public Set<Reservation> listRes = new HashSet<Reservation>();
    public Hotel hotel;

    public Set<Reservation> getlistRes() {
        return listRes;
    }

    public void setlistRes(Set<Reservation> listRes) {
        this.listRes = listRes;
    }

    /**
     * 
     */
    //crée les données de chambre
    public Chambre(int numero, int etage, String type, Hotel hotel) {
        this.numero = numero;
        this.etage = etage;
        this.type = type;
        this.hotel = hotel;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


/*
     // Check si la chambre existe 
    static boolean ChambreExist(int num, Hotel hotel) {
        boolean exists = false;
        for (Chambre room : hotel.getlistChambre()) {
            if (room.getNumero() == num) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    // Suprime une chambre existante 
    static void deleteChambre(Hotel hotel, int num) {
        for (Chambre room : hotel.getlistChambre()) {
            if (room.getNumero() == num) {
                hotel.deleteChambre(room);
                break;
            }
        }
    }
    */
}
