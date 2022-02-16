package com.pk.calculator;

public class CalculatorImpl {

	int result;

	public void addition(int num1, int num2) {
		result = num1 + num2;
		System.out.println("Addition result: " + result);

	}

	public void subtraction(int num1, int num2) {
		result = num1-num2;
		System.out.println("subtraction result: " + result);

	}

	public void multiplication(int num1, int num2) {
		result = num1 * num2;
		System.out.println("multiplication result: " + result);
		

	}

	public void divsion(int num1, int num2) {
		result = num1 / num2;
		System.out.println("divsion result: " + result);

	}
	
 
}
