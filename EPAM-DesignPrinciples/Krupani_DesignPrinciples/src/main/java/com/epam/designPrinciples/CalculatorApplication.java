package com.epam.designPrinciples;
import java.util.*;
public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<--------Calculator-------->");
		System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
		System.out.print("Enter your choice to perform(Enter integer value) : ");
		int choice = sc.nextInt();
		if(choice >= 1 && choice <= 4) {
			System.out.print("Enter first number : ");
			double num1 = sc.nextDouble();
			System.out.print("Enter second number : ");
			double num2 = sc.nextDouble();
			MathOperations mop = new MathOperations(num1, num2);
			switch(choice) {
			case 1 : mop.add();
					 break;
			case 2 : mop.sub();
					 break;
			case 3 : mop.multiply();
					 break;
			case 4 : mop.divide();
					 break;
			}
		}
		else {
			System.out.println("Invalid selection!!!");
		}
	}

}
