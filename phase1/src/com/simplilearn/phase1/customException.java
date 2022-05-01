package com.simplilearn.phase1;


	class MyyException extends Exception 
	{ 
	    public MyyException(String s) 
	    { 
	        super(s); 
	    } 
	} 
	public class customException 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new MyException("temp"); 
	        } 
	        catch (MyException ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}

