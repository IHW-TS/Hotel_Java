package MVC.model;

public class Consomation {
    //crée les variables
    public int sandwich;
    public int coca;
    public int eau;
    public int chips;
    public Sejour sej;

    /**
     * 
     */
    public Consomation() {
    }
    Les lie à consommation
    public Consomation(int sandwich, int coca, int eau, int chips, Sejour sej) {
        super();
        this.sandwich = sandwich;
        this.coca = coca;
        this.eau = eau;
        this.chips = chips;
        this.sej = sej;

    }

    public int getSandwich() {
        return sandwich;
    }

    public void setSandwich(int sandwich) {
        this.sandwich = sandwich;
    }

    public int getCoca() {
        return coca;
    }

    public void setCoca(int coca) {
        this.coca = coca;
    }

    public int getEau() {
        return eau;
    }

    public void setEau(int eau) {
        this.eau = eau;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public Sejour getSej() {
        return sej;
    }

    public void setSej(Sejour sej) {
        this.sej = sej;

    }

}
