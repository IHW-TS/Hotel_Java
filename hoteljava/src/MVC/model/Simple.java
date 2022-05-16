package MVC.model;

/**
 * 
 */
public class Simple extends Chambre {


    public int sprice;
    private String snom;

    public Simple(int numero, int etage, String type, Hotel hotel, String snom, int sprice) {

        super(numero, etage, type, hotel);

        this.snom = snom;
        this.sprice = sprice;

    }


    public String getSnom() {
        return snom;
    }

    public void setSnom (String snom) {
        this.snom = snom;
    }

    public int getSprice() {
        return sprice;
    }

    public void setSprice(int sprice) {
        this.sprice = sprice;
    }
}