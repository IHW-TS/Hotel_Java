package MVC.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;


public class PrixF {

	
	
	public double getPrice(String place) {
		double myPrice = 0.0;
		
		File file = new File("Prix.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			Vector<String>element = new Vector<String>();
			
			String line;
			
			int y=0;
			
			while((line = br.readLine()) != null) {
				element.addElement(line);
				y++;
			}
			br.close();
			String[][] PSej = new String[y][3];
			
			for(int i=0; i<y; i++) {
				StringTokenizer st = new StringTokenizer(element.elementAt(i));
				int z=0; 
				while(st.hasMoreElements()) {
					String word1 = st.nextToken();
					PSej[i][z] = word1;
					z++;
				}
			}
			
			for(int i=0; i<y; i++) {
				
				if(place.equalsIgnoreCase(PSej[i][0] + " - " + PSej[i][1]))
					myPrice = Double.parseDouble(PSej[i][2]);
				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return myPrice;
	}

}
