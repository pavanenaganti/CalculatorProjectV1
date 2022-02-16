package com.pk.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//
		int num;
	    int num1, num2;
		Scanner reader = new Scanner(System.in);
		
		//System.out.println("Enter calculation number:");
		//num=reader.nextInt();

		System.out.println("Enter first number:");
		num1 = reader.nextInt();

		System.out.println("Enter second number:");
		num2 = reader.nextInt();
	
		

		CalculatorImpl calculatorImpl=new CalculatorImpl();
		
		calculatorImpl.addition(num1,num2);
		calculatorImpl.subtraction(num1,num2);
		calculatorImpl.multiplication(num1,num2);
		calculatorImpl.divsion(num1,num2);
		
		
		reader.close();

	}

}
