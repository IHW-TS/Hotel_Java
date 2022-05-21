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


}
