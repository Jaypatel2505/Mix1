package com.assignment;
import java.util.Scanner;
/*
 * WAP to sum values of an array.
 */
public class SumOfArrayValues {
	public static void main(String[] args) {
		int sum = 0, avg = 0;
		try (Scanner sc = new Scanner(System.in)) {
			int num[] = new int[5];
			System.out.println("Enter the array values");
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
				sum += num[i];
			}		
			System.out.println("The sum of array is :"+sum);
			avg = sum / num.length;
		}
		System.out.println("The Average of array is :"+avg);
	}
}