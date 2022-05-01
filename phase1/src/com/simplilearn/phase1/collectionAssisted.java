package com.simplilearn.phase1;

import java.util.*;

public class collectionAssisted {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Delhi");//
	      city.add("Odisha");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(12); 
	      vec.addElement(15); 
	      System.out.println(vec);
		
		
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("harry");  
	      names.add("namrata");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(11);  
	       set.add(12);
	       set.add(13);
	       System.out.println(set);
	       
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(111);  
	       set2.add(131);  
	       set2.add(121);
	       set2.add(141);	       
	       System.out.println(set2);
	      	} 
	      }  
	}




