
package MVC.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Hotel {

    public int nb_chambre;
    public int nb_etage;
    public int nb_chambre_disponible;
    public ArrayList<Chambre> arr = new ArrayList<Chambre>();

    /*
     * public Set<Chambre> listChambre = new HashSet<Chambre>();
     * 
     * public Set<Chambre> getlistChambre() {
     * return listChambre;
     * }
     * 
     * public void setlistChambre(Set<Chambre> listChambre) {
     * this.listChambre = listChambre;
     * }
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

    public void addRoom(Simple simple) {
        for (var x : arr) {
            if (x.equals(simple))
                return;
        }
        arr.add(simple);
    }

    public void addRoom(CDouble ddouble) {
        for (var x : arr) {
            if (x.equals(ddouble))
                return;
        }
        arr.add(ddouble);
    }

    public void addRoom(SuiteNormale sn) {
        for (var x : arr) {
            if (x.equals(sn))
                return;
        }
        arr.add(sn);
    }

    public void addRoom(SuitePresidentiel sp) {
        for (var x : arr) {
            if (x.equals(sp))
                return;
        }
        arr.add(sp);
    }

    public void deleteRoom(int roomNo) {
        for (var x : arr) {
            if (x.getNumero() == roomNo) {
                arr.remove(x);
                break;
            }
        }
    }

    public boolean searchRoom(Chambre room) {
        return arr.contains(room);
    }

    public void display() {
        for (var room : arr) {
            System.out.println(room);
        }
    }

    public static ArrayList<Chambre> getRooms() {
        ArrayList<Chambre> array = new ArrayList<Chambre>();
        try {
            File file = new File("ChambreGestion.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String str;
            while ((str = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(str, "#");
                int num = Integer.parseInt(token.nextToken());
                String st = token.nextToken();
                if (st.equals("Normal")) {
                    array.add(new Simple(num, num, st, null, st, num));
                } else if (st.equals("Double")) {
                    array.add(new CDouble(num, num, st, null, st, num));
                } else if (st.equals("Suite Présidentiel")) {
                    array.add(new SuitePresidentiel(num, num, st, null, st, num));
                } else if (st.equals("Suite Normale")) {
                    array.add(new SuiteNormale(num, num, st, null, st, num));
                }
            }
            reader.close();
        } catch (Exception e) {
        }
        return array;
    }

    public void save() {
        try {
            File file = new File("ChambreGestion.txt");
            PrintWriter writer = new PrintWriter(file);
            for (var x : arr) {
                writer.write(x.getNumero() + "#" + x.getType() + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }
}
