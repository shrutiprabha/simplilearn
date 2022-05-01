package com.simplilearn.ReadWriteAppend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String[] args) throws IOException{
		try {
			File obj = new File("E:\\Projectwork\\shruti1.txt");
			FileWriter fiw= new FileWriter(obj);
			char c[]= {'s','a','t'};
			fiw.write(c);
			fiw.close();
			System.out.println("File writing successful");
			
			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}
	}
	

}
