
package MVC.model;

import java.util.*;

public class Hotel {

    public int nb_chambre;
    public int nb_etage;
    public int nb_chambre_disponible;
    public Set<Chambre> listChambre = new HashSet<Chambre>();

    public Set<Chambre> getlistChambre() {
        return listChambre;
    }

    public void setlistChambre(Set<Chambre> listChambre) {
        this.listChambre = listChambre;
    }

    /**
     * 
     */
 

    public Hotel(int nb_chambre, int nb_etage, int nb_chambre_disponible) {

        this.nb_chambre = nb_chambre;
        this.nb_etage = nb_etage;
        this.nb_chambre_disponible = nb_chambre_disponible;

    }

    public int getNb_chambre() {
        return nb_chambre;
    }

    public void setNb_chambre(int nb_chambre) {
        this.nb_chambre = nb_chambre;
    }

    public int getNb_etage() {
        return nb_etage;
    }

    public void setNb_etage(int nb_etage) {
        this.nb_etage = nb_etage;
    }

    public int getNb_chambre_disponible() {
        return nb_chambre_disponible;
    }

    public void setNb_chambre_disponible(int nb_chambre_disponible) {
        this.nb_chambre_disponible = nb_chambre_disponible;
    }

}