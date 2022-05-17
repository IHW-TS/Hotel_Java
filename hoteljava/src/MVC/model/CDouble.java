package MVC.model;

/**
 * 
 */
public class CDouble extends Chambre {

   
    public int dprice;
    private String dnom;

    public CDouble(int numero, int etage, String type, Hotel hotel, String dnom, int dprice) {

        super(numero, etage, type, hotel);

        this.dnom = dnom;
        this.dprice = dprice;

    }


    public String getDnom() {
        return dnom;
    }

    public void setdnom (String dnom) {
        this.dnom = dnom;
    }

    public int getDprice() {
        return dprice;
    }

    public void setDprice(int dprice) {
        this.dprice = dprice;
    }

}