package MVC.controller;

import java.io.*;


public class Mdate {

	private String date, time;
	private int people;
	
	public void createFolder(String dateF ,String timeF){
	this.date = dateF;
	this.time = timeF;
	    File cr = new File("Data\\"+date);
	    cr.mkdir();
		File create = new File("Data\\"+date+"\\"+time);
		create.mkdir();
	}
	
	public void file(String fileName,String writeData)throws IOException{

		File file = new File("Data\\"+date+"\\"+time+"\\"+fileName+".txt");
		
		FileWriter fw = new FileWriter(file);
		
		fw.write(writeData);
		fw.flush();
		fw.close();
		}
	
	
	public int countFile(String folder,String path){
		try{
		File count = new File("Data\\"+folder+"\\"+path);
		people = count.list().length;
		
		}catch(NullPointerException e){
			e.getMessage();
		}return people;
	}


}
