package Primjeri;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = input.nextDouble();
		
		double gcd = 0;
		gcd = num1 < num2 ? num1 : num2;
		
		while(num1 % gcd != 0 || num2 % gcd != 0){
			gcd--;
		}
		
		System.out.println("The greatest common divisor for " + num1 +
				" and " + num2 + " is " + gcd);
	}

}
