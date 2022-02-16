package com.pk.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		double num1, num2, result;
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter first number:");
		num1 = reader.nextDouble();

		System.out.println("Enter second number:");
		num2 = reader.nextDouble();

		char operator; // selcting the operation
		System.out.println("choose an operator + - * / :");
		operator = reader.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num1 + " = " + result);
			break;

		case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + " = " + result);
			break;

		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + " = " + result);
			break;

		case '/':
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + result);
			break;

		default:
			System.out.println("invalid operator");
			break;
		}

	}

}