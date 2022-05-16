package MVC.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;




public class Readfile {

	private JTextArea area;
	
	public void readFile(String date,String time, String fil) throws IOException{
		
		
		FileReader reader = new FileReader("Data\\"+date+"\\"+time+"\\"+fil+".txt");
		BufferedReader read = new BufferedReader(reader);
		String str = new String();

		while ((str = read.readLine())!=null){
			area.append(str+"\n");
		}
		
		reader.close();
		
	}
	
}