package com.simplilearn.phase1;

public class stringToPrimitive{	 
	   
	    public static void main(String[] args)
	    {
	 
	       String str="56";
	       try {
	    	   int number1 =Integer.parseInt(str);
	    	   System.out.println(number1);
	    	   float number2 =Float.parseFloat(str);
	    	   System.out.println(number2);
	    	   double number3 =Double.parseDouble(str);
	    	   System.out.println(number3);
	    	   long number4 =Long.parseLong(str);
	    	   System.out.println(number4);
	    	   short number5 =Short.parseShort(str);
	    	   System.out.println(number5);
	    	   
	       }
	       catch(NumberFormatException ex) {
	    	   ex.printStackTrace();
	       }
	    }
}
