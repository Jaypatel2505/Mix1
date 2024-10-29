package com.assignment;
import java.util.Scanner;
/*
 * W.A.J.P to Take three numbers from the user and print the greatest number.
 */
public class GreatestNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//Input
			int num1, num2, num3;
			System.out.println("Enter the first number:");
			num1 = sc.nextInt();

			System.out.println("Enter the second number:");
			num2 = sc.nextInt();

			System.out.println("Enter the third number:");
			num3 = sc.nextInt();

			// Logic
			if (num1 >= num2 && num1 >= num3) {
			    System.out.println("Number 1 is Greatest");
			} else if (num2 >= num1 && num2 >= num3) {
			    System.out.println("Number 2 Is Greatest");
			} else {
			    System.out.println("Number 3 Is Greatest");
			}
		}
	}
}