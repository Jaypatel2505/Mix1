package com.assignment;
/*
 * WAP to find the maximum and minimum value of an array.
 */
import java.util.Arrays;
import java.util.Scanner;
public class MinimumAndMaximumValue {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num[] = new int[5];
			// Get values and show values
			System.out.println("Enter the array values");
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}
			System.out.println();
			
			// Sorting array and get first and last value
			Arrays.sort(num);
			System.out.println("min value is:"+num[0]+" and maximum value is:"+num[num.length-1]);
		}
	}
}
