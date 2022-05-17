package MVC.model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;


public class ClientInfo {
    private ArrayList<Client> arr;

    public ClientInfo() {
        arr = ClientInfo.getClients();
    }
    
    public boolean add(Client clt) {
        for(var x:arr)
            if(x.equals(clt) || clt.getTel()==x.getTel()) {
                JOptionPane.showMessageDialog(null, "Identifiant client disponible");
                return false;
            }
        arr.add(clt);
        return true;
    }
    
    public void add(String nom, String prenom, int age, String mail, int tel) {
        Client clt= new Client(nom, prenom, age, mail, tel);
        for(var x:arr)
            if(x.equals(clt) || clt.getTel()==x.getTel())
                return;
        arr.add(clt);
    }
    
    public void remove(int idNo) {
        for(var x:arr) {
            if(x.getTel()==idNo) {
                arr.remove(x);
                return;
            }
        }
    }
    
    public static ArrayList<Client> getClients(){
        ArrayList<Client> array = new ArrayList<>();
        try {
            File file = new File("Client.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String str;
            while ((str = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(str, "#");
                String nom=token.nextToken();
                String prenom=token.nextToken();
                int age=Integer.parseInt(token.nextToken());
                String mail=token.nextToken();
                int tel=Integer.parseInt(token.nextToken());
                Client cust=new Client(nom, prenom, age, mail, tel);
                array.add(cust);
            }
            reader.close();
        } catch (Exception e) {
        }
        return array;
    }
    
    public void save() {
        try {
            File file = new File("Client.txt");
            PrintWriter writer = new PrintWriter(file);
            for (var x : arr) {
                writer.write(x.getPrenom() + "#" +
                             x.getNom() +"#"+
                             x.getAge()+"#"+
                             x.getEmail()+"#"+
                             x.getTel()+"\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }
}
