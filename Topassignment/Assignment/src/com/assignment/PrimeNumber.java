package com.assignment;
import java.util.Scanner;
/*
 * W.A.J.P to check given number is Prime or not?
 */
public class PrimeNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number to check Prime or Not: ");
			int count = 0, pno;
			pno = sc.nextInt();
			for (int i = 2; i <= pno / 2; i++) {
			    if (pno % i == 0) {
			        count++;
			        break;
			    }
			}
			if (count == 0) {
			    System.out.println("This is prime number.");
			} else {
			    System.out.println("This is not a prime number");
			}
		}
    }
}