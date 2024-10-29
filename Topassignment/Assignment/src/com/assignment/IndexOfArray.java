package com.assignment;
import java.util.Scanner;
/*
 * WAP to find the index of an array element.
 */
public class IndexOfArray {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num[] = new int[5], s1;
			// Get values and show values
			System.out.println("Enter the array values");
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}
			System.out.println("The Array value is:");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+" ");
			}
			System.out.println();
			
			// Find index of value which inputed by user
			System.out.println("Enter number which find to index");
			s1 = sc.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (num[i] == s1 ) {
					System.out.println("Index of element " + s1 + ": " + i + "index");
				}
			}
		}
	}
}