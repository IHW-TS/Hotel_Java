
package MVC.model;
import java.util.*;

/**
 * 
 */
public class Client {

    public String nom;
    public String prenom;
    public int age;
    public String email;
    public int tel;
    public Set<Reservation> listRes =  new HashSet<Reservation>();
    

    public Set<Reservation> getlistRes() {
        return listRes;
    }

    public void setlistRes(Set<Reservation> listRes) {
        this.listRes = listRes;
    }


    public Client(String nom, String prenom, int age, String email, int tel) {
        this.nom = nom; 
        this.prenom = prenom; 
        this.age = age;
        this.email = email;
        this.tel = tel;  

    }

    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
  


}