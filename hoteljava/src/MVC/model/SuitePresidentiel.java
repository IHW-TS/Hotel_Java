package MVC.model;

public class SuitePresidentiel extends Chambre {

    /**
     * Default constructor
     */

    public int spprice;
    private String spnom;

    public SuitePresidentiel(int numero, int etage, String type, Hotel hotel, String spnom, int spprice) {

        super(numero, etage, type, hotel);

        this.spnom = spnom;
        this.spprice = spprice;

    }

    public String getSpnom() {
        return spnom;
    }

    public void setSpnom(String spnom) {
        this.spnom = spnom;
    }

    public int getSpprice() {
        return spprice;
    }

    public void setSprice(int spprice) {
        this.spprice = spprice;
    }

}