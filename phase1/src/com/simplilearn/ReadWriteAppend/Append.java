package com.simplilearn.ReadWriteAppend;

import java.io.*;
import java.util.*;

public class Append {
	public static void main(String[] args) {
		try {
			File obj=new File("E:\\Projectwork\\shruti1.txt");
			if(obj.exists()==false)
			{
				if(obj.createNewFile())
				{
					System.out.println("File created successfully");
				}
				else {
					System.out.println("File creation failed!!!!");
					System.exit(0);
				}
				String text;
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter text to write into file:");
				text=sc.nextLine();
				FileOutputStream fileOut=new FileOutputStream(obj,true);
				fileOut.write(text.getBytes());
				fileOut.close();
				System.out.println("File saved");
				
			}}
			catch(Exception e) {
				System.out.println("Exception:"+ e.toString());
			}
		}
	}


