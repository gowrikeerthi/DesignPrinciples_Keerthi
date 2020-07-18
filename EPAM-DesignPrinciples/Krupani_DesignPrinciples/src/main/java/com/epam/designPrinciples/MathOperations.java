package com.epam.designPrinciples;
public class MathOperations {
	double num1, num2;

	public MathOperations(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		System.out.println("Addition of " + num1 + " and " + num2 + " is : " + (num1 + num2));
	}
	public void sub() {
		System.out.println("Subraction of " + num1 + " and" + num2 + " is : " + (num1 - num2));
	}
	public void multiply() {
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + (num1 * num2));
	}
	public void divide() {
		if(num2 == 0.0) 
			throw new ArithmeticException("Division by zero occured!\nEnter valid number for num2!!!");
		System.out.println("Division of " + num1 + " and " + num2 + " is : " + (num1 / num2));
	}
}
