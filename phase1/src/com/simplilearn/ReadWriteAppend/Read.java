package com.simplilearn.ReadWriteAppend;

import java.io.*;

class Read {
	public static void main(String[] args) throws IOException{
		
		try {
			File obj=new File("E:\\Projectwork\\shruti.txt");
			FileReader fir = new FileReader(obj);
			char c[]=new char[5];
			fir.read(c);
			for(char k:c) {
				System.out.println(k);
				
			}
			fir.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
			
		}
		
	}


