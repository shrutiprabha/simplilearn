package com.simplilearn.phase1;
import java.util.regex.*;    
import java.util.*;    

public class emailValidation {
	 public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("javaTpoint@domain.co.in");  
	        emails.add("javaTpoint@domain.com");  
	        emails.add("javaT-point#@domain.co.in");  
	        emails.add("javaT_point@domain.com");  
	        emails.add("javaTpoint@domaincom");  
	        emails.add("@yahoo.com");  
	        emails.add("12javaTpoint#domain.com");  
	        
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	          
	        Pattern pattern = Pattern.compile(regex);  
	        
	        for(String email : emails){  
	               
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  

}
