package MVC.model.Plus;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;


public class AdminUser { // admin object (username, password)
	
	private String adminUsername;
	private String adminPwd;
	
	File file = new File("./Admin.txt");
	
	public AdminUser() throws Exception{
		
		file.createNewFile();
		readAdminLogin();
	}
	
	public void setAdminName(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	
	public String getAdminName() {
		return adminUsername;
	}
	
	public void setAdminPassword(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	
	public String getAdminPassword() {
		return adminPwd;
	}
	
	public void readAdminLogin() throws Exception{
			
		try {
			FileReader fr = new FileReader(file); //Lit l'identifiant Admin et le mot de passe a partir du fichier texte 
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine()) != null) {
				String[] arr = line.split("\\,");
					setAdminName(arr[0]);
					setAdminPassword(arr[1]);
			}
			br.close();
		} catch(IOException e) {
			
		}
	}
	public String displayRoutesAvailable() throws Exception{
		String line2 = "All Available Route\n\n";
		try {
			String sdeb, sfin, sprix;
			FileReader fr = new FileReader("./patternplace.txt");
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
			
			String[][] inf = new String[y][3];
						
			for(int i=0; i<y; i++) {
				StringTokenizer st = new StringTokenizer(element.elementAt(i));
				int z=0; 
				while(st.hasMoreElements()) {
					String word1 = st.nextToken();
					inf[i][z] = word1;
					z++;
				}
			}
			String allSej[] = new String[y];
			
			for(int i=0; i<y; i++) {
							
				sdeb = inf[i][0];
				sfin = inf[i][1];
				sprix = inf[i][2];
					
					
				allSej[i] = "  Client ID: " + (i + 1) +
							   "\nDate début: " + sdeb +
						       "\nDate fin : " + sfin +
							   "\nPrix: RM" + sprix+
							   "\n\n";
					
				 line2 += allSej[i];
			}
		}
		catch(Exception E) {
		}
		return line2;
	}
	public String displayTimeAvailable() throws Exception{
		String line2 = "\tDate disponible\n\n";
		try {
			String tmp;
			FileReader fr = new FileReader("./patternset.txt"); 
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
			
			String[] stmp = new String[y];
						
			for(int i=0; i<y; i++) {
				StringTokenizer st = new StringTokenizer(element.elementAt(i));
				int z=0; 
				while(st.hasMoreElements()) {
					String word1 = st.nextToken();
					stmp[i] = word1;
					z++;
				}
			}
			String allTime[] = new String[y];
			
			for(int i=0; i<y; i++) {
							
				tmp = stmp[i];					
					
				allTime[i] = "Temps ID : " + (i + 1) +
							"\nTemps : " + tmp + "\n\n";
					
				 line2 += allTime[i];
			}
		}
		catch(Exception E) {
			
		}
		return line2;
	}

}
