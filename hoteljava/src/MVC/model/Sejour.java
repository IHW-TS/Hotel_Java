package MVC.model;


public class Sejour {

    public int prix_chambre;
    public int prix_minibar;
    public String date_debut;
    public String date_fin;
    public Reservation res;
    public Consomation cons;

    /**
     * 
     */
    public Sejour() {

    }

    public Sejour(int prix_chambre, int prix_minibar, String date_debut, String date_fin, Reservation res,
            Consomation cons) {
        super();
        this.prix_chambre = prix_chambre;
        this.prix_minibar = prix_minibar;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.res = res;
        this.cons = cons;
    }

    public int getPrix_chambre() {
        return prix_chambre;
    }

    public void setPrix_chambre(int prix_chambre) {
        this.prix_chambre = prix_chambre;
    }

    public int getPrix_minibar() {
        return prix_minibar;
    }

    public void setPrix_minibar(int prix_minibar) {
        this.prix_minibar = prix_minibar;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String dateDpt) {
        this.date_debut = dateDpt;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String dateRtn) {
        this.date_fin = dateRtn;
    }

    public Reservation getRes() {
        return res;
    }

    public void setRes(Reservation res) {
        this.res = res;
    }

    public Consomation getCons() {
        return cons;
    }

    public void setCons(Consomation cons) {
        this.cons = cons;
    }

    public String DebutSej() {
        String Sej = "\tDébut du Séjour"
                + "\r\n"
                + "\r\nStatut:\t  Début"
                + "\r\nDate:\t" + getDate_debut()
                + "\r\nPrix Chambre:\t" + getPrix_chambre()
                + "\r\nPrix Mini Bar:\t" + getPrix_minibar()
                + "\r\n";

        return Sej;
    }

    public String FinSej() {
        String Sej = "\tFin du Séjours"
                + "\r\n"
                + "\r\nStatus:\t  Fin"
                + "\r\nDate Fin:\t " + getDate_fin()
                + "\r\n";
                
        return Sej;
    }

}