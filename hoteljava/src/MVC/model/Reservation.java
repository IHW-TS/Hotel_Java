package MVC.model;

import java.util.*;

/**
 * 
 */
public class Reservation {

    public Date date_debut;
    public Date date_fin;
    public Client client;
    public Sejour sej;
    public Chambre chambre;




    public Reservation(Date date_debut, Date date_fin, Client client, Sejour sej, Chambre chambre) {
    
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.client = client;
        this.sej = sej;
        this.chambre = chambre;
    }

    public Reservation(String string, String string2, String string3, String string4) {
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Sejour getSejour() {
        return sej;
    }

    public void setSejour(Sejour sej) {
        this.sej = sej;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

}