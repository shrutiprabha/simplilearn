package com.simplilearn.phase1;

public class arrays {

public static void main(String[] args) {

//single-dimensional array
int a[]= {1,2,3,4,5};
for(int i=0;i<5;i++) {
System.out.println("Elements of array : "+a[i]);
}


//multidimensional array
int b [][]  = {
            {1,2,3,4}, 
            {4,5,6} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}



