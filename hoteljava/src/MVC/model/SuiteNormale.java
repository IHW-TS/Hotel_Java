package MVC.model;


public class SuiteNormale extends Chambre {

    /**
     * Default constructor
     */


    public int stprice;
    private String stnom;

    public SuiteNormale(int numero, int etage, String type, Hotel hotel, String stnom, int stprice) {

        super(numero, etage, type, hotel);

        this.stnom = stnom;
        this.stprice = stprice;

    }

    public String getStnom() {
        return stnom;
    }

    public void setStnom (String stnom) {
        this.stnom = stnom;
    }

    public int getStprice() {
        return stprice;
    }

    public void setStprice(int stprice) {
        this.stprice = stprice;
    }



}