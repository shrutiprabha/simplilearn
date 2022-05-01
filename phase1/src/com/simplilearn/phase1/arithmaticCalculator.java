package com.simplilearn.phase1;

import java.util.Scanner;

public class arithmaticCalculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		double firstNumber = scanner.nextDouble();
		
		System.out.println("Enter the second number : ");
		double secondNumber = scanner.nextDouble();
		
		System.out.println("Enter the operation");
		System.out.println("For addition + ");
		System.out.println("For subtraction - ");
		System.out.println("For multiplication * ");
		System.out.println("For division / : ");
		
		char op = scanner.next().charAt(0);
		
		if(op == '+') {
			System.out.println("The summation of "+firstNumber+" and "+secondNumber+" = "+(firstNumber+secondNumber));
		}else if(op == '-') {
			System.out.println("The subtraction of "+firstNumber+" and "+secondNumber+" = "+(firstNumber-secondNumber));
		}else if(op == '*') {
			System.out.println("The multiplication of "+firstNumber+" and "+secondNumber+" = "+(firstNumber*secondNumber));
		}else if(op == '/') {
			System.out.println("The division of "+firstNumber+" and "+secondNumber+" = "+(firstNumber/secondNumber));
		}else {
			System.out.println("Invalid Input");
		}
	}

}
