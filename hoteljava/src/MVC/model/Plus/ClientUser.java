package MVC.model.Plus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

import MVC.vue.ClientPage;


public class ClientUser {


        
        File file = new File("./StaffList.txt");
        private String username, password, id;
        private boolean found = false;
        
        public ClientUser() throws Exception{ 
            file.createNewFile();
        }
        
        public void setStaffKeyInUsername(String nm) {
            username = nm;
        }
        
        public void setStaffKeyInPassword(String pss) {
            password = pss;
        }
        
        public String getStaffKeyInUsername() {
            return username;
        }
        
        public String getStaffKeyInPassword() {
            return password;
        }
        
        public void setIC(String idNum) {
            id = idNum;
        }
        
        public void LoginEvent() {
            try {
                FileReader fr = new FileReader("./ListClient.txt");
                BufferedReader br = new BufferedReader(fr);
                Vector<String>element = new Vector<String>();
                String line;
                int y=0;
                while((line = br.readLine()) != null) {
                    element.addElement(line);
                    y++;
                }
                String[][] id = new String[y][6];
                
                for(int i=0; i<y; i++) {
                    StringTokenizer st = new StringTokenizer(element.elementAt(i));
                    int z=0; 
                    while(st.hasMoreElements()) {
                        String word1 = st.nextToken();
                        id[i][z] = word1;
                        z++;
                    }
                }
                for(int i=0; i<y; i++) {
                    
                    if(username.equals(id[i][0]) && password.equals(id[i][1])) {
                        found = true;
                        JOptionPane.showMessageDialog(null,
                                "Vous avez réussit à vous enregistrer en tant que client !",
                                "Enregistrement Réussit",
                                JOptionPane.PLAIN_MESSAGE);
                        new ClientPage();
                    }
                }
                if(found ==false) {
                    JOptionPane.showMessageDialog(null,
                            "Identifiant invalide", "Enregistrement échoué", JOptionPane.ERROR_MESSAGE);	
                }
                br.close();
            } catch(IOException e) {
                
            }	
        }
        public String RechercherClient() throws IOException{
                
                FileReader fr = new FileReader("./ListClient.txt");
                BufferedReader br = new BufferedReader(fr);
                Vector<String>element = new Vector<String>();
                String line;
                int y=0;
                while((line = br.readLine()) != null) {
                    element.addElement(line);
                    y++;
                }
                fr.close();
                br.close();
                
                String[][] CInfo = new String[y][6];
                            
                for(int i=0; i<y; i++) {
                    StringTokenizer st = new StringTokenizer(element.elementAt(i));
                    int z=0; 
                    while(st.hasMoreElements()) {
                        String word1 = st.nextToken();
                        CInfo[i][z] = word1;
                        z++;
                    }	
                }
                for(int i=0; i<y; i++) {
                    
                    if(id.equals(CInfo[i][3])) {
                        
                        String nom = CInfo[i][2];
                        String id = CInfo[i][3];
                        String phone = CInfo[i][4];
                        String username = CInfo[i][0];
                        String password = CInfo[i][1];
                        
                        line =  "Nom " + nom +
                                "\nID : " + id +
                                "\nNumero: " + phone +
                                "\nUsername: " + username +
                                "\nPassword: " + password;
                    }
                }
                return line;
        }	
    



}
