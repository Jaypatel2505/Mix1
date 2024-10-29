package com.assignment;

import java.util.Scanner;
/*
 * WAP to Copy one array into another
 */
public class CopyArraytoAnotherArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];		//	Copying A array to B array
		}

		System.out.println("A Array Values");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("B Array Values");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}